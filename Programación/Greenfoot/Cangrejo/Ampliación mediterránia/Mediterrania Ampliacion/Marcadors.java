import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Marcadors here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Marcadors extends Actor
{
    private int valor;
    private GreenfootImage img;
    private String text;
    
    public Marcadors(int vin, String T){
        this.valor = vin;
        this.text = T;
        this.img = new GreenfootImage("barra.jpg");
        this.img.drawString(this.text+":" + this.valor , this.img.getWidth()/4,this.img.getHeight()/2);
        this.setImage(img);
    }
    
    public void contadoractualitzat(){
        this.img.clear();
        this.img =new GreenfootImage("barra.jpg");
        this.img.drawString(this.text+":" + this.valor , this.img.getWidth()/4,this.img.getHeight()/2);
        this.setImage(img);
    }
    
    public void act() 
    {
        contadoractualitzat();
    }
    
    public void aumentar(int v){
        this.valor += v;
    }
    
    public void disminuir(int v){
        this.valor -= v;
    }
}
