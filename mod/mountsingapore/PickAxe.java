package mod.mountsingapore;

import net.minecraft.src.EnumRarity;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemPickaxe;
import net.minecraft.src.ItemStack;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

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

