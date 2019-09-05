package com.smodpliveteam.smodplive;

import com.smodpliveteam.smodplive.init.ModRecipes;
import com.smodpliveteam.smodplive.proxy.CommonProxy;
import com.smodpliveteam.smodplive.util.reference;
import com.smodpliveteam.smodplive.world.CustomWorldGen;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid= reference.MOD_ID, name = reference.NAME, version = reference.VERSION)
public class main {
    @Mod.Instance
    public static main Instance;

    @SidedProxy(clientSide = reference.CLIENT_PROXY_CLASS, serverSide = reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void PreInit(FMLPreInitializationEvent event)
    {
        GameRegistry.registerWorldGenerator(new CustomWorldGen(), 3);
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event)
    {
        ModRecipes.init();
    }

    @Mod.EventHandler
    public static void PostInit(FMLPostInitializationEvent event)
    {

    }
}
