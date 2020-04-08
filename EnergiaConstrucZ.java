import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnergiaConstrucZ here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnergiaConstrucZ extends Contador
{
   int vidaCZ = 100;
    
    
    public void act() 
    {
         setImage( new GreenfootImage("VidaCZ :" + vidaCZ, 20,Color.RED, Color.BLACK));
    
        }    
    
    public void removervidaCZ(){
     
        vidaCZ = vidaCZ - 20;
        
    }
     public void ganarvidaCZ(){
    
        vidaCZ = vidaCZ + 20;
        
    }
}
