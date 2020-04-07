import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnergiaMedicZ here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnergiaMedicZ extends Contador
{
    int vidaMZ = 120;
    
    
    public void act() 
    {
         setImage( new GreenfootImage("VidaMZ :" + vidaMZ, 20,Color.RED, Color.BLACK));
         
        }    
    
    public void removervidaMZ(){
     
        vidaMZ = vidaMZ - 20;
        
    }
    public void curarMZ(){
    
        vidaMZ= vidaMZ - 20;
        
    }
    
    public void addvidaMZ(){
        
        vidaMZ = vidaMZ + 1;
        
    }
    


}
