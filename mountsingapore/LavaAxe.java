package mountsingapore;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class LavaAxe extends ItemSword{
	public LavaAxe(int ItemID, EnumToolMaterial material){
		super(ItemID, material);
		this.setCreativeTab(CreativeTabs.tabTools);
		
	}
	public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer){
		par1ItemStack.addEnchantment(Enchantment.flame, 5);
	}
	public String getTextureFile(){
		return "/textures/items.png";
	}
	

}
