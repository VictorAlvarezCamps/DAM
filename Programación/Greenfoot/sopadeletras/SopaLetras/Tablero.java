import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
import java.util.List;
import java.io.*;
/**
 * Write a description of class Tablero here.
 * 
 * @author Nicolas Pons Tudela 
 * @version (a version number or a date)
 */
public class Tablero extends World
{
    private File f;
    private String llistat[];
    
    private static final int FILAS = 10;
    private static final int COLUMNAS = 10;
    private static String palabras[] = {"PACO","PEPE","JUAN","JOSE"};
    
    private int xIni,yIni,xFin,yFin;
    private boolean seleccion;
    private SopaLetras sopa;
    private Crono crono;
    private Marcador mPalabras;
    
    private GreenfootImage fondo;
    
    
    
    public Tablero()
    {    
        super(600,600, 1);
        this.fondo = new GreenfootImage("Papel.jpg");
        setBackground(this.fondo);
        seleccion = false;
        dibujaObjetos();
        
        try{
               /*f=new File("F:\\Florida\\Programación\\Greenfoot\\sopadeletras\\SopaLetras\\LlistatNoms.txt");*/
               f=new File("G:\\Florida\\Programación\\Greenfoot\\sopadeletras\\SopaLetras\\LlistatNoms.txt");               
               FileReader fr = new FileReader(f);
               BufferedReader br = new BufferedReader(fr);
               int c;
               String linea;
               /*while((c=(int)fr.read())!=-1){
                   System.out.print((char)c);
               }*/
               while((linea=br.readLine())!=null){
                   System.out.println(linea);
               }
               fr.close();
        }catch(FileNotFoundException e1){
            System.out.println("Fichero no encontrado!!!");
            //e1.printStackTrace();
        }catch(IOException e2){
            e2.printStackTrace();
        }catch(Exception e){
            
        }
    }
    
    public void act(){
        compruebaTiempo();
    }
    
    public void seleccionaPalabra(){
        String palabra = "";
        if(this.xIni == this.xFin && this.yIni < this.yFin){
            palabra = seleccionH();
        }
        if(this.yIni == this.yFin && this.xIni < this.xFin){
            palabra = seleccionV();
        }
        if(this.xIni != this.xFin && this.yIni != this.yFin){
            this.seleccion = false;
            Letra l = this.sopa.getLetra(xIni, yIni);
            l.isSeleccion(false);
        }
        compruebaPalabra(palabra);
        compruebaGanar();
    }
    
    private void compruebaGanar(){
        int ganar = 0;
        for(int i=0;i<this.palabras.length;i++){
            if(this.mPalabras.getAcierto(i)){
                ganar++;
            }
        }
        if(ganar == 4){
            JOptionPane.showMessageDialog(null,"Has encontrado todas las palabras", "HAS GANADO", JOptionPane.INFORMATION_MESSAGE);
            Greenfoot.stop();
        }
    }
    
    private void compruebaPalabra(String p){
        boolean deselec = false;
        for(int i =0;i<this.palabras.length;i++){
            if(p.compareTo(this.palabras[i]) == 0){
                this.mPalabras.setAcierto(true, i);
                deselec = false;
                break;
            }
            else{
                deselec = true;
            }
        }
        if(deselec){
            deseleccion();
        }
        seleccion = false;
    }
    
    private void deseleccion(){
        int pos;
        Letra l;
        if(this.xIni == this.xFin && this.yIni < this.yFin){
            pos = this.yFin-this.yIni;
            for(int i =0;i<=pos;i++){
                l = this.sopa.getLetra(xIni, yIni+i);
                l.isSeleccion(false);
            }
        }
        if(this.yIni == this.yFin && this.xIni < this.xFin){
            pos = this.xFin-this.xIni;
            for(int i =0;i<=pos;i++){
                l = this.sopa.getLetra(xIni+i, yIni);
                l.isSeleccion(false);
            }
        }
    }
    
    private String seleccionH(){
        int pos = this.yFin-this.yIni;
        String palabra = "";
        for(int i =0;i<=pos;i++){
            Letra l = this.sopa.getLetra(xIni,yIni+i);
            l.isSeleccion(true);
            palabra += l.getLetra();
        }
        return palabra;
    }
    
    private String seleccionV(){
        int pos = this.xFin-this.xIni;
        String palabra = "";
        for(int i =0;i<=pos;i++){
            Letra l = this.sopa.getLetra(xIni+i,yIni);
            l.isSeleccion(true);
            palabra += l.getLetra();
        }
        return palabra;
    }
    
    private void dibujaObjetos(){
        this.sopa = new SopaLetras(palabras);
        this.crono = new Crono(500);
        addObject(crono, 72, 75);
        this.mPalabras = new Marcador(palabras);
        addObject(mPalabras,470,300);
        dibujaLetras();
    }
    
    private void dibujaLetras(){
        int x = 50;
        int y = 170;
        for(int i=0;i<FILAS;i++){
            for(int j=0;j<COLUMNAS;j++){
                addObject(this.sopa.getLetra(i,j),x,y);
                x += 30;
            }
            y += 30;
            x = 50;
        }
    }
    
    private void compruebaTiempo(){
        if(this.crono.getMin() <= 0){
            if(this.crono.getSeg() <= 0){
                JOptionPane.showMessageDialog(null,"Se ha acabado el tiempo", "FIN DEL JUEGO", JOptionPane.INFORMATION_MESSAGE);
                Greenfoot.stop();
            }
        }
    }
    
    public boolean isSeleccion(){return this.seleccion;}
    public void isSeleccion(boolean b){this.seleccion = b;}
    
    public int getXIni(){return this.xIni;}
    public void setXIni(int x){this.xIni = x;}
    
    public int getYIni(){return this.yIni;}
    public void setYIni(int y){this.yIni = y;}
    
    public int getXFin(){return this.xFin;}
    public void setXFin(int x){this.xFin = x;}
    
    public int getYFin(){return this.yFin;}
    public void setYFin(int y){this.yFin = y;}
}
