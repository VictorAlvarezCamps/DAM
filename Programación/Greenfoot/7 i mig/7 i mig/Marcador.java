import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class ContPunts here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Marcador extends Actor
{
    private int puntosJ;
    private int puntosB;
    private GreenfootImage imatge;
    private Color colorImatge;
    private Color colorText;

    public  Marcador() 
    {
        this.puntosJ=0;
        this.puntosB=0;
        this.colorImatge=new Color(255,0,0);
        this.colorText=Color.white;
        
        imatge=new GreenfootImage(150,200);
        imatge.setColor(this.colorImatge);
        imatge.fillRect(0,0,imatge.getWidth()-1,imatge.getHeight()-1);
        imatge.setTransparency(255);
        
        imatge.setColor(this.colorText);
        imatge.drawString("Marcador",20,30);
        imatge.drawString("Puntos jugador = "+this.puntosJ,20,70);
        imatge.drawString("Puntos Banca = "+this.puntosB,20,90);
        imatge.drawString("Victor Álvarez | 1ºDAM",20,150);
        
        this.setImage(imatge);
    }    
    
    public int getPuntosJugador(){
        return this.puntosJ;
    }
    
    public void setPuntosJugador(int j){
        this.puntosJ=j;
    }
    
    public int getPuntosBanca(){
        return this.puntosB;
    }
    
    public void setPuntosBanca(int b){
        this.puntosB=b;
    }
    
    public void incrementaJugador(){
        this.puntosJ++;
        refrescar();
    }
    
    public void incrementaBanca(){
        this.puntosB++;
        refrescar();
    }

    public void refrescar() 
    {
        
        imatge.clear();
        imatge.setColor(this.colorImatge);
        imatge.fillRect(0,0,imatge.getWidth()-1,imatge.getHeight()-1);
        imatge.setTransparency(255);
        
        imatge.setColor(this.colorText);
        imatge.drawString("Marcador",20,30);
        imatge.drawString("Puntos jugador = "+this.puntosJ,20,70);
        imatge.drawString("Puntos Banca = "+this.puntosB,20,90);
        imatge.drawString("Victor Álvarez | 1ºDAM",20,150);
        
        this.setImage(imatge);
    }
}