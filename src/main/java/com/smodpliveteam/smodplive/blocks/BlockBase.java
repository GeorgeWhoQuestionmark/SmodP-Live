package com.smodpliveteam.smodplive.blocks;

import com.smodpliveteam.smodplive.init.ModBlocks;
import com.smodpliveteam.smodplive.init.ModItems;
import com.smodpliveteam.smodplive.main;
import com.smodpliveteam.smodplive.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {
    public BlockBase(String name, Material material, CreativeTabs creativetab){
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(creativetab);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        main.proxy.registerItemRenderer(Item.getItemFromBlock(this),0,"inventory");
    }
}
