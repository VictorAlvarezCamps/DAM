<?php
// Se incluye el mini-script que establece la conexión con MySQL y selecciona la BBDD que necesitamos.
  require("usarGestion.php");
// Se crea una consulta para insertar un registro.
  $consulta="INSERT INTO productos (codigoProducto, descripcionProducto, codigoProveedorProducto, precioCompraProducto, precioVentaProducto, stockProducto) VALUES ('T12', 'Tornillos del 12', 'PR1', 2.34, 5.15, 22000);";
// Se vuelca la consulta a la página, a fines didácticos.
  echo ($consulta."<br>");
// Se ejecuta la consulta.
  $hacerConsulta=mysql_query($consulta, $conectado);
// Se comprueba si se ha podido grabar el registro.
  if ($hacerConsulta){
    echo ("SE HA GRABADO EL REGISTRO.");
  } else {
    echo ("NO SE HA PODIDO GRABAR EL REGISTRO.");
  }
  echo ("<br><hr><br>");
// Se crea una consulta para insertar un registro.
  $consulta="INSERT INTO productos (codigoProducto, descripcionProducto, codigoProveedorProducto, precioCompraProducto, precioVentaProducto, stockProducto) VALUES ('T22', 'Tornillos del 22', 'PR1', 4.24, 6.15, 15000);";
// Se vuelca la consulta a la página, a fines didácticos.
  echo ($consulta."<br>");
// Se ejecuta la consulta.
  $hacerConsulta=mysql_query($consulta, $conectado);
// Se comprueba si se ha podido grabar el registro.
  if ($hacerConsulta){
    echo ("SE HA GRABADO EL REGISTRO.");
  } else {
    echo ("NO SE HA PODIDO GRABAR EL REGISTRO.");
  }
  echo ("<br><hr><br>");
// Se crea una consulta para insertar un registro.
  $consulta="INSERT INTO productos (codigoProducto, descripcionProducto, codigoProveedorProducto, precioCompraProducto, precioVentaProducto, stockProducto) VALUES ('A12', 'Arandelas del 12', 'PR1', 15.40, 25.17, 122000);";
// Se vuelca la consulta a la página, a fines didácticos.
  echo ($consulta."<br>");
// Se ejecuta la consulta.
  $hacerConsulta=mysql_query($consulta, $conectado);
// Se comprueba si se ha podido grabar el registro.
  if ($hacerConsulta){
    echo ("SE HA GRABADO EL REGISTRO.");
  } else {
    echo ("NO SE HA PODIDO GRABAR EL REGISTRO.");
  }
  echo ("<br><hr><br>");
?>
