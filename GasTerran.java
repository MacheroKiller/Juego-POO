import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GasTerran here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GasTerran extends Contador
{
    int gasT = 0;
    
    
    /**
     * Act - do whatever the GasTerran wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage( new GreenfootImage("GasT :" + gasT, 18,Color.GREEN, Color.BLACK));
    }    
    
    public int gasT(){
     
     gasT = gasT;  
     
     return gasT;
    }
    
    public void addGasT(){
        
        gasT = gasT + 1;
        
    }
    
    public void removeGaT(){
        
        gasT = gasT - 5;
        
    }

}
