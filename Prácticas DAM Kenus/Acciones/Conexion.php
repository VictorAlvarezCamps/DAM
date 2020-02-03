<?php
	class ConexionBD{
		
		function Conectarse(){
			
			$serverName = "PRACTICAS-PC\Practicas";
			$uid = "sa";
			$pwd = "practicas";
			
			$connectionInfo = array( "UID"=>$uid,"PWD"=>$pwd,"Database"=>"Acciones");
		
			$conn = sqlsrv_connect( $serverName, $connectionInfo);
			if( $conn === false )
			{
				echo "No es posible conectarse al servidor.</br>";
				die( print_r( sqlsrv_errors(), true));
			}
			
			return $conn;
		
		}

		public function consulta($consulta){
		  $resultado = sqlsrv_query($consulta,$conn);
		  
		  /*if(!$resultado){
		  echo 'MySQL Error: ' . mysql_error();
		  exit;
		  }
		  return $resultado;  
		  }*/
		}
	}
		
?>