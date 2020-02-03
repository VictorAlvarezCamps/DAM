<?php
// Se incluye el mini-script que establece la conexión con MySQL y selecciona la BBDD que necesitamos.
  require("usarGestion.php");
  
  $consulta="SELECT * from productos where precioventaproducto < 10;";
  
  echo ("$consulta <br>");
	
  $hacerconsulta=mysql_query($consulta,$conectado);
  
  $numeroderegistros=mysql_num_rows($hacerconsulta);
  
  echo ("Nos ha devuelto $numeroderegistros productos");	
	  
  echo ("<br><hr><br>");
?>
