use empresa;

select p.numpedido,p.importe,c.empresa,c.limitecredito from pedidos p inner join clientes c on p.clie = c.numclie;

select c.cnomre, c.tarifa, d.dchfno from curso c inner join departamento d on c.cdept=d where c.tarifa >100;

select p.numpedido, p.importe, c.empresa, r.nombre from pedidos p inner join clientes c inner join repventas r on p.clie = c.numclie and p.rep = r.numempl;