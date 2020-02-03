import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SopaLetras here.
 * 
 * @author Nicolas Pons Tudela
 * @version (a version number or a date)
 */
public class SopaLetras extends Actor
{
    private static final int FILAS = 10;
    private static final int COLUMNAS = 10;
    
    private static char letras[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    private Letra sopaLetras[][];
    private String palabras[];
    
    private GreenfootImage sopa;
    
    public SopaLetras(String p[]){
        sopaLetras = new Letra[FILAS][COLUMNAS];
        palabras = new String[p.length];
        for(int i=0;i<palabras.length;i++){
            palabras[i] = p[i];
        }
        llenaAleatorio();
        ponerPalabras();
    }
    
    private void llenaAleatorio(){
        for(int i=0;i<FILAS;i++){
            for(int j=0;j<COLUMNAS;j++){
                int p = (int) (Math.round(Math.random()*25));
                sopaLetras[i][j] = new Letra(letras[p]);
            }
        }
    }
    
    private void ponerPalabras(){
        int p;
        for (int i = 0;i<palabras.length;i++){
            p = (int) (Math.round(Math.random()));
            if(p==0){
                colocaHorizontal(palabras[i]);
            }
            if(p==1){
                colocaVertical(palabras[i]);
            }
        }
    }
    
    private void colocaVertical(String s){
        char p[] = s.toCharArray();
        int x = (int) (Math.round(Math.random()*(FILAS-p.length-1)));
        int y = (int) (Math.round(Math.random()*(COLUMNAS-1)));
        for(int i =0;i<p.length;i++){
            sopaLetras[x+i][y] = new Letra(p[i]);
        }
    }
    private void colocaHorizontal(String s){
        char p[] = s.toCharArray();
        int x = (int) (Math.round(Math.random()*(FILAS-1)));
        int y = (int) (Math.round(Math.random()*(COLUMNAS-p.length-1)));
        for(int i =0;i<p.length;i++){
            sopaLetras[x][y+i] = new Letra(p[i]);
        }
    }
    
    public Letra getLetra(int i, int j){
        return this.sopaLetras[i][j];
    }
}
