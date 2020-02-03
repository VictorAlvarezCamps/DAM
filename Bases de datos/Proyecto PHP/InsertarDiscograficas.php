<?php
require("CrearBD.php");

$baseDeDatos="discografica";
	 
	mysql_select_db($baseDeDatos,$conectado);

  $consulta="INSERT INTO Discografica (codigoDiscografica, nombreDiscografica, emailDiscografica, anoFundacion, 		paisDiscografica, descripcionDiscografica, codigoGenero) VALUES (001, 'Revealed Recordings', 'revealed@gmail.com', '2010', 'Holanda', 'Revealed Recordings es un sello discografico fundado por Hardwell en 2010. Su primer lanzamiento fue Hardwell y DJ Funkadelic Get Down Girl que termino entre lo mas alto en las listas de musica dance. Actualmente, Revealed es una discografica reconocida en la actualidad con alrededor de 200 lanzamientos, ademas, con numerosos temas en lo mas alto de las listas de Beatport', 001);";
  echo ($consulta."<br>");
  $hacerConsulta=mysql_query($consulta, $conectado);
  if ($hacerConsulta){
    echo ("SE HA GRABADO EL REGISTRO.<br><br>");
  } else {
    echo ("NO SE HA PODIDO GRABAR EL REGISTRO.<br><br>");
  }
  
    $consulta="INSERT INTO Discografica (codigoDiscografica, nombreDiscografica, emailDiscografica, anoFundacion, 		paisDiscografica, descripcionDiscografica, codigoGenero) VALUES (002, 'Axtone Records', 'axtone@gmail.com', '2005', 'Reino Unido', 'Axtone Records es un sello discografico britanico, fundado en 2005 por el DJ y productor sueco Axwell. En un principio se inicio en 2005 como un sello para sacar material propio de Axwell, sin embargo en los ultimos años se ha expandido y ha firmado a muchos productores', 002);";
  echo ($consulta."<br>");
  $hacerConsulta=mysql_query($consulta, $conectado);
  if ($hacerConsulta){
    echo ("SE HA GRABADO EL REGISTRO.<br><br>");
  } else {
    echo ("NO SE HA PODIDO GRABAR EL REGISTRO.<br><br>");
  }
  
    $consulta="INSERT INTO Discografica (codigoDiscografica, nombreDiscografica, emailDiscografica, anoFundacion, 		paisDiscografica, descripcionDiscografica, codigoGenero) VALUES (003, 'Spinnin Records', 'spinnin@gmail.com', '1999', 'Holanda', 'Spinnin Records es un sello discografico de origen holandes, fundado por Eelko van Kooten y Roger de Graaf en 1999. Ademas de su marca principal, Spinnin Records alberga alrededor de veinte submarcas incluyendo Doorn Records de Sander van Doorn, Wall Recordings de Afrojack, Musical Freedom de Tiësto, Rock The Houze de Sidney Samson, y Smash The House de Dimitri Vegas y Like Mike, todas principalmente enfocadas en house progresivo y electro house. Spinnin Records comenzo su propia compañia de representacion artistica llamada MusicAllStars Management, representando artistas como Sander van Doorn, Martin Solveig y Martin Garrix', 001);";
  echo ($consulta."<br>");
  $hacerConsulta=mysql_query($consulta, $conectado);
  if ($hacerConsulta){
    echo ("SE HA GRABADO EL REGISTRO.<br><br>");
  } else {
    echo ("NO SE HA PODIDO GRABAR EL REGISTRO.<br><br>");
  }
  
    $consulta="INSERT INTO Discografica (codigoDiscografica, nombreDiscografica, emailDiscografica, anoFundacion, 		paisDiscografica, descripcionDiscografica, codigoGenero) VALUES (004, 'Refune Music', 'refune@gmail.com', '2003', 'Suecia', 'Refune Music es un sello discografico independiente sueco. Fundada en 2003 por Sebastian Ingrosso. Refune ha visto versiones y remixes de varios artistas, como el propio fundador, asi como Steve Angello, Dirty South, Laidback Luke, Funkagenda, Wippenberg, Till West, y DJ Delicious. Desde 2011, Refune ha sido fuerte con nuevas estrellas en ascenso como Alesso que produjeron Years, y Otto Knows, quien produjo Million Voices', 002);";
  echo ($consulta."<br>");
  $hacerConsulta=mysql_query($consulta, $conectado);
  if ($hacerConsulta){
    echo ("SE HA GRABADO EL REGISTRO.<br><br>");
  } else {
    echo ("NO SE HA PODIDO GRABAR EL REGISTRO.<br><br>");
  }
  
    $consulta="INSERT INTO Discografica (codigoDiscografica, nombreDiscografica, emailDiscografica, anoFundacion, 		paisDiscografica, descripcionDiscografica, codigoGenero) VALUES (005, 'Armada Music', 'armada@gmail.com', '2003', 'Holanda', 'Armada Music es un sello discografico neerlandes, especializado en musica electronica, principalmente Trance y Progressive.
Fue fundado en 2003, por Armin van Buuren, Maykel Piron y David Lewis, utilizando las dos primeras letras de sus nombres para formar el nombre. Con casi 3000 lanzamientos, entre singles, discos, DVD y compilados, Armada Music es uno de los sellos mas importantes de musica electronica a nivel mundial, reconocido dos veces consecutivas con el premio Best Global Dance Label en los IDMA', 003);";
  echo ($consulta."<br>");
  $hacerConsulta=mysql_query($consulta, $conectado);
  if ($hacerConsulta){
    echo ("SE HA GRABADO EL REGISTRO.<br><br>");
  } else {
    echo ("NO SE HA PODIDO GRABAR EL REGISTRO.<br><br>");
  }
?>
