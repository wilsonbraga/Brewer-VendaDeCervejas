CREATE TABLE cliente(
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(80) NOT NULL,
	tipo_pessoa VARCHAR(15) NOT NULL,
	cpf_cnpj VARCHAR(30) NOT NULL,
	telefone VARCHAR(20),
	email VARCHAR(50) NOT NULL,
	logradouro VARCHAR(50),
	numero VARCHAR(15),
	complemento VARCHAR(20),
	cep VARCHAR(15),
	codigo_cidade BIGINT(20),
	FOREIGN KEY (codigo_cidade) REFERENCES cidade(codigo)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


insert into cliente (nome,tipo_pessoa, cpf_cnpj, telefone, email, logradouro, numero, complemento,
	cep, codigo_cidade
)values('Jaqueline','FISICA','17120955284','(99)99999-9999','mundovirtualcameta@gmail.com','santa maria','111','nada', '68.400-000', 1);