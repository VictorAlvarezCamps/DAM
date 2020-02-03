/*Victor Alvarez Camps*/

CREATE DATABASE empleados character set utf8;
set default_storage_engine=INNODB;
USE empleados;

CREATE TABLE oficio (
Oficio char(25) not null,
Descripción char(30) not null,
PRIMARY KEY (Oficio) );

CREATE TABLE oficioempleado (
Nombre char(25) not null,
Calificación char(15) not null,
Oficio char(25) not null,
PRIMARY KEY (Nombre,Oficio) );

CREATE TABLE empleado (
Nombre char(25) not null,
Edad decimal not null,
Alojamiento char(15) not null,
PRIMARY KEY (Nombre) );

CREATE TABLE vivienda (
Alojamiento char(15) not null,
Nombrecompleto char(40) not null,
Responsable char(25) not null,
Direccion char(30) not null, 
PRIMARY KEY (Alojamiento) );