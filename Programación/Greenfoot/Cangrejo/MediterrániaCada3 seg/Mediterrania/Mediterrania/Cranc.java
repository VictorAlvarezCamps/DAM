import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Aquesta classe conté totes les dades que gestiona un cranc, així com els mètodes que
 * permeten al cranc interactuar amb la resta d'objectes
 * 
 * @author Manel Viel 
 * @version 1.0 Octubre de 2014
 */
public class Cranc extends Actor
{
    private GreenfootImage imatge1,imatge2;  //imatges per animar el moviment del cranc
    private int punts;   //Nombre de punts que va aconseguint el cranc al matar enemics
    private int vida;   //Vida que li queda al cranc. Inicialment tindrà 100. Cada vegada que un
                        //enemic colisione amb el cranc, li restarà una quantitat de vida, depenent 
                        //de la ferocitat de l'enemic
    private boolean disparant=false; //Controla quan el cranc ha disparat, per a no crear moltes roques 
                        // en un únic dispar.        
    
    //Constructor. 
    /**
     * Constructor Cranc. Ens permet inicialitzar els principals atributs del cranc
     *
     */
    public Cranc(){
        this.imatge1 = new GreenfootImage("cranc.png");
        this.imatge2 = new GreenfootImage("cranc2.png");
        this.vida=100;
        this.setImage(imatge1);
    }
    
    public void act() 
    {
        if(vida>0){
            moviment();
        }else{
            gameOver();
            Greenfoot.stop();
        }
    }    
    
    /**
     * Mètode moviment. Gestiona la manera en que es mou el cranc al polsar les tecles.
     * amb el cursor de la dreta es de`plaça 5 píxels cap a la dreta. Amb el cursor de l'esquerra
     * es desplaça 5 píxels cap a l'esquerra. Amb la barra espacioador, ens dispara una roca
     *
     */
    private void moviment(){
        if(Greenfoot.isKeyDown("right")){
            move(5);
            animaImatgeCranc();
        }
        if(Greenfoot.isKeyDown("left")){
            move(-5);
            animaImatgeCranc();
        }
        //Si s'ha polsat la barra espaciadora, i encara no haviem disparat ....
        if(Greenfoot.isKeyDown("space")&&(!disparant)){
                disparaRoca();
        }
        //Si no esta polsada la barra espaciadora i consta com a que ja hem disparat
        if(!Greenfoot.isKeyDown("space")&&(disparant)){
                disparant=false;         
        }       
    }
    
    /**
     * Mètode animaImatgeCranc. Anima la imatge del cranc, per a que parega que es va movent
     */
    private void animaImatgeCranc(){
        if(this.getImage()==imatge1){
            setImage(imatge2);
        }else{
            setImage(imatge1);
        }
    }
    
    /**
     * Mètode disparaRoca. Crea un objecte roca al món en la mateixa posició que es troba el cranc. 
     * Activa la variabe disparant al valor true
     */
    private void disparaRoca(){
        disparant=true;
        World mon = this.getWorld();
        mon.addObject(new Roca(this),this.getX(),this.getY());
    }
    
    /**
     * Mètode gameOver. Executa un so per indicar que hem acabat el joc 
     */
    public void gameOver(){
        Greenfoot.playSound("gameOver.wav");
    }
    
    
    //Getters i setters
    public int getPunts(){
        return this.punts;
    }
    public void setPunts(int valor){
        this.punts = valor;
    }
    public int getVida(){
        return this.vida;
    }
    public void setVida(int v){
        this.vida=v;
    }

}
