package net.emperion.fsmpsigns.utils;

import net.emperion.fsmpsigns.fsmpSigns;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ModWoodTypes {
    public static final WoodType FLOWER = WoodType.register(new WoodType(fsmpSigns.MOD_ID + ":flower", BlockSetType.OAK));
}
