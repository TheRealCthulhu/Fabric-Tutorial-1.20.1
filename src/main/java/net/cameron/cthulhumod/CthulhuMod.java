package net.cameron.cthulhumod;

import net.cameron.cthulhumod.block.ModBlocks;
import net.cameron.cthulhumod.item.ModFuelItems;
import net.cameron.cthulhumod.item.ModItemGroups;
import net.cameron.cthulhumod.item.ModItems;
import net.cameron.cthulhumod.util.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CthulhuMod implements ModInitializer {
	public static final String MOD_ID = "cthulhumod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModLootTableModifiers.modifyLootTables();

		ModFuelItems.registerFuelItems();
	}
}