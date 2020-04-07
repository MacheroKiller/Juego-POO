import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GasZerg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GasZerg extends Contador
{
    int gasZ = 0;
    
    /**
     * Act - do whatever the GasZerg wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage( new GreenfootImage("GasZ :" + gasZ, 18,Color.RED, Color.BLACK));
    }   
    
    public int gasZ(){
     
     gasZ = gasZ;  
     
     return gasZ;
    }
    
    public void addGasZ(){
        
        gasZ = gasZ + 1;
        
    }
    
    public void removeGasZ(){
        
        gasZ = gasZ - 5;
        
    }

    
}
