import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Baraja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Baraja extends Actor
{
    private final int numCartas=40;
    private GreenfootImage mazo;
    private final String[] palo={"bastos","copas","espadas","oros"};
    private final String[] valor={"1","2","3","4","5","5","6","7","10","11","12"};
    private final double[] puntos={1,2,3,4,5,6,7,0.5,0.5,0.5};
    private Carta Cartas[];
    String va;
    String pa;
    Baraja b;
    
    public  Baraja(){
        
        mazo=new GreenfootImage("tapada.png");
        setImage(mazo);
        
        Cartas = new Carta[numCartas];
        for(int i=0;i<10;i++){            
            this.Cartas[i]= new Carta(palo[0],valor[i]);
            this.Cartas[i+10]= new Carta(palo[1],valor[i]);
            this.Cartas[i+20]= new Carta(palo[2],valor[i]);
            this.Cartas[i+30]= new Carta(palo[3],valor[i]);
        }        
        
        
        
    }
    
    public int[] Barajar(int Cartas[]){
        int aleatorio;
        int desordenado[]=new int[Cartas.length];
        
        for (int i=0;i<Cartas.length;i++){
            desordenado[i]=-1;
        }
        
        for (int i=0;i<Cartas.length;i++){
            do{
                aleatorio=Greenfoot.getRandomNumber(Cartas.length);
            }while(desordenado[aleatorio]!=-1);
            desordenado[aleatorio]=Cartas[i];
        }
        return desordenado;
    }
    
    public void rellenaBaraja(){
        Baraja b;
        b=new Baraja();
        
        int x=300;
        int y=300;        
        
        for(int i=0;i<numCartas;i++){
            //addObject(this.b.obtenerCarta(pa,va),x,y);
            x++;
            y++;
        }
    }
    
    public void obtenerCarta(String pa,String va){
        Carta llamacarta = new Carta(pa,va);
        llamacarta.getCarta(pa,va);
    }
    
    //public int obtenerPuntosCarta(){
        //return puntos;
    //}
    
    public double getPuntos(){
        if(valor == "1"){
            return 1.0;
        }else{
            if(valor == "2"){
                return 2.0;
            }else{
                if(valor == "3"){
                    return 3.0;
                }else{
                    if(valor == "4"){
                        return 4.0;
                    }else{
                        if(valor == "5"){
                            return 5.0;
                        }else{
                           if(valor == "6"){
                               return 6.0;
                            }else{
                                if(valor == "7"){
                                    return 7.0;
                                }else{
                                    if(valor == "10"){
                                        return 0.5;
                                    }else{
                                        if(valor == "11"){
                                            return 0.5;
                                        }else{
                                            if(valor == "12"){
                                                return 0.5;
                                            }
                                        }
                                    }
                                } 
                            } 
                        } 
                    } 
                } 
            } 
        }  
    }
    
    public void Robar(){
         
    }
    
}
