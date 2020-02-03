import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Municio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Salut extends Complements
{
    int velocitat;
    private GreenfootImage salut;
    private boolean TempsFinal=false;
    private long tin, tac;
    public Salut(){
        this.setSalut(20);
        velocitat=2;
        salut = new GreenfootImage("cofreSalut.png");
        int alto = salut.getHeight();
        int ancho = salut.getWidth();
        salut.scale((alto/2), (ancho/2));
        setImage(salut);
    }
    
    /**
     * Act - do whatever the Municio wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moviment();
        agafaCrancSalut();
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
