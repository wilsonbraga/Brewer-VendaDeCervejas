package com.algaworks.brewer.storage.local;

import static java.nio.file.FileSystems.getDefault;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.algaworks.brewer.storage.FotoStorage;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.name.Rename;

@Profile("local")
@Component
public class FotoStorageLocal  implements FotoStorage{

	private static final Logger logger = LoggerFactory.getLogger(FotoStorageLocal.class);
	private static final String THUMBNAIL_PREFIX = "thumbnail.";
	
	private Path local ;
	
	public FotoStorageLocal() {
		this(getDefault().getPath(System.getenv("Home"), ".brewerfotos"));
		criarPasta();
	}
	
	public FotoStorageLocal(Path path){
		this.local = path;
		criarPasta();
	}
	
	@Override
	public String salvar(MultipartFile[] files) {
		String 	novoNome = null;
		if (files != null && files.length > 0){
			MultipartFile arquivo = files[0];
			novoNome = renomearArquivo(arquivo.getOriginalFilename());
			try {
				arquivo.transferTo(new File(this.local.toAbsolutePath().toString() + getDefault().getSeparator()+ novoNome));
			} catch ( IOException e) {
				throw  new RuntimeException("Erro salvando a foto	", e); 
			}
		}
		
		//depois que salvar gerar o Thumbnails "Redimencionar foto".
			try {
				Thumbnails.of(this.local.resolve(novoNome).toString()).size(40, 68).toFiles(Rename.PREFIX_DOT_THUMBNAIL);
			} catch (IOException e) {
				throw new RuntimeException("Erro gernado Thumbnail", e);
			}
			
		return novoNome;	
	}
	
	//Recupar foto do local final para mostrar na Pesquisa de cervejas
	@Override
	public byte[] recuperar(String nome) {
		try {
			return Files.readAllBytes(this.local.resolve(nome));
		} catch (IOException e) {
			throw new RuntimeException("Erro lendo a foto", e);
		}
	}
	
	@Override
	public byte[] recuperarThumbnail(String fotoCerveja) {
		return recuperar(THUMBNAIL_PREFIX + fotoCerveja);
	}
	
	//excluri foto ao exluir a cerveja
	@Override
	public void excluir(String foto) {
		try {
			Files.deleteIfExists(this.local.resolve(foto));
			Files.deleteIfExists(this.local.resolve(THUMBNAIL_PREFIX + foto));
		} catch (IOException e) {
			logger.warn(String.format("Erro apagando foto '%s'. Mensagem: %s", foto, e.getMessage()));
		}
	}
	

	@Override
	public String getUrl(String foto) {
		return "http://localhost:8080/brewer/fotos/" + foto;
	}
		
	private void criarPasta() {
		try {
			Files.createDirectories(this.local);
			if(logger.isDebugEnabled()){
				logger.debug("Pasta criada para salvar fotos.");
				logger.debug("Pasta defalt:" + this.local.toAbsolutePath());
			}
			
		} catch (IOException e) {
			
			throw new RuntimeException("Erro criando pasta para salvar foto", e);
		}
		
	}
	
}
