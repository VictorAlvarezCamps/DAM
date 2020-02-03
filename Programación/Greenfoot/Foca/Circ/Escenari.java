import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Escenari here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Escenari extends World
{
   private Foca f1;
   private Comptador c1;
   private ComptadorLLetres c2;

    /**
     * Constructor for objects of class Escenari.
     * 
     */
    public Escenari()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1,false); 
        f1= new Foca("foca.png","foca2.png");
       
        //addObject(f1,coordXFoca(), 550);
        addObject(f1,Greenfoot.getRandomNumber(501)+200, 550);
        //afegiré el cano
        addObject(new Cano(),50, 550);
        //Cree el comptador i l'afegisc
        c1=new Comptador();
        c2=new ComptadorLLetres();
        addObject(c1,726,97);
        addObject(c2,3,250);
    }
    
    public int coordXFoca(){
        int xAleat = Greenfoot.getRandomNumber(701);
        while(xAleat<200){
            xAleat = Greenfoot.getRandomNumber(701);
        }
        return xAleat;       
        
    }
    
    public Comptador getComptador(){
        return this.c1;
    }
    
    public ComptadorLLetres getComptadorLLetres(){
        return this.c2;
    }
}
