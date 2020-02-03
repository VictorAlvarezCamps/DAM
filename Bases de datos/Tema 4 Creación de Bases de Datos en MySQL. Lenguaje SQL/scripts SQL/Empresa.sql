/*Victor Alvarez Camps*/

CREATE DATABASE Empresa;
set default_storage_engine = INNODB;
USE Empresa;

CREATE TABLE productos (
Idfab char(3) not null,
Idproducto char(5) not null,
Descripcion char(20) not null,
Precio decimal not null,
Existencias integer not null,
PRIMARY KEY (Idfab,Idproducto)  );

CREATE TABLE pedidos (
Numpedido integer not null,
Fechapedido date not null,
Clie integer not null,
Rep integer not null,
Fab char(3) not null,
Producto char(3) not null,
Cant integer not null,
Importe decimal not null,
PRIMARY KEY (Numpedido),
FOREIGN KEY (Fab) REFERENCES productos (Idfab) );

CREATE TABLE repventas (
Numempl integer not null,
Nombre char(15) not null,
Edad integer null,
Oficinarep integer not null,
Titulo char(10) null,
Contrato date not null,
Director integer not null,
Cuota decimal null,
Ventas decimal not null,
PRIMARY KEY (Numempl),
FOREIGN KEY (Director) REFERENCES repventas (Numempl) );

CREATE TABLE clientes (
Numclie integer not null,
Empresa char(20) not null,
Repclie integer not null,
Limitecredito decimal null,
PRIMARY KEY (Numclie),
FOREIGN KEY (Repclie) REFERENCES repventas (Numempl) );

CREATE TABLE oficinas (
oficina integer not null,
Ciudad char(15) not null,
Region char(10) not null,
Dir integer not null,
Objetivo decimal null,
Ventas decimal not null,
PRIMARY KEY (Oficina),
FOREIGN KEY (Dir) REFERENCES repventas (Numempl) );

alter table repventas add foreign key (Oficinarep) references oficinas(oficina);
alter table pedidos add foreign key (Clie) references clientes(Numclie);
alter table pedidos add foreign key (Rep) references repventas(Numempl);
