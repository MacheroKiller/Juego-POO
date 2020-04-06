import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ConstructorTerran here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConstructorTerran extends Terran
{
    /**
     * Act - do whatever the ConstructorTerran wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //movimiento del personaje
        //movimiento del personaje
        if(Greenfoot.isKeyDown("right")){
        if(getX()<1000){
            setLocation(getX()+1,getY());
        }
        }
        if(Greenfoot.isKeyDown("left")){
        if(getX()<1000){
            setLocation(getX()-1,getY());
        }
        }
        if(Greenfoot.isKeyDown("up")){
        if(getY()<600){
            setLocation(getX(),getY()-1);
        }
        }
        if(Greenfoot.isKeyDown("down")){
            if(getY()<600){
        setLocation(getX(),getY()+1);}
        }
        //encuentro con objeto
        if(isTouching(Arbol.class)&& Greenfoot.isKeyDown("right"))
        {
           if(getX()<1000){
            setLocation(getX()-1,getY());
        }
        }
        if(isTouching(Arbol.class)&& Greenfoot.isKeyDown("left"))
        {
           if(getX()<1000){
            setLocation(getX()+1,getY());
        }
        }
        if(isTouching(Arbol.class)&& Greenfoot.isKeyDown("up"))
        {
           if(getX()<600){
            setLocation(getX(),getY()+1);
        }
        }
        if(isTouching(Arbol.class)&& Greenfoot.isKeyDown("down"))
        {
           if(getX()<600){
            setLocation(getX(),getY()-1);
        }
        }
    }    
}
