import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import javax.swing.JOptionPane;
/**
 * class Carrera.
 * Classe que representa una Cursa on apareixen 5 corredors, i cadascu pot tindre obstacles en el seu
 * camí cap a la meta. Aquesta classe esta formada per un array de 5 corredors, un array que conté els noms/dorsals 
 * dels corredors, una variable que indica si la carrera ja té un guanyador, y un objecte corredor que identifica el corredor guanyador.
 * 
 * @author Victor Alvarez
 * @version 15/12/2011
 */
public class Carrera extends World
{
    Corredor aCorredors[]=new Corredor[5];
    String aNoms[]={"Laura","Marta","Emili","Joan","Sandra"};
    Obstacle o;
    boolean hiHaGuanyador;  // indica si hi ha un guanyador
    Corredor guanyador;     // ens dui quin corredor és el guanyador
    String image,name,nomImg;
    /**
     * Carrera Constructor. Constructor que genera l'escenari de la cursa, i situa els corredors en el punt de partida.
     *
     */
    public Carrera()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        int i=0;        
        // Afegim els corredors        
        int x=30;
        int y=90;        
        for(int c=0;c<aCorredors.length;c++){
            this.addObject(new Corredor(image,name),x,y);
            y=y+60;
        }        
        // Afegim els obstacles        
        int t=90;        
        for(int o=0;o<5;o++){
            this.addObject(new Obstacle(nomImg),Greenfoot.getRandomNumber(600),t);
            t=t+50;
        }        
        //Afegim els noms dels corredors        
        for(int m=0;m<aCorredors.length;m++){
           
        }        
        /* coordenades del mon:
         * x=30
         * y=a 330 li llevarem 60 pixels per cada corredor que estem recorreguent)
         */
        
        // Afegim els obstacles per a cada corredor
        i=0;
        int teObstacle; // 0 no hi ha obstacles, 1 si hi ha obstacles
        int esTulipan; // 0 no es Tulipan, es gespa. 1 Si es tulipan
          /* per a cada corredor fer:
          * Saber si tindrà o no obstacles. En cas que en tinga:
          * Saber si hem de mostrar un tulipà o gespa
          *  L'obstacle el colocarem en les coordenades següents:
          *   x=100+distancia aleatoria [0-400]
          *   y=a 330 li llevarem 60 pixels per cada corredor que estem recorreguent)
          */
         
        // dibuixem la línia de meta
        getBackground().setColor(Color.blue);
        getBackground().fillRect(550,50,5,300);
        getBackground().drawString("META",537,370);
        // indiquem que no hi ha guanyador
        
        //mostrem el guanyador
        
    }
    
    /**
     * Mètode avancarCorredors.
     * Fa que tots els corredors de la cursa avancen una quantitat de metres aleatòria. Els metres que poden avançar els corredors,
     * cada vegada que es crida a aquest mètode varia aleatòriament entre [0-9] metres.
     * Si un corredor arriba a la meta (o ha recorregut més de 550 pixels) resulta guanyador de la mateixa
     *
     */
    public void avancarCorredors(){
        int i=0;
        int dist=0;
         // per a cada corredor
         //generem la distància que ha de recòrrer
         //el fem avançar eixa distancia aleatòria.
         //Comprovem si este corredor ha guanyat
         //move(this.getVelocitatEnemic()*(-1));
              
       
    }
    
    /**
     * Mètode act.
     * Controla el desenvolupament de la cursa. En cada iteració del mètode act, afegeix un retard de 10, per a que l'animació es puga apreciar bé.
     *
     */
    public void act(){
        llegaMeta();
    }
    
    public void llegaMeta(){
        Corredor c;
        c= new Corredor(image,name);
        //Si una de les serps arriba a la linea de meta amb aixo li direm que mostre quina serp guanyara
        
        /*if(c.getX()<550){
            JOptionPane.showMessageDialog(null,"Ha ganado el corredor"+aNoms);
        }*/
    }
    
    
    
    
}
