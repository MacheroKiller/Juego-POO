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
    EnergiaConstrucT vidaCT = new EnergiaConstrucT();
    
    EnergiaZerg energiaZ = new EnergiaZerg();
    EnergiaMedicZ vidaMZ = new EnergiaMedicZ();
    EnergiaGuerriZ vidaGZ = new EnergiaGuerriZ();
    EnergiaConstrucZ vidaCZ = new EnergiaConstrucZ();
    
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
            
            MedicZerg medicZ1 = new MedicZerg();
            ConstructorZerg consZ1 = new ConstructorZerg();
            GuerreroZerg guerrZ1 = new GuerreroZerg();
            
            
            
            //Creacion Equipo Terran
            addObject(medicT1, 170, 500);
            addObject(consT1, 350, 538);
            addObject(guerrT1, 254, 538);
            
            //Creacion Energia Terran
            addObject(energiaT, 100, 40);
            addObject(vidaMT, 170, 500);
            addObject(vidaGT, 254, 538);
            addObject(vidaCT, 350, 538);
            
            //Creacion Equipo Zerg
            addObject(medicZ1, 900, 60);
            addObject(consZ1, 800, 70);
            addObject(guerrZ1, 850, 80);
            
            //Creacion Energia Zerg
            addObject(energiaZ, 600, 40);
            addObject(vidaMZ, 900, 60);
            addObject(vidaCZ, 800, 70);
            addObject(vidaGZ, 850, 80);
        
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
    
    public EnergiaConstrucT getEnergiaConstrucT(){
     
        return vidaCT;
        
    }
    
    
    public EnergiaZerg getEnergiaZerg(){
    
        return energiaZ;
        
    }
    
    public EnergiaMedicZ getEnergiaMedicZ(){
     
        return vidaMZ;
        
    }
    
    public EnergiaConstrucZ getEnergiaConstrucZ(){
     
        return vidaCZ;
        
    }
    
    public EnergiaGuerriZ getEnergiaGuerriZ(){
     
        return vidaGZ;
        
    }
   
    
    public void act(){
            
            
        }
            
           
                
           
            
                
                
               
            
               
                
    
}

