import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class ContPunts here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comptador extends Actor
{
    private int valor;
    private GreenfootImage imatge;
    private Color colorImatge;
    private Color colorText;

    public  Comptador() 
    {
        this.valor=0;
        this.colorImatge=new Color(61,3,255);
        this.colorText=Color.white;
        
        imatge=new GreenfootImage(150,200);
        imatge.setColor(this.colorImatge);
        imatge.fillRect(0,0,imatge.getWidth()-1,imatge.getHeight()-1);
        imatge.setTransparency(128);
        
        imatge.setColor(this.colorText);
        imatge.drawString("Victor",100,50);
        imatge.drawString(""+this.valor,100,100);
        imatge.drawString("Examen",100,150);
        
        this.setImage(imatge);
    }
    
    
    public int getValor(){
        return this.valor;
    }
    public void setValor(int n){
        this.valor=n;
    }
    public void incrementa(){
        this.valor++;
        refrescar();
    }
    public void decrementa(){
        this.valor--;
        refrescar();
    }

    public void refrescar() 
    {
        
        imatge.clear();
        imatge.setColor(this.colorImatge);
        imatge.fillRect(0,0,imatge.getWidth()-1,imatge.getHeight()-1);
        imatge.setTransparency(128);
        
        imatge.setColor(this.colorText);
        imatge.drawString("Victor",100,50);
        imatge.drawString(""+this.valor,100,100);
        imatge.drawString("Examen",100,150);
        
        this.setImage(imatge);
    }
}
