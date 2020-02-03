import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La classe Roca gestiona tot el referent a l'actor Roca
 * 
 * @author Manel Viel 
 * @version 1.0 Octubre de 2014
 *
 */
public class Roca extends Actor
{
    private Cranc crancQueMhaDisparat;  //Referència al cranc que ha disparat la roca.

    /**
     * Construc tor d'objectes Roca
     * Aquest mètode ens construeix un objecte de la classe Roca. Com que quan la roca col·lisione amb un enemic
     * necessitarem incrementar-li punts a l'objecte cranc, una manera senzilla de fer-ho és rebent una referència
     * del cranc que ha llançat la roca, per a sumar-li directament els punts.
     *
     * @param una referència del Cranc que ha disparat la Roca.
     */
    public Roca(Cranc c){
        setRotation(270);
        crancQueMhaDisparat=c;     
    }
    
    public void act() 
    {
        
        if(isTouching(Enemics.class)){  //Hem colisionat amb un enemic
            //1r Llancem un so per indicar que hem impactat amb un enemic
            Greenfoot.playSound("impacte.wav");
            //2n Destruim l'enemic
            this.destrueixEnemic();
            //3r finalment eliminem la roca
            this.eliminarRoca();
        }else{
            //La roca es mou lliurement pel món
            this.move(5);
            if(this.rocaEnLimitS()) //Si arriba al límit superior  
                //Eliminem la roca del món
                this.eliminarRoca();
            }
        }
       
    
    /**
     * Mètode rocaEnLimitS Comprova si la roca ha arribat al límit Superior del món
     *
     * @return Torna true, en cas que si haja arribat al límit superior i false en cas contrari.
     */
    private boolean rocaEnLimitS(){
        if (this.getY()<=0){  //Hem arribat al límit superior del món
            return(true);
        }else{
            return(false);
        }
    }
    
    /**
     * Mètode destrueixEnemic. Aquest mètode destrueix l'enemic amb el que ha colisionat la roca, agafant-li
     * els punts que li corresponien a l'enemic i afegint-li'ls als punt que té el cranc
     *
     */
    private void destrueixEnemic(){
        //Obtindrem els punts que té eixe enemic, per a sumar-li'ls als punts del cranc
        // Per a acoseguir-ho farem:
        //1r.- Obtindre una referencia de l'enemic amb que hem colisionat
        Enemics e;
        e = (Enemics) getOneIntersectingObject(Enemics.class);

        int puntsEnemic;  //variable on guardarem els punts que té l'enemic
        puntsEnemic= e.getPuntsEnemic();
        //Obtenim els punts actuals que té el cranc.
        int puntsActualsDelCranc=this.crancQueMhaDisparat.getPunts();
        //Al cranc li sumarem els punts de l'enemic als que ja tenia el cranc.
        //Utilitzem un mètode setter del cranc, per a modificar el valor de l'atribut punts del cranc.
        this.crancQueMhaDisparat.setPunts(puntsActualsDelCranc + puntsEnemic);
        //Eliminem l'enemic del món
        e.eliminaEnemicDelMon();
    }
    
    /**
     * Mètode eliminarRoca Elimina aquesta roca del món
     *
     */
    private void eliminarRoca(){       
        World mon = this.getWorld(); //Obtenim una referència del món on viu aquesta roca
        mon.removeObject(this);     //cridem al mètode removeObject per a eliminar la roca del món
    
    }
}
