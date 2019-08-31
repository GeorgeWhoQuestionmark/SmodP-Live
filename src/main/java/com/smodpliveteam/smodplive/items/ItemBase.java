package com.smodpliveteam.smodplive.items;

import com.smodpliveteam.smodplive.init.ModItems;
import com.smodpliveteam.smodplive.main;
import com.smodpliveteam.smodplive.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name, CreativeTabs creativetab){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(creativetab);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels(){
        main.proxy.registerItemRenderer(this,0,"inventory");
    }
}
