/*Victor Álvarez Camps*/
CREATE DEFINER=`root`@`localhost` PROCEDURE `actividad_de_suma_y_media`()
BEGIN
	declare final boolean;
    declare limiteCredito decimal(10,0) default 0;
    declare suma_Limitecredito decimal(10,0) default 0;
    declare numclientes int default 0;
    declare venta decimal(10,0) default 10;
    declare sumaVentas decimal(10,0) default 0;
	declare limiteCredito_cliente cursor for select Limitecredito from clientes;
    declare sumaVentas_repVenta cursor for select ventas from repVentas;
    declare continue handler for not found set final = 1;
    
    set final = 0;
    
    open limiteCredito_cliente;
    
		limiteCredito_loop: loop
		
			fetch limiteCredito_cliente into limiteCredito;
			
			if final = true then
            
				leave limiteCredito_loop;
                
			end if;
			
			set suma_Limitecredito = suma_Limitecredito + limiteCredito;
			
			set numclientes = numclientes + 1;
			
		end loop limiteCredito_loop;
        
    close limiteCredito_cliente;
    
	select (suma_Limitecredito/numclientes);
    
    
   
    set final = 0;
    
    open sumaVentas_repVenta;
    
		sumaVentas_loop: loop
		
			fetch sumaVentas_repVenta into venta;
			
			if final = true then
			
				leave sumaVentas_loop;
				
			end if;
			
			set sumaVentas = sumaVentas + venta;
			
		end loop sumaVentas_loop;
    
    close sumaVentas_repVenta;
    
    select sumaVentas;
    
END