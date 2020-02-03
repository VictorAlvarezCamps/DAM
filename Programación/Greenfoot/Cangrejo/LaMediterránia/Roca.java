import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Roca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Roca extends Actor
{
    int velocidad;
    
    private GreenfootImage roca;
    
    public Roca()
    {
        velocidad = 2;
        roca = new GreenfootImage("roca.png");
        int alt = roca.getHeight();
        int anch = roca.getWidth();
        roca.scale((alt/2), (anch/2));
        setImage(roca);
    }
    
    /**
     * Act - do whatever the Roca wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       move();
       mataEnemics();
    }
    
    public void move()
    {
        int x = getX();
        int y = getY();
        
        y = y-velocidad;
        
        setLocation(x, y);
    }
    
    public boolean bordeMundoY()
    {
        World mar = getWorld();
        int y = getY();
        
        if ( y == 0){return true;}
        return false;
    }
    
    public  boolean encuentraEnemigo()
    {
        if (isTouching(Enemics.class)){return true;}
        return false;
    }

    public void mataEnemics()
    {
        if(bordeMundoY() || encuentraEnemigo()){
            removeTouching(Enemics.class);
            getWorld().removeObject(this);
        }
    }
}