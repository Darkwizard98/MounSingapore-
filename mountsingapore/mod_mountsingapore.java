package net.mountsingapore;

import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import net.mountsingapore.Common.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;




@Mod(modid ="MountSingapore", name = "School Project", version = "0.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class mod_mountsingapore {
		public static Block Block1;
		public static Item EPickAxe;
		public static Item ThePunisher;
		public static Item EAxe;
		
		int Block1ID, EPickAxeID, ThePunisherID, EAxeID;
		
		@SidedProxy(clientSide="net.mountsingapore.Client.ClientProxy", serverSide="net.mountsingapore.common.ClientProxy")
		public static CommonProxy proxy;
		static EnumToolMaterial EnumEmerald= EnumHelper.addToolMaterial("Emerald", 2, 400, 6.0F, 6, 15);
		
		@PreInit
		public void PreLoad(FMLPreInitializationEvent event){
			
			Configuration config = new Configuration(event.getSuggestedConfigurationFile());
			
			config.load();
			//Block id Range: 1551-1998
			//Item Id Range: 5001-6899
			Block1ID= config.getBlock("Block1ID", 1551).getInt();
			EPickAxeID= config.getItem("EPickAxeID", 5001).getInt();
			ThePunisherID= config.getItem("ThePuniserID", 5002).getInt();
			EAxeID= config.getItem("EAxeID", 5003).getInt();
		}
@Init
public void load(FMLInitializationEvent event){
	Block1 = new Block1(Block1ID,0).setHardness(3F).setResistance(1.0F).setBlockName("TestBlock");
	EPickAxe= new EPickAxe(EPickAxeID, EnumEmerald).setItemName("Emerald PickAxe").setIconIndex(11);
	ThePunisher = new ThePunisher(ThePunisherID, EnumEmerald).setItemName("The Punisher").setIconIndex(13);
	EAxe= new EAxe(EAxeID, EnumEmerald).setItemName("Emerald Axe").setIconIndex(12);
	GameRegistry.registerBlock(Block1);
	
	
	LanguageRegistry.addName(Block1, "TempName");
	LanguageRegistry.addName(EPickAxe, "Emerald PickAxe");
	LanguageRegistry.addName(ThePunisher, "The Punisher");
	LanguageRegistry.addName(EAxe, "Emerald Axe");
	
	proxy.registerRenderThings();
}
}
