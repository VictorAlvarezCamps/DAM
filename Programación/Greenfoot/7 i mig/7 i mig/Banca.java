import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banca extends Actor
{
    String va;
    String pa;
    private int puntuacion;
    private Carta Cartas[];
    private final int cartasBanca=15;
    public Banca(){
        //numCartas
        //banca
        //plantarse
        this.puntuacion=0;
    }
    
    public void manoBanca(){    
        Cartas = new Carta[cartasBanca];        
    }
    
    public void Plantarse(){
        
    }
    
    public void cogerCarta(){       
        Carta carta = new Carta(pa,va);
        carta.getCarta(pa,va);        
    }
    
    public int obtenerPuntosBanca(){
        return this.puntuacion;
    }
    
    
}
