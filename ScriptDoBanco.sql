create database dbEletronicos;

use dbEletronicos;

CREATE TABLE Cliente (
id INT NOT NULL,
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
id int (30),
data date,
primary key (id),
foreign key (id) references Cliente (id)

);


CREATE TABLE ItemVenda (
id int not null,
codigo int not null,
quantidade int (30),
PRIMARY KEY(id, codigo),
FOREIGN KEY(id) REFERENCES Venda (id),
FOREIGN KEY(codigo) REFERENCES Produto (codigo)
);

CREATE TABLE Produto (
codigo INT NOT NULL,
nome  varchar (30),
marca VARCHAR(20),
preco double,
quantidade int,
categoria varchar (30) ,
descricao varchar(30),
PRIMARY KEY (codigo)
);



