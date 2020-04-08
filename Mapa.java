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
    
    
    Cristal1 cristal1 = new Cristal1();
    Cristal2 cristal2 = new Cristal2();
    Cristal3 cristal3 = new Cristal3();
    Mina1 mina1 = new Mina1();
    Mina2 mina2 = new Mina2();
    Mina3 mina3 = new Mina3();
    
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
            
            //creacion De ARBOLES
            Arbol ar1=new Arbol();
            Arbol ar2=new Arbol();
            Arbol ar3=new Arbol();
            Arbol ar4=new Arbol();
            Arbol ar5=new Arbol();
            Arbol ar6=new Arbol();
            Arbol ar7=new Arbol();
            Arbol ar8=new Arbol();
            Arbol ar9=new Arbol();
            Arbol ar10=new Arbol();
            Arbol ar11=new Arbol();
            Arbol ar12=new Arbol();
            Arbol ar13=new Arbol();
            Arbol ar14=new Arbol();
            Arbol ar15=new Arbol();
            Arbol ar16=new Arbol();
            //agregar arboles
            addObject(ar1, 48, 245);
            addObject(ar2, 105, 279);
            addObject(ar3, 121, 145);
            addObject(ar4, 146, 211);
            addObject(ar5, 368, 476);
            addObject(ar6, 244, 551);
            addObject(ar7, 316, 546);
            addObject(ar8, 405, 545);
            addObject(ar9, 690, 462);
            addObject(ar10, 770, 476);
            addObject(ar11, 696, 546);
            addObject(ar12, 778, 570);
            addObject(ar13, 349, 79);
            addObject(ar14, 633, 71);
            addObject(ar15, 721, 92);
            addObject(ar16, 841, 53);
            //yacimiento de gas
            YacimientoDeGas y1=new YacimientoDeGas();
            YacimientoDeGas y2=new YacimientoDeGas();
            YacimientoDeGas y3=new YacimientoDeGas();
            YacimientoDeGas y4=new YacimientoDeGas();
            YacimientoDeGas y5=new YacimientoDeGas();
            YacimientoDeGas y6=new YacimientoDeGas();
            //agregacion 
            addObject(y1, 208, 163);
            addObject(y2, 261, 175);
            addObject(y3, 226, 214);
            addObject(y4, 931, 539);
            addObject(y5, 973, 571);
            addObject(y6, 905, 588);
            //creacion bunker medicos
            BunkerMedicoT b1=new BunkerMedicoT();
            BunkerMedicoZ b2=new BunkerMedicoZ();
            //agregacion
            addObject(b2, 945, 294);
            addObject(b1, 100, 529);
            //depositos creacion
            DepositoT d1= new DepositoT();
            DepositoZ d2= new DepositoZ();
            //agregacion
            addObject(d2, 914, 189);
            addObject(d1, 81, 402);
            
            //Creacion Energia/Gas/Cristales Terran
            addObject(energiaT, 73, 28);
            addObject(gasT, 36, 50); 
            addObject(cristalT, 41, 70);
            addObject(bunkerT, 50, 200);
            addObject(vidaMT, 45, 90);
            addObject(vidaCT, 45, 110);
            addObject(vidaGT, 45, 130);
            
            //Creacion Equipo Terran
            addObject(medicT1, 209, 330);
            addObject(consT1, 245, 410);
            addObject(guerrT1, 311, 326);
            
            //Creacion Equipo Zerg
            addObject(guerrZ1, 762, 322);
            addObject(consZ1, 801, 256);
            addObject(medicZ1, 853, 331);
            
            //Creacion Energia Zerg
            addObject(energiaZ, 929, 18);
            addObject(gasZ, 892, 40);
            addObject(cristalZ, 901, 58);
            addObject(vidaMZ, 909, 78);
            addObject(vidaCZ, 908, 97);
            addObject(vidaGZ, 908, 116);
            addObject(bunkerZ, 777, 52);
        
           //MinaCristal + Gas
           addObject(cristal1, 534, 542);
           addObject(mina1, 534, 542);
           
           addObject(cristal2, 485, 40);
           addObject(mina2, 485, 40);
           
           addObject(cristal3, 555, 297);
           addObject(mina3, 555, 297);
          
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
   
    
    
    public Mina1 getMina1(){
     
        return mina1;
        
    }
    
    public Mina2 getMina2(){
     
        return mina2;
        
    }
    
    public Mina3 getMina3(){
     
        return mina3;
        
    }
    
    public BunkerZerg getBunkerZerg(){
        
     return bunkerZ;
        
    }
    
    
    
    
    public void act(){
        if ( energiaZ.energiaZ() == 0 ){
            
            
        Greenfoot.setWorld( new TerranWins() );
            
        
        
        }
        
        if ( energiaT.energiaT() == 0 ){
            
            
        Greenfoot.setWorld( new ZergWins() );
            
        
        
        }
        
            
    }  
                
           
            
                
                
               
            
               
                
    
}

