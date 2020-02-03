/*Victor Álvarez Camps*/
use educa;

/*Ejercicio 12*/
select Enombre,Cargo,d.Dept from personal p inner join departamento d on d.Dept=d.Dept;

/*Ejercicio 13*/
select Cnombre,Ctarifa,dchfno from curso c inner join departamento d on c.Cdept=d.Dept where Ctarifa>175 order by Cnombre ASC;

/*Ejercicio 14*/
select p.Dept,avg(c.ctarifa) AS Tarifa_media,avg(p.esueldo) AS Sueldo_medio FROM personal p left join curso c on p.dept=c.cdept group by p.dept order by p.Dept;

/*Ejercicio 15*/
select cdep, avg(ctarifa) as 'tarifa media' from curso where not (cdept='theo') group by cdept having avg(ctarifa)>100;

/*Ejercicio 16*/
select ctarifa, sum(cred) as 'creditos totales' from curso group by ctarifa order by ctarifa desc;

/*Ejercicio 17*/
select cdept,avg(ctarifa) AS Tarifa_media FROM curso c group by cdept having avg(ctarifa)>100 and count(*)>4 ;