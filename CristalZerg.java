import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CristalZerg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CristalZerg extends Contador
{
    int cristalZ;
    
   public void act() 
    {
        setImage( new GreenfootImage("CristalT :" + cristalZ, 18,Color.RED, Color.BLACK));
    }    
    
    public int cristalZ(){
     
     cristalZ = cristalZ;  
     
     return cristalZ;
    }
    
    public void addCristalZ(){
        
        cristalZ = cristalZ + 1;
        
    }  
    
    public void removeCristalZ(){
     
        cristalZ = cristalZ - 1;
        
    }  
}
