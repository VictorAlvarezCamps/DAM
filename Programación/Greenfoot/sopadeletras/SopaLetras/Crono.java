import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
import java.awt.Color;
/**
 * Write a description of class Crono here.
 * 
 * @author Nicolas Pons Tudela
 * @version (a version number or a date)
 */
public class Crono extends Actor
{
    private int numero,tiempo,min,seg;
    private boolean cuenta;
    private long ti,tf,t;
    
    private GreenfootImage imgCrono;
    
    public Crono(int t){
        this.cuenta = false;
        this.tiempo = t;
        descomponerTiempo();
        dibujaCrono();
    }
    
    public void act(){
        contaSegundo();
    }
    
    private void contaSegundo(){
        if(!this.cuenta){
            this.ti = System.currentTimeMillis();
            this.tf = this.ti + 1000;
            this.cuenta = true;
        }
        if(this.cuenta){
            this.t = System.currentTimeMillis();
            if(this.t >= this.tf){
                restaTiempo(1);
                repintar();
                this.cuenta = false;
            }
        }
    }
    
    private void descomponerTiempo(){
        this.min = this.tiempo/60;
        this.seg = (this.tiempo-this.min*60);
    }
    
    private void restaTiempo(int r){
        seg -= r;
        if(seg < 0){
            this.min -= 1;
            this.seg = 59;
        }
    }
    
    private void dibujaCrono(){
        this.imgCrono = new GreenfootImage(75, 50);
        this.imgCrono.setColor(new Color(255,255,204));
        this.imgCrono.fillRect(0,0,75,50);
        this.imgCrono.setFont(new Font("a", Font.BOLD, 15));
        this.imgCrono.setColor(Color.BLACK);
        this.imgCrono.drawRect(0,0,74,49);
        this.imgCrono.drawString("TIEMPO", 8, 20);
        this.imgCrono.drawString("0"+min,13,40);
        this.imgCrono.drawString(":",32,40);
        if(seg < 10){this.imgCrono.drawString("0"+seg,42,40);}
        else{this.imgCrono.drawString(""+seg,40,40);}
        setImage(this.imgCrono);
    }
    
    private void repintar(){
        this.imgCrono.clear();
        dibujaCrono();
    }
    
    public int getMin(){return this.min;}
    public int getSeg(){return this.seg;}
}
