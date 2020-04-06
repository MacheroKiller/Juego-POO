 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MedicTerran here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class MedicTerran extends Terran
{
    /**
     * Act - do whatever the MedicTerran wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    
    public void act() 
    {
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
        
        //combate
        //combate
        int a = 1;
        World myWorld = getWorld();
        Mapa mapa = (Mapa)myWorld;
        if(isTouching(MedicZerg.class)&& Greenfoot.getRandomNumber(100)==3)
        {
             
             
             EnergiaMedicT vidaMT = mapa.getEnergiaMedicT();
             vidaMT.removervidaMT();
             a = vidaMT.vidaMT;
            
        }
         if( a <= 0 )
             {
             getWorld().removeObjects(getWorld().getObjects(EnergiaMedicT.class));   
             getWorld().removeObjects(getWorld().getObjects(MedicTerran.class));
            EnergiaTerran energiaT = mapa.getEnergiaTerran(); 
             energiaT.removenergiaT();
            }
        
        
        
        
        
        
        
        
           if(isTouching(GuerreroTerran.class) )

        {
            EnergiaGuerriT vidaGT = new EnergiaGuerriT();
            EnergiaMedicT vidaMT = mapa.getEnergiaMedicT();
            
             vidaMT.curarMT();
             vidaGT.ganarvidaGT();
             
             if( vidaMT.vidaMT <= 0 )
             {
             
             getWorld().removeObjects(getWorld().getObjects(EnergiaMedicT.class));   
             
             getWorld().removeObjects(getWorld().getObjects(MedicTerran.class));
           
             EnergiaTerran energiaT = mapa.getEnergiaTerran(); 
             
             energiaT.removenergiaT();
            }
            
        
    }
        
            
        } 
    }



    
    
    

