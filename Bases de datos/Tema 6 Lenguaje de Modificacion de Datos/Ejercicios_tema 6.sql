/*Victor Alvarez Camps*/

use empresa;

/*Ejercicio 1*/

insert into repventas(numempl,nombre,edad,oficinarep,titulo,contrato,director) values(12,"HERRY JACOBSEN",36,13,"Director Ventas",'25/07/1990',108);

/*Ejercicio 2*/

insert into clientes values(2127,"INTERCORP",12,15000);
insert into pedidos values(113070,current_date(),2127,12,"ACI",41004,20,2340);

/*Ejercicio 3*/

create table anpedidos (
Numpedido int(11) not null,
Fechapedido date not null,
Importe decimal(10,0) not null
);

insert into anpedidos select numpedido,fechapedido,importe from pedids where fechapedido<'1980-01-01';

/*Ejercicio 4*/

create table GRANDESPEDIDOS1 (
Importe decimal(10,0),
Empresa char(20),
Nombre char(15),
Rendimiento decimal(10,0),
Fab	char(3) not null,
producto char(5),
dir int(11),
cant int(11)
);

insert into GRANDESPEDIDOS1 select p.importe,c.empresa,r.nombre(r.ventas-r.cuota),p.cuota,p.producto,o.dir,p.cant
 from clientes c,repventas r,pedidos p,oficinas o where p.importe>15000;
 
/*Ejercicio 5*/

delete from pedidos where Numpedido=2127 and Fechapedido<'1989-11-15';
delete from repventas where Nombre like "HENRY JACOBSEN";

/*Ejercicio 6*/

delete from GRANDESPEDIDOS1;
select * from GRANDESPEDDOS1;
drop table GRANDESPEDIDOS1;
drop table anpedidos;
select * from GRANDESPEDIDOS1;
select * from anpedidos;

/*Ejercicio 7*/

select * from clientes;
update clientes set Limitecredito=60000,repclie=109 where empresa like "INTERCORP";
update clientes set repclie=102 where repclie=105 or repclie=106 or repclie=107;
insert into oficinas values (11,"Valencia","Este",102,12000,432172);
update repventas set oficinarep=11,cuota=cuota-(cuota*0.1) where oficinarep=12;
update repventas set cuota=10000 where cuota=null;
select * from repventas;

/*Ejercicio 8*/

use educa;
update curso set cred=3,ctarifa=ctarifa+(ctarifa*0.1),cdescp="EL LENGUAJE DB2" where cno like 'C3%';
update curso set ctarifa=175 where cno='C66';
update personal set esueldo=4000 where dept="math";