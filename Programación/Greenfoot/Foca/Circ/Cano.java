import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cano here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cano extends Actor
{
   private GreenfootImage imatge1, imatge2, imatgeCano;
   private int angle;
   int Recarga;
   int Delay;
   
   public Cano(){       
       imatge1 = new GreenfootImage("cano3.png");
       imatge2 = new GreenfootImage("pedestal.png");
       imatgeCano = new GreenfootImage(75,75);
       
       imatgeCano.drawImage(imatge2,10,15);
       imatgeCano.drawImage(imatge1,10,5);
       Recarga=20;
       Delay = 0;
       this.angle = 0;
       setImage(imatgeCano);
   }

   public void act(){
       controlaTeclat();
       teclaDisparo();
       Delay++;
   }
   
   
    public void controlaTeclat(){
        if(Greenfoot.isKeyDown("up")){
            this.angle++;
            refrescarCano();
        }
        if(Greenfoot.isKeyDown("down")){
            this.angle--;           
            refrescarCano();
        }
        if(this.angle>=90){
            this.angle=90;           
        }
        if(this.angle<=0){
            this.angle=0;           
        }
        
    }
    
    public void teclaDisparo(){
        if(Greenfoot.isKeyDown("space")){
                Disparar();
        }
    }
    
    public void Disparar(){
        if(Delay>=Recarga){
            Escenari mon = (Escenari)this.getWorld();
            getWorld().addObject(new Bala(angle,10),this.getX(),this.getY());
            Delay=0;
        }
    }
    
    public void refrescarCano(){
        this.imatgeCano.clear();
        imatgeCano.drawImage(imatge2,10,15);
        
        imatge1 = new GreenfootImage("cano3.png");
        imatge1.rotate(-this.angle); 
        imatgeCano.drawImage(imatge1,10,5);
        setImage(imatgeCano);
    }
    
    public GreenfootImage triaColorBala(){    
        GreenfootImage img=null;
        int aleatori=Greenfoot.getRandomNumber(5);
        switch (aleatori){
          case 0: img=new GreenfootImage("button-blue.png");
                        break;
          case 1: img=new GreenfootImage("button-green.png");
                        break;
          case 2: img=new GreenfootImage("button-purple.png");
                        break;
          case 3: img=new GreenfootImage("button-red.png");
                       break;
          case 4: img=new GreenfootImage("button-yellow.png");
                        break;
        }
        img.scale(25,25);
        return img;        
    }

}
