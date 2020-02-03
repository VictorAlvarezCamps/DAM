import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Plantarse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plantarse extends botones
{
    private GreenfootImage imatge;
    private Color colorImatge;
    private Color colorText;
    public Plantarse(){
        this.colorImatge=new Color(255,0,0);
        this.colorText=Color.white;
        
        imatge=new GreenfootImage(100,30);
        imatge.setColor(this.colorImatge);
        imatge.fillRect(0,0,imatge.getWidth()-1,imatge.getHeight()-1);
        imatge.setTransparency(255);
        
        imatge.setColor(this.colorText);
        imatge.drawString("Plantarse",20,20);
        
        this.setImage(imatge);  
    }
    
    //public void llamaBaraja(){        
        //if(Greenfoot.mouseClicked(this) ){
            //Baraja mazo = new Jugador();
            //mazo.Plantarse();
        //}
    //}
}
