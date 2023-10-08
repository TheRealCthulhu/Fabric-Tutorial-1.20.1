package net.cameron.cthulhumod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;

import static net.cameron.cthulhumod.item.ModItems.registerItem;


public class ModFuelItems {
    public static final Item COAL_CHUNK = registerItem("coal_chunk", new Item(new FabricItemSettings()));

    public static void registerFuelItems() {
        FuelRegistry.INSTANCE.add(COAL_CHUNK, 400);
    }
}
