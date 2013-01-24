package mountsingapore;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class SPtaff extends ItemSword {
	public SPtaff( int ItemID, EnumToolMaterial material){
		super(ItemID, material);
		this.setCreativeTab(CreativeTabs.tabTools);
		
	}
	public String getTextureFile(){
		return "/textures/items.png";
	}
}
