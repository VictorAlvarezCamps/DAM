import java.util.Scanner;


public class VentanaSuma {

	static Scanner reader = new Scanner(System.in);
	
	public void suma() {
		//Declaramos las variables
		
		int n1;
		int n2;
		int resultado;
				
		//Inicializamos las variables
				
		//n1=5;
		//n2=5;		
				
		//Realizamos las operaciones
		
		System.out.println("Introduce el primer número:");			
		n1 = reader.nextInt();
		
		System.out.println("Introduce el segundo número:");			
		n2 = reader.nextInt();
		
		resultado=n1+n2;
				
		//Lo imprimimos por pantalla
				
		System.out.println("El resultado de la operacion es: "+resultado);
		
	}

	
}
