import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bala here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bala extends Actor
{
    private GreenfootImage img1,img2,img3,img4,img5;
    private static final double MAX_FORCE = 7.5;
    private static final double MIN_FORCE = 2.0;
    private static final double GRAVITY = 0.1;
    private static final int LOWEST_ANGLE = 0;
    
    private double exactX;
    private double exactY;

    
    private final double velX;
    private double velY; // positive is upwards
    private int seleccionar;
    private static String letra[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    public Bala(double angle, double forsa)
    {
        img1 = new GreenfootImage("button-blue.png");
        img2=new GreenfootImage("button-green.png");
        img3=new GreenfootImage("button-purple.png");
        img4=new GreenfootImage("button-red.png");
        img5=new GreenfootImage("button-yellow.png");
         
        int letraAleatoria=Greenfoot.getRandomNumber(25);
        seleccionar=letraAleatoria;
        
        int aleatorio=Greenfoot.getRandomNumber(5);
        if(aleatorio == 0){setImage(img1);this.img1.scale((img1.getWidth())/2,(img1.getHeight())/2);this.img1.drawString(letra[letraAleatoria],9,15);}
        if(aleatorio == 1){setImage(img2);this.img2.scale((img2.getWidth())/2,(img2.getHeight())/2);this.img2.drawString(letra[letraAleatoria],9,15);}
        if(aleatorio == 2){setImage(img3);this.img3.scale((img3.getWidth())/2,(img3.getHeight())/2);this.img3.drawString(letra[letraAleatoria],9,15);}
        if(aleatorio == 3){setImage(img4);this.img4.scale((img4.getWidth())/2,(img4.getHeight())/2);this.img4.drawString(letra[letraAleatoria],9,15);}
        if(aleatorio == 4){setImage(img5);this.img5.scale((img5.getWidth())/2,(img5.getHeight())/2);this.img5.drawString(letra[letraAleatoria],9,15);}
        
        double vx = getVelX(-Math.toRadians(angle), forsa);
        double vy = getVelY(-Math.toRadians(angle), forsa);
        velX = vx;
        velY = vy;
    }   
    

    /**
     * Act - do whatever the Projectile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        fly();        
    }    
    
    private void fly()
    {
        velY -= this.GRAVITY;
        moveTo(exactX + velX, exactY - velY);
    }
    
   
    private void moveTo(double x, double y)
    {
        Escenari world = (Escenari)getWorld();
        if (getY()>world.getHeight()-25)
        {
            world.removeObject(this);
        }
        else
        {
            setExactLocation(x, y);
        }
    }
    
    
    public void setLocation(int x, int y)
    {
        exactX = x;
        exactY = y;
        super.setLocation(x, y);
    }
    
    public void setExactLocation(double x, double y) 
    {
        exactX = x;
        exactY = y;
        this.setLocation((int) (x + 0.5), (int) (y + 0.5));
    }
    
     public static double getVelX(double angleRadians, double forceFactor)
    {
        return Math.cos(angleRadians) * (forceFactor );
    }
    
    public static double getVelY(double angleRadians, double forceFactor)
    {
        return -Math.sin(angleRadians) * (forceFactor);
    }
    
    public int posLletra(){
        return seleccionar;
    }
}