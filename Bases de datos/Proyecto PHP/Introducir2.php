<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Documento sin título</title>
<script language="javascript">
function inicio(){
	window.location.href = "Index.php";
}
</script>
</head>

<body>
<h1>Discográficas</h1>
<br />
<button id="inicio" name="inicio" value="inicio" onclick="inicio();">Inicio</button>
<?php
require("ConexionBD.php");
			
			require("CrearBD.php");
	
			$nombre = $_POST['nombre'];
			$email = $_POST['email'];
			$anoFundacion = $_POST['anoFundacion'];
			$pais = $_POST['pais'];
			$nombreGenero = $_POST['genero'];
			$descripcion = $_POST['descripcion'];
			
			$consulta1="select codigoGenero from Genero where nombreGenero = '".$nombreGenero."';";
			$hacerConsulta1=mysql_query($consulta1,$conectado);
			
			if(mysql_num_rows($hacerConsulta1) == 0){
				$consulta2="insert into Genero (nombreGenero) VALUES ('".$nombreGenero."');";
				$hacerConsulta2=mysql_query($consulta2,$conectado);	
				
				while ($columna1 = mysql_fetch_array($hacerConsulta1)){
				
					$codigoGenero = $columna1[0];
				
				}
				
			}else{
			
			
				while ($columna1 = mysql_fetch_array($hacerConsulta1)){
				
					$codigoGenero = $columna1[0];
				
			}
			
			
			$consulta3="INSERT INTO Discografica (nombreDiscografica, emailDiscografica, anoFundacion, paisDiscografica, codigoGenero, descripcionDiscografica) VALUES ('".$nombre."', '".$email."', '".$anoFundacion."', '".$pais."', '".$codigoGenero."', '".$descripcion."');";
	
			$hacerConsulta3=mysql_query($consulta3,$conectado);	
			
			if($hacerConsulta3){
				echo("<br><br>Se ha introducido la discográfica en la base de datos");	
			}
			}
?>
</body>
</html>