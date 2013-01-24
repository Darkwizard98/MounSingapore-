package mountsingapore;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;

public class EAxe extends ItemAxe{
	public EAxe(int ItemID, EnumToolMaterial material){
		super(ItemID, material);
	}
	public String getTextureFile(){
		return "/textures/items.png";
	}

}
