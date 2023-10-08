package net.cameron.cthulhumod.util;

import net.cameron.cthulhumod.item.ModFuelItems;
import net.cameron.cthulhumod.item.ModItems;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {
    private static final Identifier WITHER_SKELETON_ID =
            new Identifier("minecraft", "entities/wither_skeleton");


    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) ->  {
            if(WITHER_SKELETON_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.7f)) // 70% drop chance
                        .with(ItemEntry.builder(ModFuelItems.COAL_CHUNK))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }


        });
    }
}
