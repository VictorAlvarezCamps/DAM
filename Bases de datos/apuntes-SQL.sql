select * from t;
set @sum=0;
select @sum;
show variables;
INSERT INTO t VALUES (57,125);
INSERT INTO t VALUES (56,126);

SELECT @SUM;

CREATE TABLE t_auditoria (id_mov int not null AUTO_INCREMENT,usuario varchar(40),fecha DATETIME, primary key(id_mov));

SELECT CURRENT_USER();
SELECT NOW();

UPDATE T SET S1=999 WHERE C=125;
select * from t_auditoria;