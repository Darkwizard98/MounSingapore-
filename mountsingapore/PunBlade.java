package mountsingapore;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PunBlade extends Item{
	public PunBlade(int ItemID){
		super(ItemID);
		this.setCreativeTab(CreativeTabs.tabMisc);
		
	}
	public String getTextureFile(){
		return "/textures/items.png";
	}
	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1){
		return EnumRarity.epic;
	}

}
