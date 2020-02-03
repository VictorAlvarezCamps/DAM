import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class botones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class botones extends Actor
{
    private GreenfootImage imatge;
    private Color colorImatge;
    private Color colorText;
    public void act() 
    {
         
    }
    
    public void boton1(){
        this.colorImatge=new Color(255,0,0);
        this.colorText=Color.white;
        
        imatge=new GreenfootImage(150,200);
        imatge.setColor(this.colorImatge);
        imatge.fillRect(0,0,imatge.getWidth()-1,imatge.getHeight()-1);
        imatge.setTransparency(255);
        
        imatge.setColor(this.colorText);
        imatge.drawString("Robar carta",20,30);
        
        this.setImage(imatge);
    }
    
    
}
