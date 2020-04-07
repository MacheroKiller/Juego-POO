import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnergiaMedicZ here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnergiaMedicZ extends Contador
{
    int vidaMZ = 1000;
    
    
    public void act() 
    {
         setImage( new GreenfootImage("Vida :" + vidaMZ, 20,Color.GREEN, Color.BLACK));
    }    
    
    public void removervidaMZ(){
     
        vidaMZ = vidaMZ - 20;
        
    }
    public void curarMZ(){
    
        vidaMZ= vidaMZ - 20;
        
    }


}
