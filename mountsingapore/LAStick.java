package mountsingapore;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class LAStick extends Item{
	public LAStick(int ItemID){
		super(ItemID);
		this.setCreativeTab(CreativeTabs.tabMisc);
	}
	public String getTextureFile(){
		return "/textures/items.png";
	}

}
