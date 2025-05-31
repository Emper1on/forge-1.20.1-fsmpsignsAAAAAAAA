package net.emperion.fsmpsigns.block;

import net.emperion.fsmpsigns.block.custom.ModStandingSignBlock;
import net.emperion.fsmpsigns.block.custom.ModWallSignBlock;
import net.emperion.fsmpsigns.fsmpSigns;
import net.emperion.fsmpsigns.item.ModItems;
import net.emperion.fsmpsigns.utils.ModWoodTypes;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, fsmpSigns.MOD_ID);


    public static final RegistryObject<Block> SIGN_WLODYKA = registerBlock("sign_wlodyka",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.FLOWER));

    public static final RegistryObject<Block> SIGN_WALL_WLODYKA = registerBlock("sign_wall_wlodyka",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.FLOWER));



    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }



    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
            }

            public static void register(IEventBus eventBus) {
                BLOCKS.register(eventBus);
            }

}
