package ylva;

@cpw.mods.fml.common.Mod(modid=Ylva.MODID, name=Ylva.MODNAME, version=Ylva.MODVER)
public class Ylva {

	//Set the ID of the mod (Should be lower case).
    public static final String MODID = "ylva";
    //Set the "Name" of the mod.
    public static final String MODNAME = "Ylva Mod";
    //Set the version of the mod.
    public static final String MODVER = "0.0.0";

    @cpw.mods.fml.common.Mod.Instance(value = Ylva.MODID) //Tell Forge what instance to use.
    public static Ylva instance;
        
    @cpw.mods.fml.common.Mod.EventHandler
    public void preInit(cpw.mods.fml.common.event.FMLPreInitializationEvent event)
    {
        
    }
        
    @cpw.mods.fml.common.Mod.EventHandler
    public void load(cpw.mods.fml.common.event.FMLInitializationEvent event)
    {

    }
        
    /**
     * bla bla bla
     * @param event
     */
    @cpw.mods.fml.common.Mod.EventHandler
    public void postInit(cpw.mods.fml.common.event.FMLPostInitializationEvent event)
    {
    }
}
