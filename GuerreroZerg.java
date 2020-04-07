import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GuerreroZerg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GuerreroZerg extends Zerg
{
    /**
     * Act - do whatever the GuerreroZerg wants to do. This method is called whenever
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
        //probabilida de daño al enemigo
        if(isTouching(MedicTerran.class) && Greenfoot.getRandomNumber(100)==3)
        {
             
             vidaGZ.removervidaGZ();
            
        }
        if(isTouching(ConstructorTerran.class) && (Greenfoot.getRandomNumber(100)==3||
        Greenfoot.getRandomNumber(100)==2||Greenfoot.getRandomNumber(100)==1))
        {
             
             vidaGZ.removervidaGZ();
            
        }
        if(isTouching(GuerreroTerran.class) && (Greenfoot.getRandomNumber(100)==3||
        Greenfoot.getRandomNumber(100)==2||Greenfoot.getRandomNumber(100)==1||Greenfoot.getRandomNumber(100)==4||Greenfoot.getRandomNumber(100)==5))
        {
             
             vidaGZ.removervidaGZ();
            
        }
       
    //movimiento del personaje
       if(Greenfoot.isKeyDown("q")){
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
        
         //determinar si la vida llega a 0
        if( vidaGZ.vidaGZ <= 0 )
             {
             
             getWorld().removeObjects(getWorld().getObjects(EnergiaGuerriZ.class));   
             
             getWorld().removeObjects(getWorld().getObjects(GuerreroZerg.class));
           
             EnergiaZerg energiaZ = mapa.getEnergiaZerg(); 
             
             energiaZ.removenergiaGZ();
            }
    }    
}
