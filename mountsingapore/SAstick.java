package mountsingapore;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


	public class SAstick extends Item{
		public SAstick(int ItemID){
			super(ItemID);
			this.setCreativeTab(CreativeTabs.tabMisc);
		}
		
		public String getTextureFile(){
			return "/textures/items.png";
		}
}
