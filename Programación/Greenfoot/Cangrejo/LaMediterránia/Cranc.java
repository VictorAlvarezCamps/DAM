import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cranc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cranc extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    int velocidad;
    int vida;
    int Recarga;
    int Delay;
    int puntuacion;
        
     public Cranc()
    {
        image1 = new GreenfootImage("cranc.png");
        image2 = new GreenfootImage("cranc2.png");
        setImage(image1);
        vida = 100;
        puntuacion = 0;
        Recarga = 30;
        Delay = 0;
        velocidad = 2;
    }
    
    /**
     * Act - do whatever the Cranc wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        teclaDerecha();
        teclaIzquierda();
        teclaDisparo();
        Delay++;
    }
    
    public void switchImage()
    {
        if (getImage() == image1) {setImage(image2);}
        else{setImage(image1);}
    }
  
    public void moveIzquierda(){
        setLocation(getX()-velocidad,getY());     
    }
    
    public void moveDerecha(){
        int x = getX();
        int y = getY();
        x = x+velocidad;
        setLocation(x,y);     
    }
    
    public void disparo(){
        if(Delay>=Recarga){
           Roca R = new Roca();
           getWorld().addObject(R, getX(), getY());
           Delay = 0;
       }
    }
    
    public void teclaDerecha()
    {
        if(Greenfoot.isKeyDown("right")){
            moveDerecha();
            switchImage();
        }
    }
    
    public void teclaIzquierda()
    {
        if(Greenfoot.isKeyDown("left")){
            moveIzquierda();
            switchImage();
        }
    }
    
    public void teclaDisparo()
    {
        if (Greenfoot.isKeyDown("space")){
            disparo();
        }
    }
    
    public void muerte()
    {
        if (vida <= 0){
            Greenfoot.playSound("gameOver.wav");
            getWorld().removeObject(this);
        }
    }
    
    public int getVida()
    {
        return vida;
    }
    
    public int getPuntuacion()
    {
        return puntuacion;
    }
}
