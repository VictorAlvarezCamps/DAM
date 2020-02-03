import greenfoot.*;  // imports Actor, World, Greenfoot, GreenfootImage

import java.util.Random;

/**
 * A world where wombats live.
 * 
 * @author Michael Kolling
 * @version 1.0.1
 */
public class WombatWorld extends World
{
    private Random randomizer = new Random();
    
    /**
     * Create a new world with 8x8 cells and
     * with a cell size of 60x60 pixels
     */
    public WombatWorld() 
    {
        super(8, 8, 60);
        setBackground("cell.jpg");
        populate();
    }

    /**
     * Populate the world with a fixed scenario of wombats and leaves.
     */    
    public void populate()
    {
        Wombat w1 = new Wombat();
        addObject(w1, 3, 3);
        
        

        Leaf l1 = new Leaf();
        addObject(l1, 0, 2);

        
        
        //Posem les roques
        addObject(new Rock(), 0, 0);
        addObject(new Rock(), 1, 0);
        addObject(new Rock(), 2, 1);
        addObject(new Rock(), 1, 2);
        addObject(new Rock(), 1, 3);
        addObject(new Rock(), 1, 4);
        addObject(new Rock(), 1, 5); 
        addObject(new Rock(), 1, 6); 
        addObject(new Rock(), 3, 1);
        addObject(new Rock(), 3, 5);
        addObject(new Rock(), 4, 1);
        addObject(new Rock(), 4, 2);
        addObject(new Rock(), 4, 3);
        addObject(new Rock(), 4, 4);
        addObject(new Rock(), 4, 5);
        addObject(new Rock(), 3, 7);
        addObject(new Rock(), 5, 2);       
        addObject(new Rock(), 5, 5);
        addObject(new Rock(), 5, 6);       
        addObject(new Rock(), 7, 6);
        addObject(new Rock(), 7, 4);

    }
    
    /**
     * Place a number of leaves into the world at random places.
     * The number of leaves can be specified.
     */
    public void randomLeaves(int howMany)
    {
        for(int i=0; i<howMany; i++) {
            Leaf leaf = new Leaf();
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(leaf, x, y);
        }
    }
}