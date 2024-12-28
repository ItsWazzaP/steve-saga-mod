package com.example.stevesaga;

import com.example.stevesaga.init.ModBlocks;
import com.example.stevesaga.init.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = SteveSaga.MODID, name = SteveSaga.NAME, version = SteveSaga.VERSION)
public class SteveSaga {
    public static final String MODID = "stevesaga";
    public static final String NAME = "Steve Saga";
    public static final String VERSION = "1.0";

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(ModBlocks.class);
        MinecraftForge.EVENT_BUS.register(ModItems.class);
    }
}