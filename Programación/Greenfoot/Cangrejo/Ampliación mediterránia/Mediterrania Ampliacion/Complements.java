import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Complements here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Complements extends Actor
{
    private int comMunicio;
    private int velocitatcomplement;
    private int salut;
    public void eliminaComplementDelMon(){
        World mon = this.getWorld();
        mon.removeObject(this);
    }
   
    public void act(){
        agafaCrancSalut();
        agafaCrancMunicio();
    }
    
    public void agafaCrancSalut(){
        if(this.isTouching(Cranc.class)){
            Cranc elCranc = (Cranc) this.getOneIntersectingObject(Cranc.class);
            elCranc.setVida(elCranc.getVida()+this.getSalut());
            this.setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()),Greenfoot.getRandomNumber(getWorld().getHeight()));
        }
    }
    
    public void agafaCrancMunicio(){
        if(this.isTouching(Cranc.class)){
            Cranc elCranc = (Cranc) this.getOneIntersectingObject(Cranc.class);
            elCranc.setMunicio(elCranc.getMunicio()+this.getcomMunicio());
            this.setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()),Greenfoot.getRandomNumber(getWorld().getHeight()));
        }
    }
    
    public int getcomMunicio(){
        return this.comMunicio;
    }
    
    public void setcomMunicio(int CM){
        this.comMunicio = CM;
    }
    
    public int getSalut(){
        return this.salut;
    }
    
    public void setSalut(int S){
        this.salut = S;
    }
    
    public int getVelocitatComplement(){
        return this.velocitatcomplement;
    }
    
    public void setVelocitatComplement(int vc){
        this.velocitatcomplement = vc;
    } 
}
