CREATE DATABASE ej4 character set utf8;
set default_storage_engine=INNODB;
USE ej4;

CREATE TABLE CLIENTES (
idCliente char(10) not null,
apellidoCliente char(15) not null,
PRIMARY KEY (idcliente) );

CREATE TABLE PEDIDOS (
idPedido char(10) not null,
idCliente char(10) not null,
notasPedido char(20) not null,
PRIMARY KEY (idPedido),
CONSTRAINT r2 foreign key (idCliente) REFERENCES CLIENTES(idCliente) on delete cascade );
