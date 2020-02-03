<!--David Alòs Bosch-->
<!--Victor Alvarez Camps-->
<?php
	
	require("ConexionBD.php");
	
	$consulta ="CREATE DATABASE IF NOT EXISTS discografica";
		
	$hacerConsulta=mysql_query($consulta,$conectado);	
		
	$db="discografica";
	
	$bd=mysql_select_db($db,$conectado);

	$consulta="CREATE TABLE IF NOT EXISTS Genero ";
	$consulta.="(codigoGenero INT (3) AUTO_INCREMENT, ";
	$consulta.="nombreGenero VARCHAR (40), ";
  	$consulta.="PRIMARY KEY (codigoGenero)) ";
	
	$hacerConsulta=mysql_query($consulta,$conectado);
	
	$consulta="CREATE TABLE IF NOT EXISTS Discografica ";
	$consulta.="(codigoDiscografica INT (3) AUTO_INCREMENT, ";
	$consulta.="nombreDiscografica VARCHAR (40), ";
  	$consulta.="emailDiscografica VARCHAR (40), ";
  	$consulta.="anoFundacion INT (4), ";
  	$consulta.="paisDiscografica VARCHAR (40), ";
	$consulta.="descripcionDiscografica VARCHAR (1000), ";
	$consulta.="codigoGenero INT(3), ";
  	$consulta.="PRIMARY KEY (codigoDiscografica), FOREIGN KEY (codigoGenero) REFERENCES Genero (codigoGenero)) ";
	
	$hacerConsulta=mysql_query($consulta,$conectado);
?>