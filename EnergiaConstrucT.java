import greenfoot.*;  

/**
 * Write a description of class EnergiaConstrucT here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnergiaConstrucT extends Contador
{
    int vidaCT = 100;
    
    
    public void act() 
    {
         setImage( new GreenfootImage("Vida :" + vidaCT, 20,Color.GREEN, Color.BLACK));
    }    
    
    public void removervidaCT(){
     
        vidaCT = vidaCT - 20;
        
    }
     
    public void ganarvidaCT(){
    
        vidaCT = vidaCT + 20;
        
    }
  
}
