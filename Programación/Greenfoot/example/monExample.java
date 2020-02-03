import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
import java.awt.Color;
import javax.swing.JOptionPane;
/**
 * Write a description of class monExample here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class monExample extends World
{
    private File f;
    private String llista[];
    /**
     * Constructor for objects of class monExample.
     * 
     */
    public monExample()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        f=new File(".");
        llista=f.list();
        for(int i=0;i<llista.length;i++){
            File f2=new File(llista[i]);
            System.out.println(llista[i]+"," + f2.length() + "KBytes " + (f2.canRead()?" Lectura ":"Nolectura ") + (f2.canWrite()?" Escritura ":"Noescritura "));
            /*if(f2.canRead()){
                System.out.println("Lectura");
            }
            if(f2.canWrite()){
                System.out.println("Escritura");
            }
            System.out.println();*/
        }
        String fichero= JOptionPane.showInputDialog(null,"Introduce el nombre del archivo:");
        File f3= new File(".\\Federico");
        f3.mkdir();
        File f4 = new File(".\\Federico\\"+fichero+".txt");
        try{
            f4.createNewFile();
        }catch(IOException ioe){
            System.out.println("Error al crear el archivo");
        }
        
        
    }
}
