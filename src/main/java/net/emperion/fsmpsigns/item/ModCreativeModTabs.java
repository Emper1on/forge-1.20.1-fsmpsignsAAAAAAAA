package net.emperion.fsmpsigns.item;

import net.emperion.fsmpsigns.fsmpSigns;
import net.emperion.fsmpsigns.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, fsmpSigns.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FSMP_SIGNS_TAB = CREATIVE_MODE_TAB.register("fsmp_signs",
            () -> CreativeModeTab.builder().icon(() -> new  ItemStack(ModItems.SIGN_WLODYKA.get()))
                    .title(Component.translatable("creativetab.fsmp_signs"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SIGN_WLODYKA.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }


}