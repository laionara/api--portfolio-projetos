CREATE SCHEMA IF NOT EXISTS 'portfolio' DEFAULT CHARACTER SET utf8;
USER 'user';

CREATE TABLE pessoa (
	id BIGINT AUTO_INCREMENT NOT NULL,
	nome character varying(100) NOT NULL,
	datanascimento date,
	cpf character varying(14),
	funcionario BOOLEAN,
CONSTRAINT pk_pessoa PRIMARY KEY (id));

CREATE TABLE projeto (
	id BIGINT AUTO_INCREMENT NOT NULL,
	nome VARCHAR(200) NOT NULL,
	data_inicio DATE ,
	data_previsao_fim DATE ,
	data_fim DATE ,
	descricao VARCHAR(5000) ,
	status VARCHAR(45) ,
	orcamento FLOAT ,
	risco VARCHAR(45) ,
	id_gerente BIGINT NOT NULL,
CONSTRAINT pk_projeto PRIMARY KEY (id),
CONSTRAINT fk_gerente FOREIGN KEY (id_gerente)
REFERENCES pessoa (id) MATCH SIMPLE ON UPDATE NO ACTION ON DELETE NO ACTION);

CREATE TABLE membros (
	idprojeto BIGINT NOT NULL,
	idpessoa BIGINT NOT NULL,
CONSTRAINT pk_projeto_pessoa PRIMARY KEY (idprojeto,idpessoa),
CONSTRAINT fk_membros_projeto FOREIGN KEY (idprojeto) REFERENCES projeto (id) MATCH SIMPLE ON UPDATE NO ACTION ON DELETE NO ACTION,
CONSTRAINT fk_membros_pessoa FOREIGN KEY (idpessoa) REFERENCES pessoa (id) MATCH SIMPLE ON UPDATE NO ACTION ON DELETE NO ACTION);