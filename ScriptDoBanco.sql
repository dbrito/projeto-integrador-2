create database dbEletronicos;

use dbEletronicos;

CREATE TABLE Cliente (
id integer auto_increment,
nome VARCHAR(30),
cpf int(30),
dataNascimento date,
endereco varchar (30),
numero int (30),
complemento varchar(30),
bairro varchar(30),
cep varchar(30),
cidade varchar(30),
estado varchar(30),
telefone varchar (30),
email varchar(30),
PRIMARY KEY (id)
);


CREATE TABLE Venda (
id integer (30) auto_increment,
Data date,
primary key (id),
foreign key (id) references Cliente (id)

);


CREATE TABLE ItemVenda (
id integer auto_increment,
quantidade int (30),
PRIMARY KEY(id),
FOREIGN KEY(id) REFERENCES Venda (id),
FOREIGN KEY(id) REFERENCES Produto (id)
);

CREATE TABLE Produto (
id integer auto_increment,
codigo character,
nome  varchar (30),
marca VARCHAR(20),
preco double,
quantidade int,
categoria varchar (30) ,
descricao varchar(30),
PRIMARY KEY (id)
);

drop database dbeletronicos;



