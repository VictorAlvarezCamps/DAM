CREATE DATABASE ej3 character set utf8;
set default_storage_engine=INNODB;
USE ej3;

CREATE TABLE EMPLEO (
nombre char(15) not null,
edad integer not null,
alojamiento boolean not null,
PRIMARY KEY (edad,alojamiento) );

CREATE TABLE PROBLEMA (
ciudad char(15) not null,
fechamuestra date not null,
mediodía boolean not null,
medianoche boolean not null,
PRIMARY KEY (medianoche,ciudad) );

ALTER TABLE PROBLEMA
ADD CONSTRAINT r1 foreign key (medianoche,ciudad) references EMPLEO(edad,alojamiento);