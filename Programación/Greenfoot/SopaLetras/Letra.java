import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Letra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Letra extends Actor
{
    private char letras[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','R','S','T','U','V','W','X','Y','Z'};
    String palabras[]={"cartera","cascos","ventilador","cable","luz","cebolla","perderse","entumecido",
    "tentaculo","descifrar","palmada","bicicleta","delta","besugo"};
    private GreenfootImage imagen;
    private Color colorImagen;
    private Color colorText;
    private boolean letraMarcada;
    private char letraMaldita;
    String palabraza;
    public void act(){
        letraMarcada();
    }
    
    public Letra() 
    {
        int aleatorio = Greenfoot.getRandomNumber(letras.length);
        letraMaldita=letras[aleatorio];
        
        this.colorImagen= new Color(255,255,255);
        this.colorText=Color.black;
        
        imagen=new GreenfootImage(20,20);
        imagen.setColor(Color.white);
        imagen.fillRect(0,0,imagen.getWidth()-1,imagen.getHeight()-1);        
        imagen.setTransparency(255);
        
        imagen.setColor(this.colorText);
        imagen.drawString(""+letraMaldita,5,14);
        
        this.setImage(imagen);
    }    
    
    public void refrescaLetra(){
        imagen.clear();
        this.colorImagen= new Color(255,255,255);
        this.colorText=Color.black;
        
        imagen=new GreenfootImage(20,20);
        imagen.setColor(Color.white);
        imagen.fillRect(0,0,imagen.getWidth()-1,imagen.getHeight()-1);        
        imagen.setTransparency(255);
        
        imagen.setColor(this.colorText);
        imagen.drawString(""+letraMaldita,5,14);
        
        this.setImage(imagen);
    }
    
    public void refrescaLetraNoPintada(){
        imagen.clear();
        this.colorImagen= new Color(255,255,255);
        this.colorText=Color.black;
        
        imagen=new GreenfootImage(20,20);
        imagen.setColor(colorImagen);
        imagen.fillRect(0,0,imagen.getWidth()-1,imagen.getHeight()-1);        
        imagen.setTransparency(255);
        
        imagen.setColor(this.colorText);
        imagen.drawString(""+letraMaldita,5,14);
        
        this.setImage(imagen);
    
    }
    
    public void refrescaLetraPintada(){
        imagen.clear();
        this.colorImagen= new Color(255,0,0);
        this.colorText=Color.black;
        
        imagen=new GreenfootImage(20,20);
        imagen.setColor(colorImagen);
        imagen.fillRect(0,0,imagen.getWidth()-1,imagen.getHeight()-1);        
        imagen.setTransparency(255);
        
        imagen.setColor(this.colorText);
        imagen.drawString(""+letraMaldita,5,14);
        
        this.setImage(imagen);
    
    }   
    
    public void letraMarcada(){
        if(Greenfoot.mouseClicked(this)){      
            letraMarcada=true;
            if(getMarcada()==false){
                refrescaLetraNoPintada();
            }else{ 
                letraMarcada=true;
                if(getMarcada()==true){
                    refrescaLetraPintada();
                }
            }    
        }      
    }
    
    public boolean getMarcada(){
        return letraMarcada;
    }
    
     public void setMarcada(boolean mar){
        this.letraMarcada = mar;
    }    
    
    public char getdevuelveLetra(){
        return letraMaldita;
    }
    
     public void setdevuelveLetra(char mal){
        this.letraMaldita = mal;
    }
    
    
    
}
