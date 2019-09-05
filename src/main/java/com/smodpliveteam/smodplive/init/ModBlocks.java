package com.smodpliveteam.smodplive.init;

import com.smodpliveteam.smodplive.blocks.BlockBase;
import net.minecraft.block.SoundType;
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
    public static final Block HolyMelon_BLOCK = new BlockBase(
            "holy_melon",
            Material.WOOD,
            CreativeTabs.BUILDING_BLOCKS,
            SoundType.WOOD,
            1.0f,
            5.0f,
            "axe",
            1,
            1.0f,
            0,
            false
    );
    public static final Block schlattcoin_block = new BlockBase(
            "schlattcoin_block",
            Material.IRON,
            CreativeTabs.BUILDING_BLOCKS,
            SoundType.ANVIL,
            7.0f,
            30.0f,
            "pickaxe",
            2,
            0f,
            0,
            false
    );
    public static final Block schlattcoin_ore = new BlockBase(
            "schlattcoin_ore",
            Material.ROCK,
            CreativeTabs.BUILDING_BLOCKS,
            SoundType.STONE,
            7.0f,
            30.0f,
            "pickaxe",
            2,
            0f,
            0,
            false
    );
}
