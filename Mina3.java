import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mina3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mina3 extends MinaCristal
{
     int mina3 = -15;
    /**
     * Act - do whatever the MinaCristal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
              
        if ( mina3 == -15) {
        if ( Greenfoot.getRandomNumber(2) == 1 ){
            
         mina3 = 300;
            
        } else {
         
         mina3 = 400;
            
        }
    }
        setImage( new GreenfootImage("Cristal :" + mina3, 18,Color.BLUE, Color.LIGHT_GRAY));
    

}

public int mina3(){
    
    mina3 = mina3;
    return mina3;
    
}


public void removemina3(){
 
    mina3 = mina3 - 1;
    
}
}
