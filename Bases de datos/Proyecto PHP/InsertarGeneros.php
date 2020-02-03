<?php
require("CrearBD.php");

$baseDeDatos="discografica";
	 
	mysql_select_db($baseDeDatos,$conectado);

  $consulta="INSERT INTO Genero (codigoGenero, nombreGenero) VALUES (001, 'Electro House');";
  echo ($consulta."<br>");
  $hacerConsulta=mysql_query($consulta, $conectado);
  if ($hacerConsulta){
    echo ("SE HA GRABADO EL REGISTRO.");
  } else {
    echo ("NO SE HA PODIDO GRABAR EL REGISTRO.");
  }
  
  $consulta="INSERT INTO Genero (codigoGenero, nombreGenero) VALUES (002, 'Progressive House');";
  echo ($consulta."<br>");
  $hacerConsulta=mysql_query($consulta, $conectado);
  if ($hacerConsulta){
    echo ("SE HA GRABADO EL REGISTRO.");
  } else {
    echo ("NO SE HA PODIDO GRABAR EL REGISTRO.");
  }
  
  $consulta="INSERT INTO Genero (codigoGenero, nombreGenero) VALUES (003, 'Trance');";
  echo ($consulta."<br>");
  $hacerConsulta=mysql_query($consulta, $conectado);
  if ($hacerConsulta){
    echo ("SE HA GRABADO EL REGISTRO.");
  } else {
    echo ("NO SE HA PODIDO GRABAR EL REGISTRO.");
  }
?>
