import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnergiaGuerriZ here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnergiaGuerriZ extends Contador
{
  int vidaGZ = 160;
    
    
    public void act() 
    {
         setImage( new GreenfootImage("VidaGZ :" + vidaGZ, 20,Color.RED, Color.BLACK));
    
        }    
    
    public void removervidaGZ(){
     
        vidaGZ = vidaGZ - 20;
        
    }
     public void ganarvidaGZ(){
    
        vidaGZ = vidaGZ + 20;
        
    }
}
