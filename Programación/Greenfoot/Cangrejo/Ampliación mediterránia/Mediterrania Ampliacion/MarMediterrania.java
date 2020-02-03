import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Classe que construeix el nontre MarMediterrania, i situa els elements en ell.
 * 
 * @author Manel Viel 
 * @version 1.0 Octubre de 2014
 */
public class MarMediterrania extends World
{
    private Cranc c1; // El nostre Actor principal
    private Marcadors cVida, cPunts, cMunicio;
    private Complements c2, c4, c5, c6;
    private Enemics c3;
    private int cSalut;
    private int comMun;
    private int ePunts;
    private int jVida;
    private int jPunts;
    private int jBales;
    private int vidanova, puntsnous, balesnoves;
    private boolean marcadorsVisibles;
    private String tecla;
    private String TeclaEspacio;
    /**
     * Constructor for objects of class MarMediterrania.
     * 
     */
    public MarMediterrania()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);
        c1 = new Cranc();
        this.addObject(c1,this.getWidth()/2,this.getHeight()-(c1.getImage().getHeight()/2));
        c3 = new Enemics();
        c5 = new Salut();
        c6 = new Complements();
        cSalut=c5.getSalut();
        ePunts=c3.getPuntsEnemic();
        jVida=c1.getVida();
        jPunts=c1.getPunts();
        jBales=c1.getMunicio();
        comMun=c6.getcomMunicio();
        cVida = new Marcadors(jVida, "Vida");
        cPunts = new Marcadors(jPunts, "Punts");
        cMunicio = new Marcadors(jBales, "Municio");
        //Posa els actors al món
        posaComplements();        
    }
    
    public void act(){
        Marcadors();
        ModificaVida();
        ModificaPunts();
        ModificaMunicio();
        posaEnemics();
    }
      
    public void Marcadors(){        
       tecla=Greenfoot.getKey();
       if(tecla!=null){
          if(((tecla.compareTo("M")==0)||(tecla.compareTo("m")==0))&&(!marcadorsVisibles)){
              afegirMarcador();
          }else{
              if(((tecla.compareTo("M")==0)||(tecla.compareTo("m")==0))&&(marcadorsVisibles)){
                  ocultaMarcador();
                }
            }
       }
        
    }
    
    public void afegirMarcador(){
        this.addObject(cVida, 50, 10);
        this.addObject(cPunts, 200, 10);
        this.addObject(cMunicio, 350, 10);  
        marcadorsVisibles=true;
        
    }
    
    public void ocultaMarcador(){
        this.removeObject(cVida);
        this.removeObject(cPunts);
        this.removeObject(cMunicio);
        marcadorsVisibles=false;
    }
    
    public void posaActors(){        
        int num = Greenfoot.getRandomNumber(3);
        switch(num){
            case 0:for(int i=0;i<2;i++){
                        this.addObject(new Peixet(),Greenfoot.getRandomNumber(this.getWidth()),Greenfoot.getRandomNumber(this.getHeight()));
                   }
                   break;
            case 1:for(int i=0;i<2;i++){
                        this.addObject(new Llangosta(),Greenfoot.getRandomNumber(this.getWidth()),Greenfoot.getRandomNumber(this.getHeight()));
                   }
                   break;
            case 2:for(int i=0;i<2;i++){
                        this.addObject(new Tortuga(),Greenfoot.getRandomNumber(this.getWidth()),Greenfoot.getRandomNumber(this.getHeight()));
                   }
                   break;           
        }
    }
    
    public void posaEnemics(){
        for(int e=0;e<=10;e++){
            int enemics=numberOfObjects();
            if((e<=10)&&(enemics<=14)){
               posaActors();
            }else{
                if(enemics<14){
                    posaActors();
                }
            }
        }
    }
    
    public void posaComplements(){
        for(int i=0;i<1;i++){
            this.addObject(new Municio(),Greenfoot.getRandomNumber(this.getWidth()),Greenfoot.getRandomNumber(this.getHeight()));
        }
            
        for(int i=0;i<1;i++){
           this.addObject(new Salut(),Greenfoot.getRandomNumber(this.getWidth()),Greenfoot.getRandomNumber(this.getHeight()));
        }
    }
    
    public void ModificaVida(){
        this.vidanova = c1.getVida();
        if(this.vidanova != this.jVida){
            if(this.vidanova<this.jVida){
                int res = this.jVida-this.vidanova;
                this.cVida.disminuir(res);
            }
            if(this.vidanova>this.jVida){
                int sum = this.jVida+this.cSalut;
                this.cVida.aumentar(sum);
            }
        }
        this.jVida = c1.getVida();
    }

    public void ModificaPunts(){
        this.puntsnous = c1.getPunts();
        this.ePunts = c3.getPuntsEnemic();
        if(this.puntsnous != this.jPunts){
            if(this.puntsnous>this.jPunts){
                int sum = this.jPunts+this.ePunts;
                this.cPunts.aumentar(sum);
            }
        }
        this.jPunts = c1.getPunts();
    }

    public void ModificaMunicio(){
        this.balesnoves = c1.getMunicio();
        if(this.balesnoves != this.jBales){
            if(this.balesnoves<this.jBales){
                int res = this.jBales-this.balesnoves;
                this.cMunicio.disminuir(res);
            }
            if(this.balesnoves>this.jBales){
                int sum = this.jBales+this.comMun;
                this.cMunicio.aumentar(sum);
            }
        }
        this.jBales = c1.getMunicio();
        
        if(Greenfoot.isKeyDown("space")&&(jBales<=0)){
            this.jBales=0;
        }
    }
    
}
