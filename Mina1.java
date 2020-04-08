import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mina1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mina1 extends MinaCristal
{
    int mina1= -15;
    /**
     * Act - do whatever the MinaCristal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
              
        if ( mina1 == -15) {
        if ( Greenfoot.getRandomNumber(2) == 1 ){
            
         mina1 = 300;
            
        } else {
         
         mina1 = 400;
            
        }
    }
        setImage( new GreenfootImage("Cristal :" + mina1, 18,Color.BLUE, Color.LIGHT_GRAY));
    

}

public int mina1(){
    
    mina1 = mina1;
    return mina1;
    
}


public void removemina1(){
 
    mina1 = mina1 - 1;
    
}
}
