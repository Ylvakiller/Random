package submarine;

import cpw.mods.fml.common.Mod;

@Mod(modid=submarine.MODID, name=submarine.MODNAME, version=submarine.MODVER) //Tell forge "Oh hey, there's a new mod here to load."
public class submarine {
	 //Set the ID of the mod (Should be lower case).
    public static final String MODID = "submarine";
    //Set the "Name" of the mod.
    public static final String MODNAME = "submarine Mod";
    //Set the version of the mod.
    public static final String MODVER = "0.0.0";

    @cpw.mods.fml.common.Mod.Instance(value = submarine.MODID) //Tell Forge what instance to use.
    public static submarine instance;
       
    @cpw.mods.fml.common.Mod.EventHandler
    public void preInit(cpw.mods.fml.common.event.FMLPreInitializationEvent event)
    {
       
    }
       
    @cpw.mods.fml.common.Mod.EventHandler
    public void load(cpw.mods.fml.common.event.FMLInitializationEvent event)
    {

    }
       
    @cpw.mods.fml.common.Mod.EventHandler
    public void postInit(cpw.mods.fml.common.event.FMLPostInitializationEvent event)
    {
    }
	
}
