package com.example.stevesaga;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
    public static Item lightStone;
    public static Item rainbowStone;
    public static Item nightmareStone;
    public static Item darkStone;

    public static void init() {
        lightStone = new Item().setRegistryName("light_stone").setUnlocalizedName("lightStone");
        rainbowStone = new Item().setRegistryName("rainbow_stone").setUnlocalizedName("rainbowStone");
        nightmareStone = new Item().setRegistryName("nightmare_stone").setUnlocalizedName("nightmareStone");
        darkStone = new Item().setRegistryName("dark_stone").setUnlocalizedName("darkStone");

        GameRegistry.register(lightStone);
        GameRegistry.register(rainbowStone);
        GameRegistry.register(nightmareStone);
        GameRegistry.register(darkStone);
    }
}