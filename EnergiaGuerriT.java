import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnergiaGuerriT here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnergiaGuerriT extends Contador
{
   int vidaGT = 50;
    /**
     * Act - do whatever the EnergiaGuerriTerran wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        setImage( new GreenfootImage("Vida :" + vidaGT, 20,Color.GREEN, Color.BLACK));
        //movimiento barra del personaje
       if(Greenfoot.isKeyDown("g")){
          
          
           
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
        //encuentro con Arbol
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
        
        //encuentro con Mina De Cristal
        if(isTouching(MinaDeCristal.class)&& Greenfoot.isKeyDown("right"))
        {
           setLocation(getX()-1,getY());
        }
        if(isTouching(MinaDeCristal.class)&& Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()+1,getY());
        }
        if(isTouching(MinaDeCristal.class)&& Greenfoot.isKeyDown("up"))
        {
        setLocation(getX(),getY()+1);
        }
        if(isTouching(MinaDeCristal.class)&& Greenfoot.isKeyDown("down"))
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
        //encuentro con YacimientoDeGas
        if(isTouching(YacimientoDeGas.class)&& Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()-1,getY());
        }
        if(isTouching(YacimientoDeGas.class)&& Greenfoot.isKeyDown("left"))
        {
          setLocation(getX()+1,getY());
         }
        if(isTouching(YacimientoDeGas.class)&& Greenfoot.isKeyDown("up"))
        {
         setLocation(getX(),getY()+1);
        }
        if(isTouching(YacimientoDeGas.class)&& Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()-1);
        }
    }
      
    public int vidaGT(){
     
        vidaGT = vidaGT;
        return vidaGT;
    }
    
    
    public void removervidaGT(){
     
        vidaGT = vidaGT - 20;
        
    }
    
    public void ganarvidaGT(){
    
        vidaGT = vidaGT + 20;
        
    }
}
