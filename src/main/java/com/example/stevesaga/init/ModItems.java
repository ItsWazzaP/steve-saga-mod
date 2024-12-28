package com.example.stevesaga.init;

import com.example.stevesaga.SteveSaga;
import com.example.stevesaga.objects.items.ItemLightStone;
import com.example.stevesaga.objects.items.ItemRainbowStone;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ModItems {
    public static final Item RAINBOW_STONE = new ItemRainbowStone();
    public static final Item LIGHT_STONE = new ItemLightStone();

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
            RAINBOW_STONE,
            LIGHT_STONE
        );
    }
}