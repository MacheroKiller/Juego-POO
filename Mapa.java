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
    GasTerran gasT = new GasTerran();
    EnergiaMedicT vidaMT = new EnergiaMedicT();
    EnergiaGuerriT vidaGT = new EnergiaGuerriT();
    EnergiaConstrucT vidaCT = new EnergiaConstrucT();
    CristalTerran cristalT = new CristalTerran();
    BunkerTerran bunkerT = new BunkerTerran();
    
    EnergiaZerg energiaZ = new EnergiaZerg();
    EnergiaMedicZ vidaMZ = new EnergiaMedicZ();
    EnergiaGuerriZ vidaGZ = new EnergiaGuerriZ();
    EnergiaConstrucZ vidaCZ = new EnergiaConstrucZ();
    GasZerg gasZ = new GasZerg();
    CristalZerg cristalZ = new CristalZerg();
    BunkerZerg bunkerZ = new BunkerZerg();
    
    
    MinaCristal minacristal = new MinaCristal();
    
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
            addObject(medicT1, 100, 416);
            addObject(consT1, 84, 292);
            addObject(guerrT1, 212, 360);
            
            //Creacion Energia/Gas/Cristales Terran
            addObject(energiaT, 73, 28);
            addObject(gasT, 36, 50); 
            addObject(cristalT, 45, 69);
            addObject(bunkerT, 50, 200);
            addObject(vidaMT, 45, 90);
            addObject(vidaCT, 45, 110);
            addObject(vidaGT, 45, 130);
            
            
            //Creacion Equipo Zerg
            addObject(medicZ1, 910, 278);
            addObject(consZ1, 903, 158);
            addObject(guerrZ1, 820, 220);
            
            //Creacion Energia Zerg
            addObject(energiaZ, 929, 18);
            addObject(gasZ, 892, 40);
            addObject(cristalZ, 901, 58);
            addObject(vidaMZ, 909, 78);
            addObject(vidaCZ, 908, 97);
            addObject(vidaGZ, 908, 116);
            addObject(bunkerZ, 777, 52);
        
           //MinaCristal + Gas
           addObject(minacristal, 500, 500);
           
            
    }
    
    public EnergiaTerran getEnergiaTerran(){
        
        return energiaT;
        
    }
    
    public GasTerran getGasTerran(){
     
        return gasT;
        
    }
    
    public CristalTerran getCristalTerran(){
        
        return cristalT;
        
    }
    
    public BunkerTerran getBunkerTerran(){
        
        return bunkerT;
        
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
    
    public GasZerg getGasZerg(){
     
        return gasZ;
        
    }
    
    public CristalZerg getCristalZerg(){
     
        return cristalZ;
        
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
   
    
    
    public MinaCristal getMinaCristal(){
        
     return minacristal;
        
    }
    
    public BunkerZerg getBunkerZerg(){
        
     return bunkerZ;
        
    }
    
    public void act(){
            
            
        }
            
           
                
           
            
                
                
               
            
               
                
    
}

