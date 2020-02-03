import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tortuga here.
 * La Tortuga se mueve hacia abajo.
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tortuga extends Enemics
{
    int velocidad;
    
    public Tortuga()
    {
        tipoEnemic = 1;
        puntos = 10;
        ferocidad = 10;
        velocidad = 1;
        setRotation(90);        
    }
    
    /**
     * Act - do whatever the Tortuga wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(bordeMundoY()){
            setLocation(getX(),0);
        }
        move();
        encuentraCranc();
        teletrans();
    }
    
    public void move()
    {
        int x = getX();
        int y = getY();
        
        x = x;
        y = y + velocidad;
        
        setLocation (x, y);
    }

}