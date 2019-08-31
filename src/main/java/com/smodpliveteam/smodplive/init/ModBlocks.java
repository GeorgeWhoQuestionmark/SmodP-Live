package com.smodpliveteam.smodplive.init;

import com.smodpliveteam.smodplive.blocks.BlockBase;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;
import net.minecraft.block.BlockMelon;
import net.minecraft.creativetab.CreativeTabs;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();
    /*
                    <-- Blocks -->
     */
    public static final Block HolyMelon_BLOCK = new BlockBase("holy_melon", Material.WOOD, CreativeTabs.BUILDING_BLOCKS);
}
