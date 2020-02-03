import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;

/**
 * Write a description of class Marcador here.
 * 
 * @author Nicolas Pons Tudela
 * @version (a version number or a date)
 */
public class Marcador extends Actor{
    private String palabras[];
    private boolean acierto[];
    
    private GreenfootImage imgMarcador;
    
    public Marcador(String p[]){
        palabras = new String[p.length];
        acierto = new boolean[p.length];
        for(int i=0;i<palabras.length;i++){
            palabras[i] = p[i];
            acierto[i] = false;
        }
        dibujaMarcador();
    }
    
    public void act(){
        repintar();
    }
    
    private void repintar(){
        this.imgMarcador.clear();
        dibujaMarcador();
    }
    
    private void dibujaMarcador(){
        this.imgMarcador = new GreenfootImage(150, 400);
        this.imgMarcador.setColor(new Color(255,255,204));
        this.imgMarcador.fillRect(0, 0, 150, 400);
        this.imgMarcador.setColor(Color.BLACK);
        this.imgMarcador.drawRect(0, 0, 149, 399);
        int x = 20;
        int y = 20;
        for(int i = 0; i < palabras.length; i++){
            if(acierto[i]){this.imgMarcador.setColor(new Color(204,255,204));}
            else{this.imgMarcador.setColor(Color.BLACK);}
            this.imgMarcador.setFont(new Font("a", Font.BOLD, 15));
            this.imgMarcador.drawString(palabras[i], x, y);
            y = y +20;
        }
        setImage(this.imgMarcador);
    }
    
    public boolean getAcierto(int p){return this.acierto[p];}
    public void setAcierto(boolean b, int p){this.acierto[p] = b;}
}
