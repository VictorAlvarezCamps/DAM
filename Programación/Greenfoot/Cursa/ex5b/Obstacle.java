import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * classe Obstacle. Representa els obstacles que poden aparéixer a la cursa. 
 * Només conté la imatge representativa de l'obstacle, i que es mostrarà al món
 * 
 * @autor Victor Alvarez
 * @version 16/12/2011
 */
public class Obstacle extends Actor
{
    GreenfootImage image1,image2; // pot ser grass.png o tulip.png

    /**
     * Obstacle Constructor
     *
     * @param nomImg la imatge que representa l'obstacle, i que apareixerà al món
     */
    public Obstacle(String nomImg){
        //falta que ho implementeu!!!
        image1=new GreenfootImage("grass.png");
        image2=new GreenfootImage("tulip.png");
        
        setImage(image1);
    }
    
    /**
     * Act - hace lo que Obstacle quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    public void act() 
    {
        niHaObstacle();
    }
    
    public void niHaObstacle(){
        //Amb aquest metode li direm que si la serp troba un Obstacle es pare la serp on l'ha trobat
        int x=getX();
        int y=getY();
        if(this.isTouching(Obstacle.class)){
            this.setLocation(x,y);
        }
    }
    

}
