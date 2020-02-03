import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La classe Llangosta és filla de la classe Enemic, i defineix el comportament de la llangosta
 * 
 * @author Manel Viel 
 * @version 1.0 Octubre de 2014
 */
public class Llangosta extends Enemics
{
    /**
     * Constructor Llangosta, inicialitza els atributs de l'enemic Llangosta amb els següents valors: 
     * Ferocitat: 10, Tipus: 1, Velocitat:3, Punts: 10.
     */
    public Llangosta(){
        this.setFerocitat(10);
        this.setTipusEnemic(1);
        this.setVelocitatEnemic(3);
        this.setPuntsEnemic(10);  
    }
    
    public void act() 
    {
       moviment();
       atacaCranc();
    }    
    
     
    /**
     * Mètode moviment. Aquest mètode, implementa el moviment que farà la llangosta. 
     * En base a la seua velocitat, sempre viatja en línia recta. Quan arriba al límit dret, torna a 
     * apareixer en qualsevol posició de la part esquerra de la pantalla.
     */
    public void moviment(){
        move(this.getVelocitatEnemic());
        if(getX()>=599){ //he arribat al límit dret del món.
            //Apareixerem en qualsevol posició del límit esquerre del món
            setLocation(this.getImage().getWidth()/2,Greenfoot.getRandomNumber(400));
        
        }
    }    
}
