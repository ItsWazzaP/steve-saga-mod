package com.example.stevesaga;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipes {
    public static void init() {
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.condensedLightStone), "XXX", "XXX", "XXX", 'X', ModItems.lightStone);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.condensedRainbowStone), "XXX", "XXX", "XXX", 'X', ModItems.rainbowStone);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.condensedNightmareStone), "XXX", "XXX", "XXX", 'X', ModItems.nightmareStone);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.condensedDarkStone), "XXX", "XXX", "XXX", 'X', ModItems.darkStone);
    }
}