package mountsingapore;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ThePunisher extends ItemSword{
	public ThePunisher(int ItemID, EnumToolMaterial material){
		super(ItemID, material);
		this.setCreativeTab(CreativeTabs.tabTools);
	}
	public String getTextureFile(){
		return "/textures/items.png";
	}
	
	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1){
		return EnumRarity.epic;
	}

}
