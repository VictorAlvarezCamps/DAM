import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class MarMediterrania here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MarMediterrania extends World
{

    /**
     * Constructor for objects of class MarMediterrania.
     * 
     */
    public MarMediterrania()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject(new Cranc(), 300, 375);
        creaAleatoria();
        }
    
    public void creaAleatoria(){
        int cuentaenemigos=0;
        int cuentalangosta=0;
        int cuentatortuga=0;
        int cuentapeces=0;
        List listaLangosta;
        List listaTortuga;
        List listaPez;
        
        while(cuentaenemigos<30){
             do{
                 int x=(int)(Math.random()*580+1);
                 int y=(int)(Math.random()*200+1);
                 listaLangosta = getObjectsAt(x,y,Llangosta.class);
                 listaTortuga = getObjectsAt(x,y,Tortuga.class);
                 listaPez = getObjectsAt(x,y,Peixet.class);
                 if(listaLangosta.isEmpty() && listaTortuga.isEmpty() && listaPez.isEmpty()){
                    if(cuentalangosta<5){
                       addObject(new Llangosta(), x, y);
                       cuentalangosta++;}
                    else {if(cuentatortuga<5){
                            addObject(new Tortuga(), x, y);
                            cuentatortuga++;}
                          else{if(cuentapeces<5){
                               addObject(new Peixet(), x, y);
                               cuentapeces++;
                               }
                               }
                          }cuentaenemigos++;
                          }
                 }while ((!listaLangosta.isEmpty()) || (!listaTortuga.isEmpty()) || (!listaPez.isEmpty()));
        } 
             }
        }