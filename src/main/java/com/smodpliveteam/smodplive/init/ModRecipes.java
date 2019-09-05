package com.smodpliveteam.smodplive.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
    public static void init(){
        GameRegistry.addSmelting(ModBlocks.schlattcoin_ore, new ItemStack(ModItems.SCHLATTCOIN,1), 1.2f);
    }
}
