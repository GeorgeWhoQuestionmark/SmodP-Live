package com.smodpliveteam.smodplive.init;

import com.smodpliveteam.smodplive.items.AxeBase;
import com.smodpliveteam.smodplive.items.ItemBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModItems
{
    public static final List<Item> ITEMS = new ArrayList<Item>();
    public static final AxeBase ASSPENIS7 = new AxeBase(
            "asspenis7",
            Item.ToolMaterial.DIAMOND,
            42068.0f,
            -3.2F
    );
    public static final Item SCHLATTCOIN = new ItemBase(
            "schlattcoin",
            CreativeTabs.MISC
    );
}
