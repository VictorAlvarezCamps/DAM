/*Victor Alvarez Camps*/

CREATE DATABASE DEPARTAMENTOS CHARACTER SET utf8;
SET default_storage_engine=INNODB;
USE DEPARTAMENTOS;

create table Centros (
NUM_CENTRO int(3)not null,
nombre varchar(50)not null,
direccion varchar(40)not null,
localidad varchar(40)not null,
provincia varchar(30)not null,
primary key (NUM_CENTRO) );

INSERT INTO Centros VALUES ('001', 'Zona Sur', 'C/.Miraflores s/n', 'Sevilla', 'Sevilla');
INSERT INTO Centros VALUES ('002', 'Zona Centro', 'Avda.Felipe II,4', 'Dos Hermanas', 'Sevilla');

create table Departamentos (
NUM_DPTO int(3)not null,
nombre varchar(50)not null,
presupuesto decimal(10,2)not null,
NUM_CENTRO int(3)not null,
primary key (NUM_DPTO),
FOREIGN KEY (NUM_CENTRO) REFERENCES Centros (NUM_CENTRO) );

INSERT INTO Departamentos VALUES ('005', 'Reparaciones', '150000', '001');
INSERT INTO Departamentos VALUES ('010', 'Ventas', '200000', '002');

create table Empleados (
NUM_EMP int(3)not null,
nombre varchar(50)not null,
fecha_nacimiento date not null,
fecha_ingreso date not null,
telf_emp int(8)not null,
salario decimal(10,2)not null,
comision decimal(10,2)not null,
num_hijos int(1)not null,
tipo enum('fijo','eventual') not null,
NUM_DPTO int(3)not null,
primary key (NUM_EMP),
FOREIGN KEY (NUM_DPTO) REFERENCES Departamentos (NUM_DPTO) );

INSERT INTO Empleados VALUES ('001', 'Juan Páez', '1960/10/25', '19801025', '954858691', '10000', '500', '0', 'fijo', '005');
INSERT INTO Empleados VALUES ('002', 'Rosa Gil', '1965/12/25', '19891025', '954668221', '12000', '1500', '1', 'fijo', '010');

LOAD DATA infile 'Centros.txt' INTO TABLE Centros
fields TERMINATED BY ':'
lines terminated by '\n';
	

LOAD DATA infile 'Departamentos.txt' INTO TABLE Departamentos
fields TERMINATED BY ':'
lines terminated by' \n';
	

LOAD DATA infile 'Empleados.txt' INTO TABLE Empleados
fields TERMINATED BY ':'
lines terminated by' \n';
	

