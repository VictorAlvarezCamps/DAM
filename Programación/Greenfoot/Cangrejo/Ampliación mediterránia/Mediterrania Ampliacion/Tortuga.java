import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La classe Tortuga és filla de la classe Enemic, i defineix el comportament de la tortuga
 * 
 * @author Manel Viel 
 * @version 1.0 Octubre de 2014
 */
public class Tortuga extends Enemics
{
    GreenfootImage img;
   /**
     * Constructor Tortuga, inicialitza els atributs de l'enemic tortuga amb els següents valors: 
     * Ferocitat: 30, Tipus: 3, Velocitat:6, Punts: 30.
     */
    public Tortuga(){
        this.setFerocitat(30);
        this.setTipusEnemic(3);
        this.setVelocitatEnemic(6);
        this.setPuntsEnemic(30);
        //Posem la imatge de la tortuga reflexada horitzontalment (mirant cap a l'esquerre)
        img = new GreenfootImage("tortuga.png");
        img.mirrorHorizontally();
        setImage(img);
     
    }
    public void act() 
    {
       moviment();
       atacaCranc();
    }    
    
    /**
     * Mètode moviment. Aquest mètode, implementa el moviment que farà la llangosta. 
     * En base a la seua velocitat, sempre viatja en línia recta. Quan arriba al límit esquerre, torna a 
     * apareixer en qualsevol posició de la part dreta de la pantalla.
     */
    public void moviment(){
        move(this.getVelocitatEnemic()*(-1));
        if(getX()<=0){ //he arribat al límit dret del món.
            //Apareixerem en qualsevol posició del límit esquerre del món
            setLocation(599-this.getImage().getWidth()/2,Greenfoot.getRandomNumber(400));
        
        }
    }    
}
