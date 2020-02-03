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
			
			$consulta0="select codigoDiscografica from Discografica where nombreDiscografica = '".$nombre."'";
			$hacerConsulta0=mysql_query($consulta0,$conectado);
			while ($columna0 = mysql_fetch_array($hacerConsulta0)){
				
					$codigoDiscografica = $columna0[0];
				
				}
			
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
			
			$consulta3="select codigoDiscografica from Discografica where nombreDiscografica = '".$nombreGenero."';";
			$hacerConsulta3=mysql_query($consulta3,$conectado);
			
			while ($columna2 = mysql_fetch_array($hacerConsulta3)){
				
					$codigoDiscografica = $columna2[0];
				
			}
			
			
			$consulta4="UPDATE Discografica SET nombreDiscografica = '".$nombre."', emailDiscografica = '".$email."', anoFundacion = '".$anoFundacion."', paisDiscografica = '".$pais."', codigoGenero = '".$codigoGenero."' WHERE codigoDiscografica = '".$codigoDiscografica."';";
	
			$hacerConsulta4=mysql_query($consulta4,$conectado);	
			
			if($hacerConsulta4){
				echo("<br><br>Se ha introducido la discográfica en la base de datos");	
			}
			}
?>
</body>
</html>