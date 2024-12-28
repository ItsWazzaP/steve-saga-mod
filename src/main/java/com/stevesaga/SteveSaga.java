package com.example.stevesaga;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = SteveSaga.MODID, name = SteveSaga.NAME, version = SteveSaga.VERSION)
public class SteveSaga {
    public static final String MODID = "stevesaga";
    public static final String NAME = "Steve Saga";
    public static final String VERSION = "1.0";

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModBlocks.init();
        ModItems.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        // Register recipes, commands, etc.
    }
}