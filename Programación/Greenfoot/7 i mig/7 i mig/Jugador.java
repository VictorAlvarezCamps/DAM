import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador extends Actor
{
    String va;
    String pa;
    private int puntuacion;
    private Carta Cartas[];
    private final int cartasJugador=15;
    
    public Jugador(){
        //numCartas
        //banca
        //plantarse
        this.puntuacion=0;
    }
    
    public void manoJugador(){    
        Cartas = new Carta[cartasJugador];
        
        int x=200;
        int y=750;
        
        Baraja b;
        b=new Baraja();
        for(int i=0;i<cartasJugador;i++){
            //addObject(this.b.cogerCarta(i),x,y);
            x++;
            y++;
        }
    }
    
    public void Plantarse(){
        
    }
    
    public void cogerCarta(){       
        Carta carta = new Carta(pa,va);
        carta.getCarta(pa,va);        
    }
    
    //public void obtenerPuntosJugador(){
        //return this.puntuacion;
    //}
}