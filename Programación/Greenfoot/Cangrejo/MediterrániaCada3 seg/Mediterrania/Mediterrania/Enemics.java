import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemics here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemics extends Actor
{
   private int tipusEnemic;
   private int puntsEnemic;
   private int ferocitat;
   private int velocitatEnemic;
   private int cada3seg;
   
   public void eliminaEnemicDelMon(){
        World mon = this.getWorld();
        mon.removeObject(this);
    }
    
    public void atacaCranc(){
        //Si l'enemic ataca el cranc, li descomptarà tanta vida com ferocitat tinga l'enemic
        if(this.isTouching(Cranc.class)){
            Cranc elCranc = (Cranc) this.getOneIntersectingObject(Cranc.class);
            elCranc.setVida(elCranc.getVida()-this.getFerocitat());
            System.out.println("Vida Cranc: "+elCranc.getVida());
            //Situem este enemic ben lluny del cranc
            this.setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()),Greenfoot.getRandomNumber(getWorld().getHeight()));
        }
    }
    
    // Getters i setters
    public int getTipusEnemic(){
        return this.tipusEnemic;
    }
    public void setTipusEnemic(int t){
        this.tipusEnemic = t;
    }
    public int getPuntsEnemic(){
        return this.puntsEnemic;
    }
    public void setPuntsEnemic(int p){
        this.puntsEnemic = p;
    }
    public int getFerocitat(){
        return this.ferocitat;
    }
    public void setFerocitat(int f){
        this.ferocitat = f;
    }
    public int getVelocitatEnemic(){
        return this.velocitatEnemic;
    }
    public void setVelocitatEnemic(int v){
        this.velocitatEnemic = v;
    }
    
}
