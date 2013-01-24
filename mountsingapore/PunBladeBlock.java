package mountsingapore;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class PunBladeBlock extends Block{
	public PunBladeBlock(int i, int e){
		super(i, e, Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	public int idDropped(int par1 , Random par2Random, int par3){
		return mod_mountsingapore.PunBlade.itemID;
	}
	
	public String getTextureFile(){
		return "/textures/blocks.png";
	}
}
