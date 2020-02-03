import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class MundoSopa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MundoSopa extends World
{    
    private Cronometro c1;
    private SopaLetras p1;
    private Marcador m1;
    private final int filas=20;
    private final int columnas=20;
    public MundoSopa()
    {   
        super(600, 600, 1);
        c1=new Cronometro();
        p1=new SopaLetras();
        m1=new Marcador();
        this.addObject(c1,532,48);
        this.addObject(m1,565,300);
        llenaLetras();
        llenaPalabras();
    }
    
    public void llenaLetras(){        
        int x=70;
        int y=120;
        
        for(int i=0;i<filas;i++){
            for(int m=0;m<columnas;m++){
               this.addObject(new Letra(),x,y);
               x+=20;
            }
            x=70;
            y+=20;
        }        
    } 
    
    public void llenaPalabras(){
        //int x=getX();
        //int y=getY();
        
        int x=Greenfoot.getRandomNumber(20);
        int y=Greenfoot.getRandomNumber(20);
        
        for(int f=0;f<filas;f++){
            for(int c=0;c<columnas;c++){
                //p1.drawString(obtenerPalabras(),x,y);
            }
        }
    }
    
    public void obtenerPalabras(){
        Marcador palabras=new Marcador();
        palabras.getPalabras();
    }
}
