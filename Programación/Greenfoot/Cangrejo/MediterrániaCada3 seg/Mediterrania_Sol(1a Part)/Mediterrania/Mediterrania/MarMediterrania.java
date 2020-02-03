import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.*;
/**
 * Classe que construeix el nontre MarMediterrania, i situa els elements en ell.
 * 
 * @author Manel Viel 
 * @version 1.0 Octubre de 2014
 */
public class MarMediterrania extends World
{
    private Cranc c1; // El nostre Actor principal

    /**
     * Constructor for objects of class MarMediterrania.
     * 
     */
    public MarMediterrania()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        
        //Posa els actors al món
        posaActors();      
    }
    
    public long Cada3Seg(){
        long Tiempo = System.currentTimeMillis();
        return Tiempo;       
    }
    
    public long CreaCada3seg(){
        long ti = Cada3Seg();
        long ta = Cada3Seg();
        while(ta>=ti+3000){
            ta=Cada3Seg();
        }
        return Cada3Seg();        
    }
    
    public void posaActors(){
        //Posem un cranc al mig de la pantalla i el més baix possible
        c1 = new Cranc();
        this.addObject(c1,this.getWidth()/2,this.getHeight()-(c1.getImage().getHeight()/2));
        //Posem 5 peixets al món        
        for(int i=0;i<5;i++){
            this.addObject(new Peixet(),Greenfoot.getRandomNumber(this.getWidth()),Greenfoot.getRandomNumber(this.getHeight()));
        }
        //posem 3 llangostes
        for(int i=0;i<3;i++){
            this.addObject(new Llangosta(),Greenfoot.getRandomNumber(this.getWidth()),Greenfoot.getRandomNumber(this.getHeight()));
        }
        //posem 3 Tortugues
        for(int i=0;i<3;i++){
            this.addObject(new Tortuga(),Greenfoot.getRandomNumber(this.getWidth()),Greenfoot.getRandomNumber(this.getHeight()));
        }
    }
}
