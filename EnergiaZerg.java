import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnergiaZerg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnergiaZerg extends Contador
{
   int energiaZ = 380;
   int mMZ = -120;
   int mGZ = -160;
   int mCZ = -100; 
    /**
     * Act - do whatever the EnergiaTerran wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage( new GreenfootImage("EnergiaZ :" + energiaZ, 24, Color.RED, Color.BLACK));
    }    
    public void removenergiaMZ(){
        
        energiaZ = energiaZ + mMZ;
    }
    
    public void removenergiaGZ(){
        
        energiaZ = energiaZ + mGZ;
    }
    
    public void removenergiaCZ(){
        
        energiaZ = energiaZ + mCZ;
    }
    
    public void addenergiaZ(){
        
        energiaZ++;
        
    }
    
    public int energiaZ(){
        
        energiaZ = energiaZ;
        return energiaZ;
        
    }
    
    
}
