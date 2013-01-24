package mountsingapore;

import mountsingapore.Common.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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




@Mod(modid ="MountSingapore", name = "School Project", version = "0.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class mod_mountsingapore {
		public static Block PunHiltBlock,PunBladeBlock,LAAxeBlock,LAStickBlock,SAstickBlock,SAheadBlock,SPheadBlock,
		SPstickBlock;
		
		public static Item EPickAxe, ThePunisher,EAxe,PunHilt,PunBlade,LavaAxe,LAAxe,LAStick,SPtaff, SPhead,SPstick,
		 SAtaff,SAhead,SAstick;
		
		int PunHiltBlockID, EPickAxeID, ThePunisherID, EAxeID, PunHiltID, PunBladeID, LavaAxeID, LAAxeID, LAStickID
		,LAAxeBlockID, LAStickBlockID, PunBladeBlockID, SPtaffID,SPheadID,SPstickID,SAtaffID,SAheadID,SAstickID,
		SAheadBlockID,SAstickBlockID,SPheadBlockID,SPstickBlockID;
		
		@SidedProxy(clientSide="mountsingapore.Client.ClientProxy", serverSide="mountsingapore.Common.CommonProxy")
		public static CommonProxy proxy;
		static EnumToolMaterial EnumEmerald= EnumHelper.addToolMaterial("Emerald", 2, 400, 6.0F, 6, 15);
		static EnumToolMaterial EnumLava= EnumHelper.addToolMaterial("Lava", 2, 400, 6.0F, 6, 15);
		
		@PreInit
		public void PreLoad(FMLPreInitializationEvent event){
			
			Configuration config = new Configuration(event.getSuggestedConfigurationFile());
			
			config.load();
			//Block id Range: 1551-1998
			//Item Id Range: 5001-6899
			
			//Blocks
			PunHiltBlockID= config.getBlock("PunHiltBlockID", 1551).getInt();
			PunBladeBlockID= config.getBlock("PunBladeBlockID", 1552).getInt();
			LAAxeBlockID= config.getBlock("LAAxeBlockID", 1553).getInt();
			LAStickBlockID= config.getBlock("LAStickBlockID", 1554).getInt();
			SAheadBlockID = config.getBlock("SAheadBlockID", 1555).getInt();
			SAstickBlockID = config.getBlock("SAstickBlockID", 1556).getInt();
			SPheadBlockID = config.getBlock("SPheadBlockID",1557).getInt();
			SPstickBlockID = config.getBlock("SPstickBlock",1558).getInt();
			
			//Items
			EPickAxeID= config.getItem("EPickAxeID", 5001).getInt();
			ThePunisherID= config.getItem("ThePuniserID", 5002).getInt();
			EAxeID= config.getItem("EAxeID", 5003).getInt();
			PunHiltID= config.getItem("PunHiltID", 5004).getInt();
			PunBladeID= config.getItem("PunBladeID", 5005).getInt();
			LavaAxeID= config.getItem("LavaAxeID", 5006).getInt();
			LAAxeID= config.getItem("LLAxeID", 5007).getInt();
			LAStickID= config.getItem("LAStickID", 5008).getInt();
			SAtaffID= config.getItem("SAtaffID", 5009).getInt();
			SAheadID= config.getItem("SAheadID", 5010).getInt();
			SAstickID= config.getItem("SAstickID", 5011).getInt();
			SPtaffID= config.getItem("SAtaffID", 5012).getInt();
			SPheadID= config.getItem("SPheadID", 5013).getInt();
			SPstickID= config.getItem("SPstickID", 5014).getInt();
			
		}
@Init
public void load(FMLInitializationEvent event){
	
	//Blocks
	
	
	//ThePunisherBlocks
	PunHiltBlock = new PunHiltBlock(PunHiltBlockID,0).setHardness(3F).setResistance(1.0F).setBlockName("PunHiltBlock");
	PunBladeBlock= new PunBladeBlock(PunBladeBlockID,1).setHardness(3F).setResistance(1.0F).setBlockName("PunBladeBlock");
	
	//staff blocks
	SAheadBlock = new SAheadBlock(SAheadBlockID,3).setHardness(3F).setResistance(1.0F).setBlockName("Serpent Gem Block");
	SAstickBlock = new SAstickBlock(SAstickBlockID,7).setHardness(3F).setResistance(1.0F).setBlockName("Serpent stick Block");
	SPheadBlock = new SPheadBlock(SPheadBlockID,2).setHardness(3F).setResistance(1.0F).setBlockName("Emun gem");
	SPstickBlock = new SPstickBlock(SPstickBlockID,5).setHardness(3F).setResistance(1.0F).setBlockName("Emun stick");
	
	
	
	////lava Axe Blocks
	LAAxeBlock= new LAAxeBlock(LAAxeBlockID,4).setHardness(3F).setResistance(1.0F).setBlockName("Lava Axe Block");
	LAStickBlock= new LAStickBlock(LAStickBlockID,6).setHardness(3F).setResistance(1.0F).setBlockName("Lava hilt Block");
	
	//Items
	EPickAxe= new EPickAxe(EPickAxeID, EnumEmerald).setItemName("Emerald PickAxe").setIconIndex(11);
	
	////staffs
	SAtaff = new SAtaff(SAtaffID,EnumEmerald).setItemName("Serpent Staff").setIconIndex(29);
	SAhead = new SAhead(SAheadID).setItemName("Serpent gem").setIconIndex(36);
	SAstick = new SAstick(SAstickID).setItemName("Powerful Stick").setIconIndex(37);
	SPtaff = new SPtaff(SPtaffID, EnumEmerald).setItemName("Emun Staff").setIconIndex(0);
	
	
	////The Punisher
	ThePunisher = new ThePunisher(ThePunisherID, EnumEmerald).setItemName("The Punisher").setIconIndex(13);
	PunHilt = new PunHilt(PunHiltID).setItemName("Broken Punisher Hilt").setIconIndex(1);
	PunBlade = new PunBlade(PunBladeID).setItemName("Broken Punisher Blade").setIconIndex(1);
	
	////Lava Axe
	LavaAxe= new LavaAxe(LavaAxeID, EnumLava).setItemName("Lava Axe").setIconIndex(28);
	LAAxe= new LLAxe(LAAxeID).setItemName("Broken Unknown Blade").setIconIndex(1);
	LAStick= new LAStick(LAStickID).setItemName("Broken Unknown Stick").setIconIndex(1);
	
	EAxe= new EAxe(EAxeID, EnumEmerald).setItemName("Emerald Axe").setIconIndex(12);
	GameRegistry();
	LanguageRegistry();
	proxy.registerRenderThings();
}

public void GameRegistry(){
	//Blocks
	GameRegistry.registerBlock(PunHiltBlock);
	GameRegistry.registerBlock(PunBladeBlock);
	GameRegistry.registerBlock(LAAxeBlock);
	GameRegistry.registerBlock(LAStickBlock);
	GameRegistry.registerBlock(SPstickBlock);
	GameRegistry.registerBlock(SPheadBlock);
	GameRegistry.registerBlock(SAheadBlock);
	GameRegistry.registerBlock(SAheadBlock);
	
	//Crafting
	GameRegistry.addRecipe(new ItemStack(ThePunisher), new Object[]{
		"SSS","SBS","HPS", 'S', Item.ingotIron, 'B', PunBlade, 'H', PunHilt, 'P', new ItemStack(Item.dyePowder, 5, 5)
	});
	GameRegistry.addRecipe(new ItemStack(LavaAxe), new Object[]{
		"  S","OB ","HO ", 'S', Item.bucketLava, 'B', LAAxe, 'H', LAStick, 'O', Block.obsidian 
	});
//	GameRegistry.addRecipe(new ItemStack(SPtaff), new Object[]{
//		"  ","B  ","B  ", 'S', SAhead, 'B', SAstick
//	});
//	GameRegistry.addRecipe(new ItemStack(SAtaff), new Object[]{
//		"   ","S  ","B  ", 'S', SPhead, 'B', SPstick
//	});
	GameRegistry.registerWorldGenerator(new ModWorldGenerator());
	
}

public void LanguageRegistry(){
	
	//Blocks
	LanguageRegistry.addName(PunHiltBlock, "PunHiltBlock");
	LanguageRegistry.addName(PunBladeBlock, "PunBladeBlock");
	
	//Items
	LanguageRegistry.addName(EPickAxe, "Emerald PickAxe");
	
	
	//// The Punisher
	LanguageRegistry.addName(ThePunisher, "The Punisher");
	LanguageRegistry.addName(PunHilt, "Broken Punisher Hilt");
	LanguageRegistry.addName(PunBlade, "Broken Punisher Blade");
	
	////Lava Axe
	LanguageRegistry.addName(LavaAxe, "Lava Axe");
	LanguageRegistry.addName(LAAxe, "Broken Unknown Axe Blade");
	LanguageRegistry.addName(LAStick, "Broken Unkown Obsidian Stick");
	//// Tools
	LanguageRegistry.addName(EAxe, "Emerald Axe");
}
}
