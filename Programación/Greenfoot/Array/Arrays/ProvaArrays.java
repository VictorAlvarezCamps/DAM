import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
/**
 * Write a description of class ProvaArrays here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ProvaArrays extends World
{
    private int notes1Dam[];
    private String noms1Dam[]={"Andrea","David","Victor","Joaquin","Alvaro"};
    private final int NUM_ALUMNES=5;
    /**
     * Constructor for objects of class ProvaArrays.
     * 
     */
    public ProvaArrays()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        //Construim l'array
        notes1Dam=new int [5];
        //Omplim l'array
        String nota=null;
        for (int i=0;i<NUM_ALUMNES;i++){
            //nota = Greenfoot.getRandomNumber(11);
            nota=JOptionPane.showInputDialog(null, "La nota de "+noms1Dam[i]+" es ", "Maquina d'aprovar", JOptionPane.QUESTION_MESSAGE);            
            notes1Dam[i]=Integer.parseInt(nota);
        }
        //Mostrar el contingut de l'array
        for (int pos=0;pos<5;pos++){
           System.out.println("La nota de "+noms1Dam[pos]+" es "+notes1Dam[pos]);
        }
    }
}
