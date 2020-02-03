import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Carta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carta extends Actor
{
    String va;
    String pa;
    private GreenfootImage cara=null;
    private GreenfootImage atras= null;
    Carta c;
    public Carta(String pa, String va){
        this.va=va;
        this.pa=pa;
        //puntuacion
        //cara = new ImageIcon(getClass().getResource("assets/images/caraQ.png"));
        cara = new GreenfootImage(pa+"-"+va+".png");
        atras = new GreenfootImage("tapada.png");
        this.setImage(atras); 
    }
        
    public void girarCarta(){
        //verificar que tipo de cara esta visualizada
        if(this.getImage().equals(cara)){
            this.setImage(atras);
        }
        if(this.getImage().equals(atras)){
            this.setImage(cara);
        }
    }    
    
    public static Carta getCarta(String pa, String va){
        Carta c = new Carta(pa,va);
        return c;
    }
}
