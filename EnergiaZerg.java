import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnergiaZerg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnergiaZerg extends Contador
{
   int energiaZ = 1000;
   int menos = -20;
    /**
     * Act - do whatever the EnergiaTerran wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage( new GreenfootImage("EnergiaZ :" + energiaZ, 24, Color.GREEN, Color.BLACK));
    }    
    public void removenergiaZ(){
        
        energiaZ = energiaZ + menos;
    }
    
    public void addenergiaZ(){
        
        energiaZ++;
        
    }
}
