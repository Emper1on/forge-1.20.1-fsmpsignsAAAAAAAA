package net.emperion.fsmpsigns.datagen.loot;


import net.emperion.fsmpsigns.block.ModBlocks;
import net.emperion.fsmpsigns.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
       this.add(ModBlocks.SIGN_WLODYKA.get(), block ->
               createSingleItemTable(ModItems.SIGN_WLODYKA.get()));

    }



    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
