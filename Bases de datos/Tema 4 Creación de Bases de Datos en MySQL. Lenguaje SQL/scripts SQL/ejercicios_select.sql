/*Victor Álvarez Camps*/

USE educa;

/*Ejercicio 1*/

select * from curso where not Cdept='CIS' or (Ctarifa=0 AND Cred=3);

/*Ejercicio 2*/

select * from curso where cdept in ('CIS','THEO') AND (Ctarifa between 50 and 300) and (Cred=3) order by cdept,cnombre;

/*Ejercicio 3*/

select Cnombre, Cred, Ctarifa/Cred AS TARIFA_POR_CREDITO,(Ctarifa+25)/Cred AS TARIFA_MEDIA_POR_HORA FROM curso where Cdept='CIS';

/*Ejercicio 5.1*/

select distinct Cdept from Curso;

/*Ejercicio 5.2*/

select distinct Cdept,Cred from curso where Ctarifa<100;

/*Ejercicio 5.3*/

select Cdept,Cnombre from curso ORDER BY Cdept,Cnombre;

/*Ejercicio 6*/

select * from curso where Ctarifa between 0 AND 100 AND Cdept='PHIL' AND Cred=3;

/*Ejercicio 7*/

select * from curso where Cnombre like 'INTROD%';

/*Ejercicio 8*/

select * from curso where Cnombre like '%SC%';

/*Ejercicio 9*/

select * from curso where Cnombre not like '_A%' and Cnombre not like '_E%' and Cnombre not like '_I%' and Cnombre not like '_O%' and Cnombre not like '_U%';

/*Ejercicio 10*/

select cnombre,ctarifa+25 from curso where cdep="CIS";