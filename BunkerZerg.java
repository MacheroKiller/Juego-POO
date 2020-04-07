import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BunkerZerg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BunkerZerg extends Contador
{
    int bunkerZ = 300;
    public void act() 
    {
        setImage( new GreenfootImage("BunkerZ :" + bunkerZ, 18,Color.RED, Color.BLACK));
    }    
    
    public int bunkerZ(){
        
        bunkerZ = bunkerZ;
        return bunkerZ;
        
    }
    
    public void addbunkerZ(){
        
        bunkerZ = bunkerZ + 1;
        
    }
    
    public void removerbunkerZ(){
        
        bunkerZ = bunkerZ - 1 ;
        
    }
}
