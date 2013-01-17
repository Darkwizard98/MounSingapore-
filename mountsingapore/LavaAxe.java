package net.mountsingapore;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class LavaAxe extends ItemSword{
	public LavaAxe(int ItemID, EnumToolMaterial material){
		super(ItemID, material);
		this.setCreativeTab(CreativeTabs.tabTools);
		
	}
	public String getTextureFile(){
		return "/textures/items.png";
	}
	

}
