import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnergiaDepositoTerran here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BunkerTerran extends Contador
{
    int bunkerT = 300;
    
    /**
     * Act - do whatever the EnergiaDepositoTerran wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage( new GreenfootImage("BunkerT :" + bunkerT, 20,Color.GREEN, Color.BLACK));
    }    

    public int bunkerT(){
        
        bunkerT = bunkerT;
        return bunkerT;
        
    }
    
    public void addbunkerT(){
        
        bunkerT = bunkerT + 1;
        
    }
    
    public void removerbunkerT(){
        
        bunkerT = bunkerT - 1 ;
        
    }
    
   
}