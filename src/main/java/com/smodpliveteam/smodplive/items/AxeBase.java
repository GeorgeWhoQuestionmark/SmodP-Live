package com.smodpliveteam.smodplive.items;

import com.smodpliveteam.smodplive.init.ModItems;
import com.smodpliveteam.smodplive.main;
import com.smodpliveteam.smodplive.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class AxeBase extends ItemAxe implements IHasModel {
    public AxeBase(String name, ToolMaterial material, float attackDamage, float attackSpeed){
        super(material,attackDamage,attackSpeed);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.TOOLS);
        ModItems.ITEMS.add(this);
    }
    @Override
    public void registerModels() {
        main.proxy.registerItemRenderer(this,0,"inventory");
    }
}
