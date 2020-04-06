    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
     * Write a description of class MyWorld here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
    public class Mapa extends World
    {
    EnergiaTerran energiaT = new EnergiaTerran();
    EnergiaMedicT vidaMT = new EnergiaMedicT();
    EnergiaGuerriT vidaGT = new EnergiaGuerriT();
    
    EnergiaZerg energiaZ = new EnergiaZerg();
    
    /**
         * Constructor for objects of class MyWorld.
         * 
         */
        public Mapa()
        {    
            // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
            super(1000, 600, 1); 
            //creacion de un objeto
            MedicTerran medicT1= new MedicTerran();
            ConstructorTerran consT1=new ConstructorTerran();
            GuerreroTerran guerrT1 = new GuerreroTerran();
            //agragar objeto
            addObject(medicT1, 170, 500);
            //addObject(consT1, 254,538);
            addObject( guerrT1, 254, 538);
            
            //Creacion Energia Terra
            addObject(energiaT, 100, 40);
            addObject(vidaMT, 170, 500);
            addObject(vidaGT, 254, 538);
            
            //Creacion Energia Zerg
            addObject(energiaZ, 600, 40);
        
    }
    
    public EnergiaTerran getEnergiaTerran(){
        
        return energiaT;
        
    }
    
    public EnergiaMedicT getEnergiaMedicT(){
        
        return vidaMT;
     
    }
    
    public EnergiaGuerriT getEnergiaGuerriT(){
     
        return vidaGT;
        
    }
    
    
    public EnergiaZerg getEnergiaZerg(){
    
        return energiaZ;
        
    }
    
    public void act(){
            
            
        }
            
           
                
           
            
                
                
               
            
               
                
    
}

