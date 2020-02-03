import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class SopaLetras here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SopaLetras extends Actor
{
    String letras[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    String palabras[]={"cartera","cascos","ventilador","cable","luz","cebolla","perderse","entumecido",
    "tentaculo","descifrar","palmada","bicicleta","delta","besugo"};
    private final int filas=20;
    private final int columnas=20;    
    private char matriz[][];
    
    public SopaLetras(){
        
    }
    
    public void act(){
        ponerPalabrasEnMatriz();
    }
    
    public void ponerPalabrasEnMatriz(){
        int posicion;
        
        for(int i=0;i<palabras.length;i++){
            posicion = Greenfoot.getRandomNumber(2);
            if(posicion==0){
                ponerPalabraEnHorizontal(palabras[i]);
            }else{
                ponerPalabraEnVertical(palabras[i]);
            }
        }
    }
    
    public void ponerPalabraEnHorizontal(String palabrita){
        int posX, posY;
        posX=Greenfoot.getRandomNumber(columnas-palabrita.length());
        posY=Greenfoot.getRandomNumber(filas);
        for(int i=0;i<palabrita.length();i++){
            matriz[posX+i][posY]=palabrita.charAt(i);
        }
    }
    
    public void ponerPalabraEnVertical(String palabrita){
        int posX, posY;
        posX=Greenfoot.getRandomNumber(columnas);
        posY=Greenfoot.getRandomNumber(filas-palabrita.length());
        for(int i=0;i<palabrita.length();i++){
            matriz[posX][posY+i]=palabrita.charAt(i);
        }
    }
    
   
}
