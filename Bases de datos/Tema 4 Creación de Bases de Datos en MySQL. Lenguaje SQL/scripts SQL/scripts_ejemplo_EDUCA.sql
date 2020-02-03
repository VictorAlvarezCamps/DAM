CREATE DATABASE educa CHARACTER SET utf8;

SET default_storage_engine=INNODB;

USE educa;


CREATE TABLE departamento
(Dept		char(4) not null,
Dedif		char(2) not null,
Ddespacho	integer not null,
Dchfno		char(3),
PRIMARY KEY (Dept));

INSERT INTO departamento VALUES ('THEO', 'HU', 200, '10');
INSERT INTO departamento VALUES ('CIS', 'SC', 300, '80');
INSERT INTO departamento VALUES ('D.G.', 'SC', 100, NULL);
INSERT INTO departamento VALUES ('PHIL', 'HU', 100, '60');

CREATE TABLE curso
(Cno		char(3) not null,
Cnombre		char(22) not null,
Cdescp		char(25) not null,
Cred		integer not null,
Ctarifa		numeric not null,
Cdept		char(4) not null,
PRIMARY KEY (Cno),
FOREIGN KEY (Cdept) REFERENCES departamento (Dept));

INSERT INTO curso VALUES ('C11', 'INTRODU. A LAS CC.', 'PARA NOVATOS', 3, 100, 'CIS');
INSERT INTO curso VALUES ('C22', 'ESTRCT. DE DATOS', 'MUY UTIL', 3, 50, 'CIS');
INSERT INTO curso VALUES ('C33', 'MATEMATICAS DISCRETAS', 'ABSOLUTAMENTE NECESARIO', 3, 0, 'CIS');
INSERT INTO curso VALUES ('C44', 'CIRCUITOS DIGITALES', 'AH HA!', 3, 0, 'CIS');
INSERT INTO curso VALUES ('C55', 'ARQUITECT. COMPUTADOR', 'MAQ. VON NEUMANN', 3, 100, 'CIS');
INSERT INTO curso VALUES ('C66', 'BASES DE DATOS RELAC.', 'IMPRESCINDIBLE', 3, 500, 'CIS');
INSERT INTO curso VALUES ('P11', 'EMPIRISMO', 'VERLO PARA CREERLO', 3, 100, 'PHIL');
INSERT INTO curso VALUES ('P22', 'RACIONALISMO', 'PARA USARLOS CIS', 3, 50, 'PHIL');
INSERT INTO curso VALUES ('P33', 'EXISTENCIALISMO', 'PARA USARLOS CIS', 3, 200, 'PHIL');
INSERT INTO curso VALUES ('P44', 'SOLIPSISMO', 'PARA MI MISMO', 6, 0, 'PHIL');
INSERT INTO curso VALUES ('T11', 'ESCOLASTICISMO', 'PARA BEATOS', 3, 150, 'THEO');
INSERT INTO curso VALUES ('T22', 'FUNDAMENTALISMO', 'PARA DESCUIDADOS', 3, 90, 'THEO');
INSERT INTO curso VALUES ('T33', 'HEDONISMO', 'PARA SANOS', 3, 0, 'THEO');
INSERT INTO curso VALUES ('T44', 'COMUNISMO', 'PARA AVAROS', 6, 200, 'THEO');

CREATE TABLE claustro
(Fno		char(3) not null,
Fnombre		char(15) not null,
Fdomi		char(20) not null,
Ffcanti		date not null,
Fnumdep		integer,
Fsueldo		numeric not null,
Fdept		char(4) not null,

PRIMARY KEY (Fno),
FOREIGN KEY (Fdept) REFERENCES departamento (Dept));

INSERT INTO claustro VALUES ('06', 'KATHY PEPE', 'CALLE DE LA PIEDRA, 7', "1979-01-15", 2, 35000, 'PHIL');
INSERT INTO claustro VALUES ('10', 'JESSIE MARTIN', 'Dr. DEL ESTE, 4', "1969-09-01", 2, 45000, 'THEO');
INSERT INTO claustro VALUES ('08', 'JOSE COHN', 'AP. CORREOS 1138', "1979-07-09", 2, 35000, 'CIS');
INSERT INTO claustro VALUES ('85', 'AL HARTLEY', 'CALLE DE LA PLATA', "1979-09-05", 7, 45000, 'CIS');
INSERT INTO claustro VALUES ('60', 'JULIA MARTIN', 'Dr. DEL ESTE, 4', "1969-09-01", 1, 45000, 'PHIL');
INSERT INTO claustro VALUES ('65', 'LISA BOBAK', 'CAMINO RISA, 77', "1981-09-06", 0, 36000, 'THEO');
INSERT INTO claustro VALUES ('80', 'BARB HLAVATY', 'CALLE DEL SUR, 489', "1982-01-16", 3, 35000, 'CIS');

CREATE TABLE clase
(Cno		char(3) not null,
Sec		char(2) not null,
Cinstrfno	char(2) not null,
Cdia		char(2) not null,
Chora		char(14) not null,
Cedif		char(2) not null,
Cdespacho	integer not null,


PRIMARY KEY (Cno, Sec),
FOREIGN KEY (Cinstrfno) REFERENCES claustro (Fno),
FOREIGN KEY (Cno) REFERENCES curso (Cno));


INSERT INTO clase VALUES ('c11', '01', '08', 'LU', '08:00-09:00 AM','SC', 305);
INSERT INTO clase VALUES ('c11', '02', '08', 'MA', '08:00-09:00 AM','SC', 306);
INSERT INTO clase VALUES ('c33', '01', '80', 'MI', '09:00-10:00 AM','SC', 305);
INSERT INTO clase VALUES ('c55', '01', '85', 'JU', '11:00-12:00 AM','HU', 306);
INSERT INTO clase VALUES ('P11', '01', '06', 'JU', '09:00-10:00 AM','HU', 102);
INSERT INTO clase VALUES ('P33', '01', '06', 'VI', '11:00-12:00 AM','HU', 201);
INSERT INTO clase VALUES ('T11', '01', '10', 'LU', '10:00-11:00 AM','HU', 101);
INSERT INTO clase VALUES ('T11', '02', '65', 'LU', '10:00-11:00 AM','HU', 102);
INSERT INTO clase VALUES ('T33', '01', '65', 'MI', '11:00-12:00 AM','HU', 101);

CREATE TABLE estudiante
(Sno		char(3) not null,
Snombre		char(30) not null,
Sdomi		char(15) not null,
Stlfno		char(12) not null,
Sfnacim		char(6) not null,
Siq		integer not null,
Sadvfno		char(3) not null,
Sesp		char(4) not null,

PRIMARY KEY (Sno),
FOREIGN KEY (Sesp) REFERENCES departamento (Dept));

INSERT INTO estudiante VALUES ('325', 'CURLEY DUBAY', 'CONNECTICUT', '203-123-4567', '780517', 122, '10','THEO');
INSERT INTO estudiante VALUES ('150', 'LARRY DUBAY', 'CONNECTICUT', '203-123-4567', '780517', 121, '80','CIS');
INSERT INTO estudiante VALUES ('100', 'MOE DUBAY', 'CONNECTICUT', '203-123-4567', '780517', 120, '10','THEO');
INSERT INTO estudiante VALUES ('800', 'ROCKY BALBOA', 'PENSYLVANIA', '112-112-1122', '461004', 99, '60','PHIL');

CREATE TABLE matricula
(Cno		char(3) not null,
Sec		char(2) not null,
Sno		char(3) not null,
Fechamat	date not null,
Horamat		char(10) not null,

PRIMARY KEY (Cno, Sec, Sno),
FOREIGN KEY (Cno, Sec) REFERENCES clase (Cno, Sec),
FOREIGN KEY (Sno) REFERENCES estudiante (Sno));

INSERT INTO matricula VALUES ('C11', '01', '325', '1987-01-04', '09.41.30');
INSERT INTO matricula VALUES ('C11', '01', '800', '1987-12-15', '11.49.00');
INSERT INTO matricula VALUES ('C11', '02', '100', '1987-12-17', '09.32.00');
INSERT INTO matricula VALUES ('C11', '02', '150', '1987-12-17', '09.32.30');
INSERT INTO matricula VALUES ('P33', '01', '100', '1987-12-23', '11.30.00');
INSERT INTO matricula VALUES ('P33', '01', '800', '1987-12-23', '11.23.00');
INSERT INTO matricula VALUES ('T11', '01', '100', '1987-12-23', '11.21.00');
INSERT INTO matricula VALUES ('T11', '01', '150', '1987-12-15', '11.35.30');
INSERT INTO matricula VALUES ('T11', '01', '800', '1987-12-15', '14.00.00');


CREATE TABLE personal
(Enombre	char(15) not null,
Cargo		char(10) not null,
Esueldo		integer not null,
Dept		char(4),

PRIMARY KEY (Enombre));

INSERT INTO personal VALUES ('LUCAS', 'EVANG1', 53, 'THEO');
INSERT INTO personal VALUES ('MARCOS', 'EVANG2', 52, 'THEO');
INSERT INTO personal VALUES ('MATEO', 'EVANG3', 51, 'THEO');
INSERT INTO personal VALUES ('DICK NIX', 'LADRÓN', 25001, 'PHIL');
INSERT INTO personal VALUES ('HANK KISS', 'BUFÓN', 25000, 'PHIL');
INSERT INTO personal VALUES ('JUAN', 'EVANG4', 54, 'THEO');
INSERT INTO personal VALUES ('EUCLIDES', 'AYTE. LAB.', 1000, 'MATH');
INSERT INTO personal VALUES ('ARQUIMEDES', 'AYTE. LAB.', 200, 'ENG');
INSERT INTO personal VALUES ('DAVINCI', 'AYTE. LAB.', 500, NULL);