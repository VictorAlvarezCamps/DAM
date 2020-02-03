import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Foca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Foca extends Actor
{
    private GreenfootImage imatge1, imatge2;
    private int direccion; // 1->dreta, 2->esquerra
    private final long TEMPS_ESPERA=1000;
    private long t_inicial;
    private int angle;
    public Foca(String i1, String i2){
        this.imatge1 = new GreenfootImage(i1);
        this.imatge2 = new GreenfootImage(i2);
        this.setImage(this.imatge1);
        this.direccion=1;
        t_inicial=System.currentTimeMillis();
    }

    public void act() 
    {       
        espera1Segon();
        mouFoca();
        atrapaBala();
    }   
    
    public void mouFoca(){
        if((this.getX()<700)&&(direccion==1)){ //cap a la dreta
            move(1);
        }else{
            direccion=2;
        }
        if((this.getX()>200)&&(direccion==2)){//cap a l'esquerra
                move(-1);
        }else{
            direccion=1;
        }
    }
    
    public void canviamLaImatge(){
        if(this.getImage()==this.imatge1){
            this.setImage(this.imatge2);
        }else{
            this.setImage(this.imatge1);
        }
    }
   
    public void espera1Segon(){    
        long t_actual=System.currentTimeMillis();        
        if(t_actual-t_inicial>TEMPS_ESPERA){
            canviamLaImatge();
            t_inicial=System.currentTimeMillis();
        }
    }
    
    /**
     * Method atrapaBala Si la bala esta tocant la foca, eliminem la bala del món.
     * I fem sonar el so "tambors.wav"
     */
    public void atrapaBala(){
       if(this.isTouching(Bala.class)){
           Bala b = (Bala)this.getOneIntersectingObject(Bala.class);
           Escenari mon = (Escenari) this.getWorld();
           mon.removeObject(b);
           Greenfoot.playSound("tambors.wav");
           //Incremente el Comptador de bales del Mon
           mon.getComptador().incrementa();
           mon.getComptadorLLetres().incrementa();
        }
    }
    
    public int atrapaPosLetra(){
        Bala bala=new Bala(angle,10);
        return bala.posLletra();
    }
}
