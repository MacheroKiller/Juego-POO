import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnergiaMedicT here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnergiaMedicT extends Contador
{
    int vidaMT = 120;
    
    /**
     * Act - do whatever the EnergiaMedicTerran wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        setImage( new GreenfootImage("Vida MT :" + vidaMT, 20,Color.GREEN, Color.BLACK));
    }  
    public int vidaMT(){
     
        vidaMT = vidaMT;
        return vidaMT;
    }
    
    
    public void removervidaMT(){
     
        vidaMT = vidaMT - 20;
        
    }
    public void curarMT(){
    
        vidaMT= vidaMT - 20;
        
    }
    
    public void addvidaMT(){
     
        vidaMT = vidaMT + 1;
        
    }
    
}
