show databases;
show status;
show tables;
show columns from EMP;
explain emp;

alter table emp add c_id integer;
explain emp;
alter table emp modify mgr numeric;
alter table emp change mgr mgr1 numeric;
alter table emp rename as empleaditos;

alter table salgrade MODIFY grade decimal (7,2) not null;
explain salgrade;
alter table salgrade add constraint pk_grade primary key (grade);

alter table empleaditos rename as emp;
alter table emp add constraint fk_salgrade foreign key (sal) references salgrade(grade);

alter table emp add thrifplan numeric (9,2), add leancode char;
alter table emp change thrifplan ahorro numeric (9,2), change leancode prestamos char(1);/*Change cambia solo nombre de las tablas y el update cambia los registros de las tablas */

alter table emp add index emp_nombre(ename);/*hacen lo mismo <--*/
create index emp_nombre on emp(ename);/*hacen lo mismo <--*/

explain t11;
create table t11(
pk numeric primary key,
fk numeric,
c1 numeric,
c2 numeric
/*constraint ch1 check (pk>0 and c1>0),
constraint ch2 check (c2>0)*/);

alter table t11 drop primary key;/*alteramos la tabla t11 y borramos la clave primaria(primary key)*/
alter table t11 drop c1;/*alteramos la tabla t11 y borramos c1*/
alter table emp drop index emp_nombre; /*alteramos la tabla emp y borramos el idice emp_nombre*/
drop table t11;/*Elimina la tabla t11*/

explain dept;
insert into dept values(51,"Produccion","San Francisco");
select * from dept;

explain salgrade;
insert into salgrade values(30000,10000,25000);
select * from salgrade;
insert into emp (empno,ename,job,sal,comn,deptno) values (1789,"Jinks","Clerk",30000,null,51);/*Meter registros en emp con values*/
select * from emp;

insert into bonus select ename,job,sal,comn from emp where deptno=51; /*Meter registros de una tabla a otra tabla*/
select * from bonus;

delete from bonus where job="clerk";/*Borrar de bonus cualquier registro de trabajo que sea llamado "clerk" */
delete from bonus;/*Borra todos los registros de bonus (No se puede deshacer)*/

select * from emp;
update emp set job="Assistant" where job="clerk";/*Actualizar tabla emp(o la que quieras actualizar) donde el job sea clerk se actualize a Assistant */
update emp set job="Director",prestamos="T" where job="Assistant";/*Actualizar tabla emp donde job sea "Assistant" y lo cambiamos a job "Director" y prestamos="T" */
explain emp;