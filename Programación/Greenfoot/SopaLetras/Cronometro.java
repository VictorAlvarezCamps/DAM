import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import javax.swing.JOptionPane;
/**
 * Write a description of class Cronometro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cronometro extends Actor
{
    private boolean Tiempo;
    private long tinicial,tactual,tfinal;
    private int TiempoJuego;
    private int delay;
    private GreenfootImage imagen;
    private Color colorImagen;
    private Color colorText;
    private boolean tiempoTerminado;
    public void act(){
        juegoTerminado();
    }
    
    public Cronometro() 
    {
        this.TiempoJuego=100;
        this.delay=1;
        this.colorImagen=new Color(255,0,0);
        this.colorText=Color.white;
        
        imagen=new GreenfootImage(140,100);
        imagen.setColor(this.colorImagen);
        imagen.fillRect(0,0,imagen.getWidth()-1,imagen.getHeight()-1);
        imagen.setTransparency(255);
        
        imagen.setColor(this.colorText);
        imagen.drawString("Cronometro ",20,30);
        imagen.drawString("Tiempo= "+this.TiempoJuego,20,50);        
        imagen.drawString("Victor Álvarez | 1ºDAM",20,80);
       
        this.setImage(imagen);
    }
    
    public void Cronometro(){        
        if(Tiempo==false){
            tinicial = System.currentTimeMillis();
            tactual = System.currentTimeMillis();
            tfinal=tinicial+1000;
            Tiempo=true;
            
        }else{
            if(tactual<tfinal){
                tactual=System.currentTimeMillis();
            }else{
                Tiempo=false;
                refrescaTiempo();
                refrescaCronometro();
            }
        }
    }
    
    public void juegoTerminado(){        
        if(this.TiempoJuego>0){
            Cronometro();
        }else{
            Greenfoot.stop();
            JOptionPane.showMessageDialog(null,"Has perdido!!");
        }
    }
    
    public void refrescaTiempo(){        
        this.TiempoJuego=this.TiempoJuego-this.delay;
        
    }
    
    public void refrescaCronometro(){
        imagen.clear();
        imagen.setColor(this.colorImagen);
        imagen.fillRect(0,0,imagen.getWidth()-1,imagen.getHeight()-1);
        imagen.setTransparency(255);
        
        imagen.setColor(this.colorText);
        imagen.drawString("Cronometro ",20,30);
        imagen.drawString("Tiempo= "+this.TiempoJuego,20,50);        
        imagen.drawString("Victor Álvarez | 1ºDAM",20,80);
        
        this.setImage(imagen);
    }
}
