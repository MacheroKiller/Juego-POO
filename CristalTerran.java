import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CristalTerran here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CristalTerran extends Contador
{
    int cristalT;
    
   public void act() 
    {
        setImage( new GreenfootImage("CristalT :" + cristalT, 18,Color.GREEN, Color.BLACK));
    }    
    
    public int cristalT(){
     
     cristalT = cristalT;  
     
     return cristalT;
    }
    
    public void addCristalT(){
        
        cristalT = cristalT + 1;
        
    }  
    
    public void removeCristalT(){
     
        cristalT = cristalT - 1;
        
    }
    
}
