package net.mountsingapore;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PickAxe extends ItemPickaxe{
	public PickAxe(int ItemID, EnumToolMaterial material){
super(ItemID, material);
}
public String getTextureFile(){
return "textures/items.png";
}
@SideOnly(Side.CLIENT)
public EnumRarity getRarity(ItemStack par1){
return EnumRarity.epic;
}
}

