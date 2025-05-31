package net.emperion.fsmpsigns.item.custom;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SignItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class InfiniteModSign extends SignItem {
    public InfiniteModSign(Properties properties, Block block, Block block1) {
        super(properties, block, block1);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        super.useOn(context);
        context.getPlayer().getInventory().add(this.getDefaultInstance());
        return InteractionResult.SUCCESS;
    }

}