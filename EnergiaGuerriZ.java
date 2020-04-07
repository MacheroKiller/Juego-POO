import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnergiaGuerriZ here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnergiaGuerriZ extends Contador
{
  int vidaGZ = 100;
    
    
    public void act() 
    {
         setImage( new GreenfootImage("Vida :" + vidaGZ, 20,Color.GREEN, Color.BLACK));
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
        }    
    
    public void removervidaGZ(){
     
        vidaGZ = vidaGZ - 20;
        
    }
     public void ganarvidaGZ(){
    
        vidaGZ = vidaGZ + 20;
        
    }
}
