import java.io.*;
import java.util.Scanner;

public class VentanaCalculadora {

	public void calculadora() throws IOException {
		
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
		int num1=0;
		int num2=0;
		boolean elegir=true;
		String opcion;
		
		while(elegir){
			
			System.out.println("");
			System.out.println("Elige una opcion: ");
			System.out.println("");
			System.out.println("Sumar");
			System.out.println("Restar");
			System.out.println("Multiplicar");
			System.out.println("Dividir");
			System.out.println("");
			opcion=bufer.readLine();
			
			if(opcion.equals("Sumar")){
				
				System.out.println("Introduce los 2 numeros que quieres sumar:");
				num1 = reader.nextInt();
				num2= reader.nextInt();
				sumar(num1,num2);
				
			}
			
			if(opcion.equals("restar")){
				
				System.out.println("Introduce los 2 numeros que quieres sumar:");
				num1 = reader.nextInt();
				num2= reader.nextInt();
				restar(num1,num2);
				
			}
			
			if(opcion.equals("Multiplicar")){
				
				System.out.println("Introduce los 2 numeros que quieres sumar:");
				num1 = reader.nextInt();
				num2= reader.nextInt();
				multiplicar(num1,num2);
				
			}
			
			if(opcion.equals("Dividir")){
				
				System.out.println("Introduce los 2 numeros que quieres sumar:");
				num1 = reader.nextInt();
				num2= reader.nextInt();
				dividir(num1,num2);
				
			}
		}
	
	}
	
	public void sumar(int num1,int num2){
		int resultado;
		resultado=num1+num2;
		System.out.println("El resultado de "+num1+" + "+num2+" es: "+resultado);
	
	}
	
	public void restar(int num1,int num2){
		int resultado;
		resultado=num1-num2;
		System.out.println("El resultado de "+num1+" + "+num2+" es: "+resultado);
	}
	
	public void multiplicar(int num1,int num2){
		int resultado;
		resultado=num1*num2;
		System.out.println("El resultado de "+num1+" + "+num2+" es: "+resultado);
	}
	
	public void dividir(int num1,int num2){
		int resultado;
		resultado=num1/num2;
		System.out.println("El resultado de "+num1+" + "+num2+" es: "+resultado);
	}

}
