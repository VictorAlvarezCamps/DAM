package dam.psp.ExempleThreads;

import javax.swing.JLabel;

/** Thread que va comptant segons, i reacciona a les ordres indicades des del panell que l'ha creat.
 * @author mviel
 * @version 1.0 - 30 Juliol 2016
 */
public class Cronometre extends Thread {
	
	private int comptador;
	private JLabel marcador;
	private boolean pausat=false;
	
	
	public Cronometre(JLabel jl){
		marcador=jl; //enllacem amb el label on mostrarem els segons
	}
	
	@Override
	public void run() {
		super.run();
		while(!this.isInterrupted()){  // Comprovem que el thread no s'ha interromput
			
			try {
				sleep(1000);  // Esperem 1 segon
				// Bloc sincronitzat que pausa el thread si l'usuari ho ha indicat
				synchronized(this) {
		               while(pausat) {  
		                  wait();    
		               }
		        }
			} catch (InterruptedException e) {
				return; // En cas que el thread s'interrompa, eixirem del run() i acabarà l'execució del thread
			}

			comptador++; // incrementem el comptador 
			this.marcador.setText(""+comptador);  // Actualitzem el marcador del panell que l'ha creat
		}
	}

	public void pausar(){
			pausat=true;
			
	}
	
	// Mètode que ens reanuda el thread 
	synchronized void reanudar() {
	      pausat = false;
	      notify();
	   }
}
