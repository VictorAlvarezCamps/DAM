import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SopaLetras here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SopaLetras extends World
{
    String palabras[]={"IVAN","HA","TRENCAT","EL","MAC"};
    private char matriz[][];    
    private final int filas=15;
    private final int columnas=15;
    private char letras[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','R','S','T','U','V','W','X','Y','Z'};
    
    public SopaLetras()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        matriz=new char[filas][columnas];
        inicializarMatriz();
        ponerPalabrasEnMatriz();
        rellenarMatrizCaracteresAleatorios();
        mostrarMatriz();
    }
    
    public void inicializarMatriz(){
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                matriz[i][j]='*';            
            }            
        }
    }
    
    public void ponerPalabrasEnMatriz(){
        int posicio;
        
        for(int i=0;i<palabras.length;i++){
            posicio = Greenfoot.getRandomNumber(2);
            if(posicio==0){
                ponerPalabraEnHorizontal(palabras[i]);
            }else{
                ponerPalabraEnVertical(palabras[i]);
            }
        }
    }
    
    public void rellenarMatrizCaracteresAleatorios(){
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                if(matriz[i][j]=='*'){
                    int aleatorio=Greenfoot.getRandomNumber(letras.length);
                    matriz[i][j]=letras[aleatorio];
                }            
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
    
    public void mostrarMatriz(){
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.print(matriz[i][j]+" ");               
            }
            System.out.println();
        }
    }
}
