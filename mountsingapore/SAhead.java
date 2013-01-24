package mountsingapore;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SAhead extends Item{
	public SAhead(int ItemID){
		super(ItemID);
		this.setCreativeTab(CreativeTabs.tabMisc);
	}
	

	public String getTextureFile(){
		return "/textures/items.png";
	}
}
