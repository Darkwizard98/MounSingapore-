package mountsingapore;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PunHilt extends Item{
	public PunHilt(int ItemID){
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
