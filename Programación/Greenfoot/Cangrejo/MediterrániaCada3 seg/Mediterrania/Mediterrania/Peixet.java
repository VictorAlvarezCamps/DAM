import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La classe Peixet és filla de la classe Enemic, i defineix el comportament dels peixets.
 * 
 * @author Manel Viel 
 * @version 1.0 Octubre de 2014
 */
public class Peixet extends Enemics
{
    GreenfootImage img; //imatge que representarà aquest peixet
    int distancia; // disatància que ha de desplaçar-se cap amunt i cap avall
    int desplacament; //la distància que duu desplaçada
    boolean estaBaixant; //El sentit del moviment (cap amunt, cap avall)
    
     /**
     * Constructor Peixet, inicialitza els atributs de l'enemic Peixet amb els següents valors: 
     * Ferocitat: 5, Tipus: 2, Velocitat:2, Punts: 15.
     */

    public Peixet(){
        this.distancia = 25;
        this.estaBaixant=true;
  
        //Generem un numero a l'atzar, per a vore quina de les tres imatges tindrà el peixet.
        int num = Greenfoot.getRandomNumber(3);
        switch(num){
            case 0: img = new GreenfootImage("peix1.png");
                    break;
            case 1: img = new GreenfootImage("peix2.png");
                    break;
            case 2: img = new GreenfootImage("peix3.png");
                    break;
        }
        
        this.setImage(img); 
        // Establim els atributs de la classe enemic
        this.setFerocitat(5);
        this.setTipusEnemic(2);
        this.setVelocitatEnemic(2);
        this.setPuntsEnemic(15);
    }
    
    public void act() 
    {
       moviment();
       atacaCranc();
    }    

    /**
     * Mètode moviment. Aquest mètode, implementa el moviment que farà el peixet. 
     * En base a la seua velocitat, sempre viatja en línia recta. Quan arriba al límit dret, torna a 
     * apareixer en qualsevol posició de la part esquerra de la pantalla.
     */
    public void moviment(){
        //Implementarem el moviment en zig-zag
        //Comencem baixant 
        if(estaBaixant){
            if(desplacament<distancia){
                this.setLocation(this.getX()+this.getVelocitatEnemic(),this.getY()+this.getVelocitatEnemic());
                desplacament++;
            }else{ 
                estaBaixant=false;
                desplacament=0;
            }
        }else{ //Ara el de pujar
            if(desplacament<distancia){
                this.setLocation(this.getX()+this.getVelocitatEnemic(),this.getY()-this.getVelocitatEnemic());
                desplacament++;
            }else{ 
                estaBaixant=true;
                desplacament=0;
            }
        }
        //Si arribem al finaldel món, situarem els peixets en posicions aleatòries al principi
        if(getX()>=getWorld().getWidth()-1){
             this.setLocation(getImage().getWidth()/2,Greenfoot.getRandomNumber(getWorld().getHeight()));
        }
    }
    
    
    
    
    
    
    
    
    
    
    
}
