INSERT INTO permissao VALUES (1, 'ROLE_CADASTRAR_CIDADE');
INSERT INTO permissao VALUES (2, 'ROLE_CADASTRAR_USUARIO');

insert into grupo_permissao (codigo_grupo, codigo_permissao) values (1,1);
insert into grupo_permissao (codigo_grupo, codigo_permissao) values (1,2);

insert into usuario_grupo(codigo_usuario, codigo_grupo) values (
	(select codigo from usuario where email = 'wilson@brewer.com'), 1);