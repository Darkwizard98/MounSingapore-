package mod.mountsingapore;

import mountsingapore.Common.CommonProxy;
import net.minecraft.src.Block;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.Item;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;




@Mod(modid ="MountSingapore", name = "tut", version = "0.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class mod_mountsingapore {
		public static Block Block1;
		public static Item PickAxe;
		
		int Block1ID, PickAxeID;
		
		@SidedProxy(clientSide="mountsingapore.Client.ClientProxy", serverSide="mountsingapore.common.ClientProxy")
		public static CommonProxy proxy;
		static EnumToolMaterial EnumAmodMat= EnumHelper.addToolMaterial("Amod", 2, 400, 6.0F, 6, 15);
		
		@PreInit
		public void PreLoad(FMLPreInitializationEvent event){
			
			Configuration config = new Configuration(event.getSuggestedConfigurationFile());
			
			config.load();
			
			Block1ID= config.getBlock("Block1ID", 1551).getInt();
			PickAxeID= config.getItem("PickAxeID", 5001).getInt();
		}
@Init
public void load(FMLInitializationEvent event){
	//Block id Range: 1551-1998
	//Item Id Range: 5001-6899
	Block1 = new Block1(Block1ID,0).setHardness(3F).setResistance(1.0F).setBlockName("TestBlock");
	PickAxe= new PickAxe(PickAxeID, EnumAmodMat).setItemName("TempPickAxeName").setIconIndex(3);
	GameRegistry.registerBlock(Block1);
	
	
	LanguageRegistry.addName(Block1, "TempName");
	
	proxy.registerRenderThings();
}
}
