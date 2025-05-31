package net.emperion.fsmpsigns.item;

import net.emperion.fsmpsigns.block.ModBlocks;
import net.emperion.fsmpsigns.fsmpSigns;
import net.emperion.fsmpsigns.item.custom.InfiniteModSign;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, fsmpSigns.MOD_ID);

    public static final RegistryObject<Item> SIGN_WLODYKA = ITEMS.register("sign_wlodyka_item",
            () -> new InfiniteModSign(new Item.Properties().stacksTo(1), ModBlocks.SIGN_WLODYKA.get(), ModBlocks.SIGN_WALL_WLODYKA.get()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
