package mod.mountsingapore;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class Block1 extends Block {
	public Block1(int i, int e){
		super(i, e, Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
		
	}
	public String getTexutreFile(){
		return "textures/items.png";
	}
}
