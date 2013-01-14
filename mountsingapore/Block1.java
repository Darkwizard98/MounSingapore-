package net.mountsingapore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;



public class Block1 extends Block {
	public Block1(int i, int e){
		super(i, e, Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
		
	}
	public String getTexutreFile(){
		return "textures/items.png";
	}
}
