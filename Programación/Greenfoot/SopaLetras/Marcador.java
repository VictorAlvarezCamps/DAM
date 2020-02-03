import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Marcador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Marcador extends Actor
{
    String palabras[]={"cascos","ventilador","cable","luz","cebolla","perderse","entumecido",
    "tentaculo","descifrar","palmada","bicicleta","delta","besugo"};
    String palabraAsquerosa;
    private GreenfootImage imagen;
    private Color colorImagen;
    private Color colorText;
    public Marcador() 
    {     
        palabrasMarcador();   
    }
    
    public void palabrasMarcador(){
        int x=15;
        int y=20;
        
        this.colorImagen=new Color(255,0,0);
        this.colorText=Color.white;
            
        imagen=new GreenfootImage(100,300);
        imagen.setColor(this.colorImagen);
        imagen.fillRect(0,0,imagen.getWidth()-1,imagen.getHeight()-1);
        imagen.setTransparency(255);            
        imagen.setColor(this.colorText);   
        
        for(int i=0;i<palabras.length;i++){
            imagen.drawString(palabras[i],x,y);
            y+=20;
        }
       
        this.setImage(imagen);
    }
    
    public void cogePalabras(){
        for(int i=0;i<palabras.length;i++){
            palabraAsquerosa=palabras[i];
        }
    }
    
    public String getPalabras(){
        return palabraAsquerosa;
    }
    
    
}
