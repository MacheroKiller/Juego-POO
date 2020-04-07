import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnergiaGuerriT here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnergiaGuerriT extends Contador
{
   int vidaGT = 50;
    /**
     * Act - do whatever the EnergiaGuerriTerran wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        setImage( new GreenfootImage("Vida :" + vidaGT, 20,Color.GREEN, Color.BLACK));
    
    }
      
    public int vidaGT(){
     
        vidaGT = vidaGT;
        return vidaGT;
    }
    
    
    public void removervidaGT(){
     
        vidaGT = vidaGT - 20;
        
    }
    
    public void ganarvidaGT(){
    
        vidaGT = vidaGT + 20;
        
    }
}
