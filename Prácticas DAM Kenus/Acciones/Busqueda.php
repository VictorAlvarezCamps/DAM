<html>
<head>
	<title>Kenus</title>


	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
	<script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.1/jquery.validate.min.js"></script>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<meta charset="utf-8">	
	<link rel="stylesheet" href="css/default.css"/>	
	<link rel="stylesheet" href="css/normalize.css">
	<link href='http://fonts.googleapis.com/css?family=Roboto:400,300' rel='stylesheet' type='text/css'>
	

	<link rel='stylesheet prefetch' href='http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/themes/smoothness/jquery-ui.css'>
	<link rel='stylesheet prefetch' href='http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css'>


	
</head>
<body>
<script>
 // Write on keyup event of keyword input element
	 $(document).ready(function(){

	 	AccionesDiaAnterior();

		// Write on keyup event of keyword input element
		$("#busqueda").keyup(function(){
			// When value of the input is not blank
			if( $(this).val() != "")
			{
				// Show only matching TR, hide rest of them
				$(".filasABuscar").hide();
				//$("#table td:contains('" + $(this).val() + "')").parent("tr").show();
				var busqueda = $(this).val().toLowerCase();
				$('#table td').each(function(){
					if($(this).text().toLowerCase().indexOf(busqueda)!=-1)
					{
						$(this).parent("tr").show();
					}
				});
			}
			else
			{
				// When there is no input or clean again, show everything back
				$(".filasABuscar").show();
			}
		});


		$('.CeldaEditable').keydown(function (){
		  $(this).parent('tr').children().each(function(){
		      if($(this).attr('class') == "idClientes"){
		        if(idRegistros.indexOf($(this).text()+",")==-1){
		          idRegistros+=$(this).text()+",";	
		        }
		      }
		  });
		});

	});

</script>


<?php

	error_reporting(0);

	$con = null;
						
	include ("Conexion.php");
						
	$c = new ConexionBD(); 
	$con = $c->conectarse();

?>
<div id="container">
	<header class="cabecera">
		<div class="container">
			<div class="logo">
				<img src="./img/logo.png">
			</div>
			<!--<nav class="menu">
				<ul>			
					<li><a href="Busqueda.php">B&uacute;squeda</a></li>
				</ul>
			</nav>-->
			<div class="registro" style="margin-right: 45px; margin-top: 0px;">				               
				<div id="Bienvenida">
					<span class="txtDesc">Desconectar</span>
					<span class="txtBienvenido">Bienvenido <?php session_start(); $User=$_SESSION['username']; echo ($User);?></span><img src="img/UserIcon.jpg" class="imgUser">
				</div>
			</div>
		</div>
	</header>
	<div id="banner">
		<h1>Este es el banner</h1>
	</div>
	<div id="content">
		<br>
		<br>
		<div id="tableEnMarcha" class="tableEnMarcha-editable" style="overflow: auto;max-height: 150px;">
		</div>
		<br>
		<br>
		<center>
		<h1><b><u>B&uacute;squeda</u></b></h1>
		<div style="border:1px solid black margin-right: 45px margin-left:45px;">
			<form id="FormBusqueda" name="buscador" method="post">
					<br>
					B&uacute;squeda:
					<input name="busqueda" type="search" id="busqueda" placeholder="B&uacute;squeda.." autofocus;">
					<br>
					<br>
					
			</form>
		</div></center>
		<br>
		<br>
		<center><h1><b><u>Resultado</u></b></h1>
		<?php

		session_start();

		$idTime = "";

		function consultaGeneral($con){

		$search = $_POST["busqueda"];
		$idRegistro=$_SESSION['idRegistro'];

			do{			

				if($search==""){

					/*$tsql = "SELECT A.id_Accion, A.Accion,A.Resolucion,A.Fecha,A.id_Estado, C.nombre,  T.Play, t.Pause as p FROM Acciones A
					LEFT JOIN (SELECT idusuario, play, pause from TiempoAcciones T1 where (NOT EXISTS (select * FROM TiempoAcciones T2 WHERE (T2.Pause > T1.PLAY OR T2.STOP > T1.PLAY)AND t1.idUsuario = t2.idUsuario) and T1.PLAY IS NOT NULL) OR (NOT EXISTS(SELECT * FROM TiempoClientes T2 WHERE (T2.PLAY > T1.Pause OR T2.Stop > T1.Pause) and  t1.idUsuario = t2.idUsuario)and T1.Pause IS NOT NULL)) t on a.id_Accion = t.idUsuario LEFT JOIN Clientes c ON a.id_Cliente = c.Cod_Cli;";*/

					$tsql = "SELECT A.id_Accion,A.Nombre,A.Accion,A.Resolucion,A.Fecha,A.Estado,T.Play as pl,T.Pause as pa FROM Acciones A
					LEFT JOIN 
					(SELECT idAccion, play, pause from TiempoAcciones T1 where 
					(NOT EXISTS 
					(select * FROM TiempoAcciones T2 WHERE (T2.Pause > T1.PLAY OR T2.STOP > T1.PLAY)AND t1.idAccion = t2.idAccion) and T1.PLAY IS NOT NULL)
 					OR
  					(NOT EXISTS
  					(SELECT * FROM TiempoAcciones T2 WHERE (T2.PLAY > T1.Pause OR T2.Stop > T1.Pause) and  t1.idAccion = t2.idAccion)and T1.Pause IS NOT NULL)) t on A.id_Accion = T.idAccion where id_Usuario = '".$idRegistro."';";

   					/*$tsql="SELECT * FROM Acciones where id_Usuario = '".$idRegistro."';";*/
					$stmt = sqlsrv_query($con,$tsql);
																
					if( $stmt === false ){
						echo "Error al ejecutar consulta.</br>";
						die( print_r( sqlsrv_errors(), true));
					}
													
					return $stmt;
					sqlsrv_free_stmt($stmt);
					sqlsrv_close($con);
												
				}		

			}while ($search=="");

		}

				?>
				
			<div id="table" class="table-editable">
			    <span class="table-add glyphicon glyphicon-plus" id="BotonAnyadir" ></span>
			    <br>
			    <table class="table" id="BusquedaClientes" style="width: 80%" onclick="refreshTable();">
			      <tr>
					<th><b><center>ID_Cliente</center></b></th>	
					<th><b><center>Nombre</center></b></th>
					<th><b><center>Acci&oacute;n</center></b></th>
					<th><b><center>Resoluci&oacute;n</center></b></th>
					<th><b><center>Fecha</center></b></th>
					<th><b><center>Estado</center></b></th>
					<th><b>Opciones</b></th>
					<!--<th><b>Ordenar</b></th>-->
				</tr>
			      
			      <?php							
			      			$resultado = consultaGeneral($con);
							while($row = sqlsrv_fetch_array($resultado)){
									
								?>
								<center><tr class="filasABuscar filaPintada">
									<td class="idClientes"><center><?php echo $row[0];?></center></td>
									<td class="CeldaEditable" id="celdaNom" contenteditable="true" style="height: 20px"><center><?php echo $row["Nombre"];?></a></center></td>	
									<td class="CeldaEditable" id="celdaAcc" contenteditable="true" style="height: 20px"><center><?php echo $row["Accion"];?></center></td>
									<td class="CeldaEditable" id="celdaRes" contenteditable="true" style="height: 20px"><center><?php echo $row["Resolucion"];?></center></td>
									<td class="CeldaEditable" id="celdaFec" contenteditable="true" style="height: 20px"><center><?php echo $row["Fecha"];?></center></td>
									<td class="CeldaEditable celdaEst" contenteditable="true" style="height: 20px; "><center><?php echo $row["Estado"];?></center></td>
									<td class="imgOpciones"><span class="table-remove glyphicon glyphicon-remove "></span>
										<input type=image src="img/play.png" width="70" height="50" class="play" id="OpcionesTiempo"
									<?php
										if($row['pl'] != null){
									?>
									 disabled="disabled" style="opacity: 0.5"
									<?php
										}
									?>
									/>									
									<input type=image src="img/pause.png" width="70" height="50" class="pause" id="OpcionesTiempo" 
									<?php
										if($row['pl'] == null){
									?>
									disabled="disabled" style="opacity: 0.5"
									<?php
										}
									?>
									/>
									<input type=image src="img/stop.png" width="70" height="50" class="stop" id="OpcionesTiempo">

									</td>
									<!--<td>
										<span class="table-up glyphicon glyphicon-arrow-up"></span>
							          	<span class="table-down glyphicon glyphicon-arrow-down"></span>
							        </td>-->
								</tr></center>
								<?php
							}
							?>
			     <!--class="btn btn-primary"-->
			    </table>
			    <button id="btnMod" class="btn btn-primary">Modificar</button>
			    <button id="btnAdd" class="btn btn-primary">A&ntilde;adir</button>
  				<p id="export"></p>
			  </div>
</div>
			</center>
	</div>	
</div>
<!--Tiempo-->

<form id="formJSONTiempoPlay" name="formJSONTiempoPlay" method="post" action="play.php">
	<input type="hidden" id="idJSONPlay" name="idJSONPlay">
</form>

<form id="formJSONTiempoPause" name="formJSONTiempoPause" method="post" action="pause.php">
	<input type="hidden" id="idJSONPause" name="idJSONPause">
</form>

<form id="formJSONTiempoStop" name="formJSONTiempoStop" method="post" action="stop.php">
	<input type="hidden" id="idJSONStop" name="idJSONStop">
</form>

<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src='http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/jquery-ui.min.js'></script>
<script src='http://netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js'></script>
<script src='http://cdnjs.cloudflare.com/ajax/libs/underscore.js/1.6.0/underscore.js'></script>	
<script src="js/index.js"></script>

</body>
</html>
