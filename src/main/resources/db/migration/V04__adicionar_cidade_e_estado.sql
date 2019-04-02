create table estado(
	codigo BIGINT(20) PRIMARY KEY,
	nome VARCHAR(50) NOT NULL,
	sigla VARCHAR(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE cidade(
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) not null,
	codigo_estado BIGINT(20) NOT NULL,
	FOREIGN KEY (codigo_estado) REFERENCES estado(codigo)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO estado (codigo,nome, sigla) VALUES(1,'São Paulo', 'SP');
INSERT INTO estado (codigo,nome, sigla) VALUES(2,'Belo Horizonte', 'MG');
INSERT INTO estado (codigo,nome, sigla) VALUES(3,'Pará', 'PA');

INSERT INTO cidade (nome, codigo_estado) VALUES('Guarulhos', 1);
INSERT INTO cidade (nome, codigo_estado) VALUES('Campinas', 1);
INSERT INTO cidade (nome, codigo_estado) VALUES('São Bernardo do Campo', 1);
INSERT INTO cidade (nome, codigo_estado) VALUES('Santo André', 1);
INSERT INTO cidade (nome, codigo_estado) VALUES('São José dos Campos', 1);
INSERT INTO cidade (nome, codigo_estado) VALUES('Osasco', 1);
INSERT INTO cidade (nome, codigo_estado) VALUES('Ribeirão Preto', 1);
INSERT INTO cidade (nome, codigo_estado) VALUES('Sorocaba', 1);
INSERT INTO cidade (nome, codigo_estado) VALUES('Mauá', 1);


INSERT INTO cidade (nome, codigo_estado) VALUES('Uberlândia', 2);
INSERT INTO cidade (nome, codigo_estado) VALUES('Contagem', 2);
INSERT INTO cidade (nome, codigo_estado) VALUES('Juiz de Fora', 2);
INSERT INTO cidade (nome, codigo_estado) VALUES('Betim', 2);
INSERT INTO cidade (nome, codigo_estado) VALUES('Montes Claros', 2);
INSERT INTO cidade (nome, codigo_estado) VALUES('Ribeirão das Neves',2);
INSERT INTO cidade (nome, codigo_estado) VALUES('Uberaba',2);
INSERT INTO cidade (nome, codigo_estado) VALUES('Governador Valadares', 2);
INSERT INTO cidade (nome, codigo_estado) VALUES('Ipatinga', 2);


INSERT INTO cidade (nome, codigo_estado) VALUES('Ananindeua', 3);
INSERT INTO cidade (nome, codigo_estado) VALUES('Santarém', 3);
INSERT INTO cidade (nome, codigo_estado) VALUES('Marabá', 3);
INSERT INTO cidade (nome, codigo_estado) VALUES('Santo André', 3);
INSERT INTO cidade (nome, codigo_estado) VALUES('Parauapebas', 3);
INSERT INTO cidade (nome, codigo_estado) VALUES('Castanhal', 3);
INSERT INTO cidade (nome, codigo_estado) VALUES('Abaetetuba', 3);
INSERT INTO cidade (nome, codigo_estado) VALUES('Cametá', 3);
INSERT INTO cidade (nome, codigo_estado) VALUES('Marituba', 3);