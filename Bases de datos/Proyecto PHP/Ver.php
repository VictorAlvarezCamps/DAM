<!--David Alòs Bosch-->
<!--Victor Alvarez Camps-->
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
	
			if(!isset($_REQUEST['discografica'])){
				echo("<br><br>No has seleccionado ninguna discográfica");	
			}else{
				$discografica = $_POST['discografica'];
			$consulta1="select * from Discografica where nombreDiscografica = '".$discografica."';";
			
			$hacerConsulta1=mysql_query($consulta1,$conectado);		
			
			while ($columna1 = mysql_fetch_array($hacerConsulta1,MYSQL_BOTH)){
				
				$consulta2="select nombreGenero from Genero where codigoGenero = '".$columna1['codigoGenero']."';";
			$hacerConsulta2=mysql_query($consulta2,$conectado);
			
			while ($columna2 = mysql_fetch_array($hacerConsulta2)){
				
					$nombreGenero = $columna2[0];
				
			}
				
					echo ("<br><br><strong>Nombre: </strong>".$columna1['nombreDiscografica']."<br><br><strong>Email: </strong>".$columna1['emailDiscografica']."<br><br><strong>Año de fundación: </strong>".$columna1['anoFundacion']."</font><br><br><strong>Pais: </strong>".$columna1['paisDiscografica']."<br><br><strong>Género: </strong>".$nombreGenero."<br><br><strong>Descripción: </strong>".$columna1['descripcionDiscografica']."<br><br>");
				
			}
			}
?>
</body>
</html>