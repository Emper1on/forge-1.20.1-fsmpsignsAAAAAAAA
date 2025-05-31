package net.emperion.fsmpsigns.datagen;

import net.emperion.fsmpsigns.fsmpSigns;
import net.emperion.fsmpsigns.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, fsmpSigns.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        signBlock(((StandingSignBlock) ModBlocks.SIGN_WLODYKA.get()), ((WallSignBlock) ModBlocks.SIGN_WALL_WLODYKA.get()),
                blockTexture(ModBlocks.SIGN_WLODYKA.get()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

}