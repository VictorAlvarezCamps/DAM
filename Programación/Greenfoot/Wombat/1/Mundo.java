import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mundo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mundo extends World
{

    /**
     * Constructor for objects of class Mundo.
     * 
     */
    public Mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        ex3();
    }
    public void ex2(){
        int n=7;
        System.out.println("n="+n);
        n=n+77;
        System.out.println("(n+77)="+n);
        n=n-3;
        System.out.println("(n-3)="+n);
        n=n*2;
        System.out.println("(n*2)="+n);
    }
    public int ex3(){
        int A=1;
        int B=2;
        int C=3;
        int D=4;
        B=C;
        C=A;
        A=D;
        D=B;
        return C;
    }
}
