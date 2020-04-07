import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ConstructorZerg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConstructorZerg extends Zerg
{
    /**
     * Act - do whatever the ConstructorZerg wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        World myWorld = getWorld();
        
        Mapa mapa = (Mapa)myWorld;
        
        EnergiaMedicZ vidaMZ = mapa.getEnergiaMedicZ();
        
        EnergiaGuerriZ vidaGZ =  mapa.getEnergiaGuerriZ();
        
        EnergiaConstrucZ vidaCZ = mapa.getEnergiaConstrucZ();
        
        GasZerg gasZ = mapa.getGasZerg();
       
        CristalZerg cristalZ = mapa.getCristalZerg();
        
        MinaCristal minacristal = mapa.getMinaCristal();
        
        BunkerZerg bunkerZ = mapa.getBunkerZerg();
        
        
        //movimiento del personaje
        if(Greenfoot.isKeyDown("e")){
        if(Greenfoot.isKeyDown("d")){
        if(getX()<1000){
            setLocation(getX()+1,getY());
        }
        }
        if(Greenfoot.isKeyDown("a")){
        if(getX()<1000){
            setLocation(getX()-1,getY());
        }
        }
        if(Greenfoot.isKeyDown("w")){
        if(getY()<600){
            setLocation(getX(),getY()-1);
        }
        }
        if(Greenfoot.isKeyDown("s")){
            if(getY()<600){
        setLocation(getX(),getY()+1);}
        }
        }
        else if(Greenfoot.isKeyDown("z")){
        if(Greenfoot.isKeyDown("d")){
        if(getX()<1000){
            setLocation(getX()+1,getY());
        }
        }
        if(Greenfoot.isKeyDown("a")){
        if(getX()<1000){
            setLocation(getX()-1,getY());
        }
        }
        if(Greenfoot.isKeyDown("w")){
        if(getY()<600){
            setLocation(getX(),getY()-1);
        }
        }
        if(Greenfoot.isKeyDown("s")){
            if(getY()<600){
        setLocation(getX(),getY()+1);}
        }}
        //encuentro con objeto
        
        if(isTouching(Arbol.class) && Greenfoot.isKeyDown("d"))
        {
            setLocation(getX()-1,getY());
        }
        if(isTouching(Arbol.class) && Greenfoot.isKeyDown("a"))
        {
          setLocation(getX()+1,getY());
         }
        if(isTouching(Arbol.class) && Greenfoot.isKeyDown("w"))
        {
         setLocation(getX(),getY()+1);
        }
        if(isTouching(Arbol.class) && Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(),getY()-1);
        }
        
        
        //probabilida de daño al enemigo
        
        if(isTouching(MedicTerran.class) && Greenfoot.getRandomNumber(100)==3)
        {
             
             vidaCZ.removervidaCZ();
            
        }
        
        if(isTouching(ConstructorTerran.class) && (Greenfoot.getRandomNumber(100)==3 ||
        Greenfoot.getRandomNumber(100)==2||Greenfoot.getRandomNumber(100)==1))
        {
             
             vidaCZ.removervidaCZ();
            
        }
        if(isTouching(GuerreroTerran.class) && (Greenfoot.getRandomNumber(100)==3||
        Greenfoot.getRandomNumber(100)==2||Greenfoot.getRandomNumber(100)==1||Greenfoot.getRandomNumber(100)==4||Greenfoot.getRandomNumber(100)==5))
        {
             
             vidaCZ.removervidaCZ();
            
        }
        
       
        
        //encuentro con Bunker
        
        
        if(isTouching(BunkerMedicoZ.class)&& Greenfoot.isKeyDown("d"))
        {
            setLocation(getX()-1,getY());
        }
        
        if(isTouching(BunkerMedicoZ.class)&& Greenfoot.isKeyDown("a"))
        {
          setLocation(getX()+1,getY());
         }
         
        if(isTouching(BunkerMedicoZ.class)&& Greenfoot.isKeyDown("w"))
        {
         setLocation(getX(),getY()+1);
        }
        
        if(isTouching(BunkerMedicoZ.class)&& Greenfoot.isKeyDown("s"))
        
        {
            setLocation(getX(),getY()-1);
        }
        
        //AccionesUnicas
        
        if(isTouching(YacimientoDeGas.class) && gasZ.gasZ < 100)
        {
            
            gasZ.addGasZ();
            
        }
        
        if( isTouching(MinaDeCristal.class) && cristalZ.cristalZ < 20){
            
            cristalZ.addCristalZ();
            minacristal.removecristal();
            
        }
        
         if(isTouching(DepositoZ.class) && gasZ.gasZ > 4 && bunkerZ.bunkerZ() < 400){
            
           gasZ.removeGasZ();
           bunkerZ.addbunkerZ();
        }
        
        if(isTouching(DepositoZ.class) && cristalZ.cristalZ() > 0 && bunkerZ.bunkerZ() < 400 ){
            
           cristalZ.removeCristalZ();
           bunkerZ.addbunkerZ();
        }
         
        //determinar si la vida llega a 0
        
        if( vidaCZ.vidaCZ <= 0 )
             {
             
             getWorld().removeObjects(getWorld().getObjects(EnergiaConstrucZ.class));   
             
             getWorld().removeObjects(getWorld().getObjects(ConstructorZerg.class));
           
             EnergiaZerg energiaZ = mapa.getEnergiaZerg(); 
             
             energiaZ.removenergiaCZ();
            }
        
}    
}
