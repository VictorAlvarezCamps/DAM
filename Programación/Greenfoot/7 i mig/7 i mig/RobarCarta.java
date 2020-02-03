import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class RobarCarta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RobarCarta extends botones
{
    private GreenfootImage imatge;
    private Color colorImatge;
    private Color colorText;
    public RobarCarta(){
        this.colorImatge=new Color(255,0,0);
        this.colorText=Color.white;
        
        imatge=new GreenfootImage(100,30);
        imatge.setColor(this.colorImatge);
        imatge.fillRect(0,0,imatge.getWidth()-1,imatge.getHeight()-1);
        imatge.setTransparency(255);
        
        imatge.setColor(this.colorText);
        imatge.drawString("Robar carta",20,20);
        
        this.setImage(imatge);       
        
    }
    
    public void act(){
        llamaBaraja();
    }
    
    public void llamaBaraja(){        
        if(Greenfoot.mouseClicked(this) ){
            Baraja mazo = new Baraja();
            mazo.Robar();
        }
    }
}
