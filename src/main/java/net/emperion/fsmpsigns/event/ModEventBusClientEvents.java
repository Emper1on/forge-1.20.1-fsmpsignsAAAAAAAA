package net.emperion.fsmpsigns.event;

import net.emperion.fsmpsigns.block.entity.renderer.ModBlockEntites;
import net.emperion.fsmpsigns.fsmpSigns;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = fsmpSigns.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {

       @SubscribeEvent
       public static void registerBER(EntityRenderersEvent.RegisterRenderers event) {
          event.registerBlockEntityRenderer(ModBlockEntites.MOD_SIGN.get(), SignRenderer::new);



    }
}
