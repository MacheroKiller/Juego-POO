import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnergiaTerran here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnergiaTerran extends Contador
{
    int energiaT = 1000;
    int menos = -20;
    /**
     * Act - do whatever the EnergiaTerran wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage( new GreenfootImage("EnergiaT :" + energiaT, 24, Color.GREEN, Color.BLACK));
    }    
    public void removenergiaT(){
        
        energiaT = energiaT + menos;
    }
    
    public void addenergiaT(){
        
        energiaT++;
        
    }
}
