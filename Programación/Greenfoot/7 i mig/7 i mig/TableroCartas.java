import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TableroCartas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TableroCartas extends World
{
    private Marcador c1;
    private Baraja b1;
    private Carta c2; 
    private Jugador j1;
    private Banca ba;
    public String palo;
    private int valor;
    private botones bo1,bo2;
    private boolean turno;
    private int jPuntos;
    private int jPuntosNuevos;
    private int bPuntosNuevos;
    private int bPuntos;
    
    public TableroCartas(){    
        super(800, 580, 1);
        b1=new Baraja();
        bo1=new Plantarse();
        bo2=new RobarCarta();
        c1=new Marcador();
        j1=new Jugador();
        ba=new Banca();
        //jPuntos=j1.obtenerPuntosJugador();
        //bPuntos=ba.obtenerPuntosBanca();
        this.addObject(c1,75,230);
        this.addObject(bo1,65,395);
        this.addObject(bo2,65,351);
        this.addObject(new Baraja(),216,267);
        
        if(jPuntos >= 7.5 | bPuntos >= 7.5){
            finPartida();
        }
    }
    
    public void act(){
       
    }
    
    public void cambiarTurno(){
        if (turno) {
            turno=false;
        }
        else {
            turno=true;
        }
    }
    
    public void finPartida(){
        
    }
    
    public void EmpezarUnaPartida(){
        if(turno==false){
        
        }else if(!turno){
                   
        }
    }
    
    // public void ModificaPuntosJugador(){
        //this.jPuntos = j1.obtenerPuntosJugador();
        //if(jPuntos<20){
            //int suma = this.jPuntos+this.jPuntosNuevos;
            //this.c1.aumentar(suma);
        //}
    //}
    
    //public void ModificaPuntosBanca(){
        //this.bPuntos = ba.obtenerPuntosBanca();
        //if(jPuntos<20){
            //int suma = this.jPuntos+this.bPuntosNuevos;
            //this.c1.aumentar(suma);
        //}
    //}
    
    public boolean getTurno(){
        return turno;
    }
}