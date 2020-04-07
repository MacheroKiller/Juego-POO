import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MinaCristal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MinaCristal extends Contador
{
    int minaCristal = -15; 
    
    
    
    
    
    
    /**
     * Act - do whatever the MinaCristal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
              
        if ( minaCristal == -15) {
        if ( Greenfoot.getRandomNumber(2) == 1 ){
            
         minaCristal = 300;
            
        } else {
         
         minaCristal = 400;
            
        }
    }
        setImage( new GreenfootImage("CristalT :" + minaCristal, 18,Color.BLUE, Color.LIGHT_GRAY));
    

}

public void removecristal(){
 
    minaCristal = minaCristal - 1;
    
}


}