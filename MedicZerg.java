import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MedicZerg extends Zerg
{
    
    public void act() 
    {
        //combate
        World myWorld = getWorld();
        Mapa mapa = (Mapa)myWorld;
        EnergiaMedicZ vidaMZ = mapa.getEnergiaMedicZ();
        EnergiaGuerriZ vidaGZ =  mapa.getEnergiaGuerriZ();
        EnergiaConstrucZ vidaCZ = mapa.getEnergiaConstrucZ();
        BunkerZerg bunkerZ = mapa.getBunkerZerg();
        //probabilida de daño al enemigo
        if(isTouching(MedicTerran.class) && Greenfoot.getRandomNumber(100)==3)
        {
             
             vidaMZ.removervidaMZ();
            
        }
        if(isTouching(ConstructorTerran.class) && (Greenfoot.getRandomNumber(100)==3||
        Greenfoot.getRandomNumber(100)==2||Greenfoot.getRandomNumber(100)==1))
        {
             
             vidaMZ.removervidaMZ();
            
        }
        if(isTouching(GuerreroTerran.class) && (Greenfoot.getRandomNumber(100)==3||
        Greenfoot.getRandomNumber(100)==2||Greenfoot.getRandomNumber(100)==1||Greenfoot.getRandomNumber(100)==4||Greenfoot.getRandomNumber(100)==5))
        {
             
             vidaMZ.removervidaMZ();
            
        }
       //curar al aliado
           if(isTouching(GuerreroZerg.class) && vidaMZ.vidaMZ > 20 && vidaGZ.vidaGZ < 160 )

        {
            
             vidaMZ.curarMZ();
             vidaGZ.ganarvidaGZ();
             
            }
            
            if(isTouching(ConstructorZerg.class) && vidaMZ.vidaMZ > 20 && vidaCZ.vidaCZ < 100  )

        {
            
             vidaMZ.curarMZ();
             vidaCZ.ganarvidaCZ();
             
            }
    
        //movimiento del personaje
        if(Greenfoot.isKeyDown("r")){
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
        //encuentro con Arbol
        if(isTouching(Arbol.class)&& Greenfoot.isKeyDown("d"))
        {
            setLocation(getX()-1,getY());
        }
        if(isTouching(Arbol.class)&& Greenfoot.isKeyDown("a"))
        {
          setLocation(getX()+1,getY());
         }
        if(isTouching(Arbol.class)&& Greenfoot.isKeyDown("w"))
        {
         setLocation(getX(),getY()+1);
        }
        if(isTouching(Arbol.class)&& Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(),getY()-1);
        }
        
        //encuentro con Mina De Cristal
        if(isTouching(MinaDeCristal.class)&& Greenfoot.isKeyDown("d"))
        {
           setLocation(getX()-1,getY());
        }
        if(isTouching(MinaDeCristal.class)&& Greenfoot.isKeyDown("a"))
        {
            setLocation(getX()+1,getY());
        }
        if(isTouching(MinaDeCristal.class)&& Greenfoot.isKeyDown("w"))
        {
        setLocation(getX(),getY()+1);
        }
        if(isTouching(MinaDeCristal.class)&& Greenfoot.isKeyDown("s"))
        {
           setLocation(getX(),getY()-1);
        }
        //encuentro con YacimientoDeGas
        if(isTouching(YacimientoDeGas.class)&& Greenfoot.isKeyDown("d"))
        {
            setLocation(getX()-1,getY());
        }
        if(isTouching(YacimientoDeGas.class)&& Greenfoot.isKeyDown("a"))
        {
          setLocation(getX()+1,getY());
         }
        if(isTouching(YacimientoDeGas.class)&& Greenfoot.isKeyDown("w"))
        {
         setLocation(getX(),getY()+1);
        }
        if(isTouching(YacimientoDeGas.class)&& Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(),getY()-1);
        }
        
        if( isTouching(BunkerMedicoZ.class) && vidaMZ.vidaMZ < 120 && bunkerZ.bunkerZ > 0 ) {
                
                vidaMZ.addvidaMZ();
                bunkerZ.removerbunkerZ();
                
          }
        
        
        //determinar si la vida llega a 0
        if( vidaMZ.vidaMZ <= 0 )
             {
             
             getWorld().removeObjects(getWorld().getObjects(EnergiaMedicZ.class));   
             
             getWorld().removeObjects(getWorld().getObjects(MedicZerg.class));
           
             EnergiaZerg energiaZ = mapa.getEnergiaZerg(); 
             
             energiaZ.removenergiaMZ();
            }
        
    }    
}
