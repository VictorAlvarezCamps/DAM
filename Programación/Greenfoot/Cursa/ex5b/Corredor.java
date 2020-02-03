import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Classe Corredor. Conté informació relativa a cada corredor que participa en la cursa.
 * De cada corredor emmagatzemem una imatge del corredor, un nom/dorsal i la quantitat de metres
 * que ha recorregut. 
 * 
 * @author Victor Alvarez
 * @version 15/12/2011
 */
public class Corredor extends Actor
{
    GreenfootImage imatge;  // una imatge del corredor
    String nom;             // un nom/dorsal que identifica al corredor
    int pixelsRecorreguts;  // quantitat de pixels que ha recorregut
    int distancia;
    Class clss;
    
    /**
     * Corredor Constructor
     *
     * @param image la imatge que representarà al corredor
     * @param name el nom que identificarà a eixe corredor
     */
    public Corredor(String image, String name){
        //falta que ho implementeu!!!
        imatge=new GreenfootImage("serp.png");
        setImage(imatge);
        pixelsRecorreguts=65; // tots els corredors comencen en el pixel 65 (30+(ampleImatge/2))
    }
    
    /**
     * Method avanca. Permet a un corredor avançar una distància donada en la cursa. Cal tenir en conter que
     * un metre (en condicions normals equival a 10 pixels), i si esta atravessant algun obstacle, equival a 5 pixels.
     * Aquest mètode incrementa el camp pixelsRecorreguts, en la quantitat que ha avançat el corredor
     * @param distancia Distància (en metres) que avança un corredor
     */
    public void avanca(int distancia){
        //falta que ho implementeu!!!
        //Amb aquest li direm que si esta en la coordenada X y te menys
        if(this.getX()<600){
            move(Greenfoot.getRandomNumber(10));        
        }
        
    }
    
    /**
     * Act - do whatever the Corredor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        avanca(distancia);
    }    

    /**
     * Method canSee. Mètode que permet saber si un corredor pot vore un obstacle durant la seua trajectòria.
     *
     * @param clss Classe que representa un obstacle
     * @return true o false
     */
    public boolean canSee(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;        
    }
    
    
}
