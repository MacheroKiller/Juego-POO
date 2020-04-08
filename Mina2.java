import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mina2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mina2 extends MinaCristal
{
      int mina2 = -15;
    /**
     * Act - do whatever the MinaCristal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
              
        if ( mina2 == -15) {
        if ( Greenfoot.getRandomNumber(2) == 1 ){
            
         mina2 = 300;
            
        } else {
         
         mina2 = 400;
            
        }
    }
        setImage( new GreenfootImage("Cristal :" + mina2, 18,Color.BLUE, Color.LIGHT_GRAY));
    

}

public int mina2(){
    
    mina2 = mina2;
    return mina2;
    
}


public void removemina2(){
 
    mina2 = mina2 - 1;
    
}
}
