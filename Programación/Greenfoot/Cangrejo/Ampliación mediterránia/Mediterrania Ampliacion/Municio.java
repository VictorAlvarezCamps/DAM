import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Municio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Municio extends Complements
{
    int velocitat;
    private boolean TempsFinal=false;
    private long tin, tac;
    public Municio(){
        this.setcomMunicio(15);
        this.velocitat=2;        
    }
    
    /**
     * Act - do whatever the Municio wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moviment();
        agafaCrancMunicio();
        TempsComplement();
    } 
    
    public void moviment(){
        int x = getX();
        int y = getY();
        
        x = x;
        y = y + velocitat;
        
        setLocation (x, y);
    }
    
    private void TempsComplement(){
        if (this.getY()>=575){
            if(TempsFinal==false){
                tin = System.currentTimeMillis();
                tac = System.currentTimeMillis();
                TempsFinal=true;
            }else{
                if((tac-tin)>=2000){
                    World mar=getWorld();
                    mar.removeObject(this);
                }else{
                    tac=System.currentTimeMillis();
                }
            }
        }
    }
}
