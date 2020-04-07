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
        if(Greenfoot.isKeyDown("b")){
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
        }
        else if(Greenfoot.isKeyDown("t")){
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
        }}
        //encuentro con objeto
        if(isTouching(Arbol.class)&& Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()-1,getY());
        }
        if(isTouching(Arbol.class)&& Greenfoot.isKeyDown("left"))
        {
          setLocation(getX()+1,getY());
         }
        if(isTouching(Arbol.class)&& Greenfoot.isKeyDown("up"))
        {
         setLocation(getX(),getY()+1);
        }
        if(isTouching(Arbol.class)&& Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()-1);
        }
        //encuentro con Bunker
        if(isTouching(BunkerMedico.class)&& Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()-1,getY());
        }
        if(isTouching(BunkerMedico.class)&& Greenfoot.isKeyDown("left"))
        {
          setLocation(getX()+1,getY());
         }
        if(isTouching(BunkerMedico.class)&& Greenfoot.isKeyDown("up"))
        {
         setLocation(getX(),getY()+1);
        }
        if(isTouching(BunkerMedico.class)&& Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()-1);
        }
    //sistema de combate
     World myWorld = getWorld();
        Mapa mapa = (Mapa)myWorld;
        EnergiaGuerriT vidaGT =  mapa.getEnergiaGuerriT();
        EnergiaMedicT vidaMT = mapa.getEnergiaMedicT();
        EnergiaConstrucT vidaCT = mapa.getEnergiaConstrucT();
        
        //probabilidad de recivir daño de un enemigo
        if( isTouching(MedicZerg.class) && Greenfoot.getRandomNumber(100)==3)
        {
             
             vidaCT.removervidaCT();
             
        }
        if( isTouching(GuerreroZerg.class) && (Greenfoot.getRandomNumber(100)==3 || Greenfoot.getRandomNumber(100)==1 || Greenfoot.getRandomNumber(100)==2
        || Greenfoot.getRandomNumber(100)==4 || Greenfoot.getRandomNumber(100)==5))
        {
             
             vidaCT.removervidaCT();
             
        }
        if( isTouching(ConstructorZerg.class) && (Greenfoot.getRandomNumber(100)==3 || Greenfoot.getRandomNumber(100)==1 || Greenfoot.getRandomNumber(100)==2))
        {
             
             vidaCT.removervidaCT();
             
        }
        //DETERMINAR SI LA VIDA LLEGA A 0
        if( vidaCT.vidaCT <= 0 )
             {
             
             getWorld().removeObjects(getWorld().getObjects(EnergiaConstrucT.class));   
             
             getWorld().removeObjects(getWorld().getObjects(ConstructorTerran.class));
           
             EnergiaTerran energiaT = mapa.getEnergiaTerran(); 
             
             energiaT.removenergiaT();
         
    }
    }    
}
