package net.mountsingapore;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class LLAxe extends Item{
	public LLAxe(int ItemID){
		super(ItemID);
		this.setCreativeTab(CreativeTabs.tabMisc);
	}
	public String getTextureFile(){
		return "/textures/items.png";
	}

}
