<!--David Alòs Bosch-->
<!--Victor Alvarez Camps-->
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Discografica</title>
<script language="javascript">
function inicio(){
    window.location.href = "Index.php";
}
</script>
</head>

<body >
<h1>Discográficas</h1>
<br>
<button id="inicio" name="inicio" value="inicio" onclick="inicio();">Inicio</button>
<form nombre = "form" id="form" action="Editar2.php" method="post">

<?php

require("ConexionBD.php");
			
	require("CrearBD.php");
if(!isset($_REQUEST['discografica'])){
	echo("<br>No has seleccionado ninguna discográfica");	
}else{
	$discografica = $_POST['discografica'];
$consulta="select * from Discografica where nombreDiscografica = '".$discografica."';";
$hacerConsulta=mysql_query($consulta,$conectado);	

while ($columna = mysql_fetch_array($hacerConsulta,MYSQL_BOTH)){
	

?>	

<p>
	<label><strong>Nombre:</strong>
    <input name="nombre" type="text" id="nombre" value="<?php echo($columna['nombreDiscografica'])?>"/>
    </label>
    </p>
    <p>
    <label></label><strong>Email:</strong>
    <input name="email" type="text" id="email" value="<?php echo($columna['emailDiscografica'])?>"/>
    </label>
  </p>
  <p>
	<label><strong>Año de fundación:</strong>
    <input name="anoFundacion" type="text" id="anoFundacion" value="<?php echo($columna['anoFundacion'])?>"/>
    </label>
    </p>
    <p>
    <label><strong>Pais:</strong>
    <input name="pais" type="text" id="pais" value="<?php echo($columna['paisDiscografica'])?>"/>
    </label>
  </p>
   <p>
    <label><strong>Género:</strong>
    <select name="genero">
    <option value="Electro House">Electro House
    </option>
    <option value="Progressive House">Progressive House
    </option>
    <option value="Trance">Trance
    </option>
    </select>
    <!--<input name="genero" type="text" id="genero" value="<?php echo($columna['generoDiscografica'])?>"/>-->
    </label>
  </p>
  <p>
   	<label><strong>Descripción:</strong>
    <p>
    <textarea name="descripcion" cols="50" rows="5"><?php echo($columna['descripcionDiscografica'])?></textarea>
    </p>
  </p>
  <?php
}
?>
  <input name="Enviar" type="submit" />
  </form>
  <?php
}
  ?>
 </body>
</html>