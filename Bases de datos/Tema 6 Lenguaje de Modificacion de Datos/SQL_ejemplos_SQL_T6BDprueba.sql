/*Ejemplo 1 BASE DE DATOS DE PRUEBA*/

CREATE DATABASE prueba;
USE prueba;

/*Ejemplo CREACION DE TABLAS CON RESTRICCIONES DE INTEGRIDAD*/
CREATE TABLE dept /*departamentos*/
(
deptno NUMERIC(2),
dname CHAR(14),
loc CHAR(13),
CONSTRAINT pk_dept PRIMARY KEY (deptno)
);

CREATE TABLE emp  /*empleados*/
(
empno NUMERIC(4),
ename CHAR(10),
job CHAR(9),
mgr NUMERIC(4),
hiredate DATETIME,
sal NUMERIC(7,2),
comn NUMERIC(7),
deptno NUMERIC(2),
CONSTRAINT pk_emp PRIMARY KEY(empno),
CONSTRAINT fk_deptno FOREIGN KEY(deptno) REFERENCES dept(deptno)
);

CREATE TABLE bonus  /*bonificaciones*/
(
ename CHAR(10),
job CHAR(9),
sal NUMERIC,
comm NUMERIC

);
CREATE TABLE salgrade  /*nivel salarial*/
(
grade NUMERIC,
losal NUMERIC, 
hisal NUMERIC
);

/*Ejemplo CREACION DE TABLAS CON MAS RESTRICCIONES DE INTEGRIDAD usando CHECK que forma parte del SQL stándard pero que MySQL aunque lo interpreta sin causar ningún error lo ignora. La opción que nos quedaría es:
 1)validarlo desde el lenguaje de programación y por tanto no está integrado en la base de datos así que si usamos otro software nada nos limitará saltarnos esa restricción. 
 2)usar triggers y así lo tendremos integrado en la base de datos que es un gran punto a favor.*/

CREATE TABLE employees  
(
employee_id NUMERIC(6),
first_name  CHAR(20),
last_name CHAR(25) NOT NULL,
email CHAR(25) NOT NULL,
phone_number CHAR(20),
hire_date TIMESTAMP NOT NULL DEFAULT NOW(),
job_id CHAR(10) NOT NULL,
salary NUMERIC(8) NOT NULL,
comission_pct NUMERIC(2),
department_id NUMERIC(2),
dn CHAR(30),
CONSTRAINT emp_salary_min CHECK (salary>0),/*lo ignora MySQL */
CONSTRAINT emp_email_uk UNIQUE (email)  

);

/* EJEMPLOS ALTER TABLE change, modify, rename, add */

ALTER TABLE emp ADD c_id INTEGER;
ALTER TABLE emp MODIFY mgr NUMERIC;
ALTER TABLE emp CHANGE mgr mgr1 NUMERIC;
ALTER TABLE emp RENAME AS empleaditos;
ALTER TABLE empleaditos RENAME AS emp;
ALTER TABLE emp ADD CONSTRAINT chequeo1 CHECK (sal+comn <= 60000);
ALTER TABLE salgrade MODIFY grade DECIMAL(7,2) NOT NULL;
ALTER TABLE salgrade ADD CONSTRAINT pk_grade PRIMARY KEY (grade);
ALTER TABLE emp ADD CONSTRAINT fk_sal_grade FOREIGN KEY
(sal) REFERENCES salgrade (grade);
ALTER TABLE emp ADD thrifplan NUMERIC (7,2), ADD leancode CHAR(1);
ALTER TABLE emp CHANGE thrifplan ahorro NUMERIC(9,2), CHANGE leancode prestamo CHAR(1);
ALTER TABLE emp RENAME AS emp2;
ALTER TABLE emp2 RENAME AS emp;
ALTER TABLE emp ADD INDEX emp_index (ename);
/* CREATE INDEX emp_index ON emp(ename); */

/* USO DE DROP */
CREATE TABLE T11(
pk NUMERIC PRIMARY KEY,
fk NUMERIC,
c1 NUMERIC,
C2 numeric,
CONSTRAINT ck1 CHECK (pk>0 AND c1>0), /*lo ignora MySQL*/
CONSTRAINT ck2 CHECK (c2>0) ); /*lo ignora MySQL */


ALTER TABLE t11 DROP PRIMARY KEY;
ALTER TABLE t11 DROP c1;
ALTER TABLE t11 DROP c2;
ALTER TABLE emp DROP INDEX emp_index;
DROP TABLE t11;

/* INSERT */
DESC dept;
INSERT INTO dept VALUES (51, 'PRODUCCION', 'SAN FRANCISCO');
INSERT INTO salgrade VALUES (30000, 20000, 35000);
INSERT INTO salgrade VALUES (20000, 10000, 25000);
INSERT INTO emp (empno, ename, job, sal, comn, deptno) VALUES (7980,'Jinks', 'Clerk', 30000.00, NULL, 51);
INSERT INTO bonus SELECT ename,job,sal, comn FROM emp WHERE deptno = 51;

/*DELETE*/
DELETE FROM bonus WHERE job='Clerk';

/*UPDATE*/
UPDATE emp SET job = 'Assistant'  WHERE job='Clerk';





