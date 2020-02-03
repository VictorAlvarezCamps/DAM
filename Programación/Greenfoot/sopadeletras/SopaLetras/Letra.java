import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;

/**
 * Write a description of class Letra here.
 * 
 * @author Nicolas Pons Tudela
 * @version (a version number or a date)
 */
public class Letra extends Actor
{
    private char letra;
    private boolean seleccion,acierto;
    
    private GreenfootImage imgLetra;
    
    public Letra(char l){
        this.letra = l;
        this.seleccion = false;
        imagen();
    }
    
    public void act(){
        redibuja();
        mueveRaton();
    }
    
    private void mueveRaton(){
        if(Greenfoot.mouseClicked(this) && !this.seleccion){
            int y = (getX()-50)/30;
            int x = (getY()-170)/30;
            Tablero t = (Tablero) getWorld();
            if(!t.isSeleccion()){
                this.seleccion = true;
                t.setXIni(x);
                t.setYIni(y);
                t.isSeleccion(true);
            }
            else{
                t.setXFin(x);
                t.setYFin(y);
                t.seleccionaPalabra();
            }
        }
    }
    
    private void imagenCorrecta(){
        this.imgLetra.clear();
        this.imgLetra = new GreenfootImage(30,30);
        this.imgLetra.setColor(new Color(204,255,204));
        this.imgLetra.fillRect(0,0,30,30);
        this.imgLetra.setColor(Color.BLACK);
        this.imgLetra.drawRect(0,0,29,29);
        this.imgLetra.setFont(new Font("a",Font.PLAIN,18));
        this.imgLetra.drawString(""+this.letra, 9, 21);
    }
    
    private void imagen(){
        this.imgLetra = new GreenfootImage(30,30);
        if(this.seleccion){
            this.imgLetra.setColor(new Color(204,255,255));
            this.imgLetra.fillRect(0,0,30,30);
            this.imgLetra.setColor(Color.BLACK);
            this.imgLetra.drawRect(0,0,29,29);
            this.imgLetra.setFont(new Font("a",Font.PLAIN,18));
            this.imgLetra.drawString(""+this.letra, 9, 21);
        }
        else{
            if(this.acierto){
                imagenCorrecta();
            }
            else{
                this.imgLetra.setColor(new Color(255,255,204));
                this.imgLetra.fillRect(0,0,30,30);
                this.imgLetra.setColor(Color.BLACK);
                this.imgLetra.drawRect(0,0,29,29);
                this.imgLetra.setFont(new Font("a",Font.PLAIN,18));
                this.imgLetra.drawString(""+this.letra, 9, 21);
            }
        }
        setImage(this.imgLetra);
    }
    
    private void redibuja(){
        this.imgLetra.clear();
        imagen();
    }
    
    public char getLetra(){return this.letra;}
    
    public boolean isSeleccion(){return this.seleccion;}
    public void isSeleccion(boolean b){this.seleccion = b;}
    
    public boolean isAcierto(){return this.acierto;}
    public void isAcierto(boolean b){this.acierto = b;}
}
