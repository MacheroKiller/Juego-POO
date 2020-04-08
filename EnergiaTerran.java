import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnergiaTerran here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnergiaTerran extends Contador
{
    int energiaT = 380;
    int mMT = -120;
    int mGT = -160;
    int mCT = -100;
    /**
     * Act - do whatever the EnergiaTerran wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage( new GreenfootImage("EnergiaT :" + energiaT, 24, Color.GREEN, Color.BLACK));
    }    
    public void removenergiaMT(){
        
        energiaT = energiaT + mMT;
    }
    
    public void removenergiaGT(){
        
        energiaT = energiaT + mGT;
    
    }
    
    public void removenergiaCT(){
        
        energiaT = energiaT + mCT;
    }
    public void addenergiaT(){
        
        energiaT++;
        
    }
    
     public int energiaT(){
        
        energiaT = energiaT;
        return energiaT;
        
    }
    
}
