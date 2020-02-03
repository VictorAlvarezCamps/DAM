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
			$consulta="delete from Discografica where nombreDiscografica = '".$discografica."';";
			
			$hacerConsulta=mysql_query($consulta,$conectado);		
				
				echo ("<br><br>La discografica se ha eliminado correctamente");		
			}
?>
</body>
</html>