import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MedicZerg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MedicZerg extends Zerg
{
    /**
     * Act - do whatever the MedicZerg wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //combate
       
        World myWorld = getWorld();
        Mapa mapa = (Mapa)myWorld;
        EnergiaMedicZ vidaMZ = mapa.getEnergiaMedicZ();
        EnergiaGuerriZ vidaGZ =  mapa.getEnergiaGuerriZ();
        EnergiaConstrucZ vidaCZ = mapa.getEnergiaConstrucZ();
        
        if(isTouching(MedicTerran.class) && Greenfoot.getRandomNumber(100)==3)
        {
             
             vidaMZ.removervidaMZ();
            
        }
       
           if(isTouching(GuerreroZerg.class) && vidaMZ.vidaMZ > 20 )

        {
            
             vidaMZ.curarMZ();
             vidaGZ.ganarvidaGZ();
             
            }
            
            if(isTouching(ConstructorZerg.class) && vidaMZ.vidaMZ > 20  )

        {
            
             vidaMZ.curarMZ();
             vidaCZ.ganarvidaCZ();
             
            }
            
        if( vidaMZ.vidaMZ <= 0 )
             {
             
             getWorld().removeObjects(getWorld().getObjects(EnergiaMedicZ.class));   
             
             getWorld().removeObjects(getWorld().getObjects(MedicZerg.class));
           
             EnergiaZerg energiaZ = mapa.getEnergiaZerg(); 
             
             energiaZ.removenergiaZ();
    }
    }    
}
