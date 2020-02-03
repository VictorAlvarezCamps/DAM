import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class ComptadorLLetres here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComptadorLLetres extends Actor
{
    private int valor;
    private GreenfootImage imatge;
   
    private Color colorImatge;
    private Color colorText;
    private int valorLetra[];
    private static String Letra[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    private final int NLetras=25;
    
    private boolean suma=false;    
    
    public  ComptadorLLetres() 
    {
        
        this.colorImatge=new Color(61,3,255);
        this.colorText=Color.white;        
        imatge=new GreenfootImage(150,580);
        imatge.setColor(this.colorImatge);
        imatge.fillRect(0,0,imatge.getWidth()-1,imatge.getHeight()-1);
        imatge.setTransparency(128);        
        imatge.setColor(this.colorText);
        
        valorLetra=new int [25];
        int y=55;
        
        for(int i=0;i<NLetras;i++){            
            imatge.drawString(Letra[i]+" = "+valorLetra[i],100,y);
            double valorLetra=Double.valueOf(valor);
            y=y+20;
        }
        
        this.setImage(imatge);
    }    
    
    public int getValor(){
        return this.valor;
    }
    
    public void setValor(int v){
        this.valor=v;
    }
    
    public void incrementa(){
        this.valor++;
        refrescar();
    }

    public void refrescar() 
    {        
        imatge.clear();
        imatge.setColor(this.colorImatge);
        imatge.fillRect(0,0,imatge.getWidth()-1,imatge.getHeight()-1);        
        imatge.setTransparency(128);
        imatge.setColor(this.colorText);        
        
        valorLetra=new int [25];
        int y=55;
        for(int i=0;i<NLetras;i++){            
            imatge.drawString(Letra[i]+" = "+valorLetra[i],100,y);
            double valorLetra=Double.valueOf(valor);
            y=y+20;
        }
        
        this.setImage(imatge);
    }   
    
    public int atrapaPosLetra(){        
        Foca foca=new Foca("foca.png","foca2.png");
        return foca.atrapaPosLetra();        
    }    
     
}
