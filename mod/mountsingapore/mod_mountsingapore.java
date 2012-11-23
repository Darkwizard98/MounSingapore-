package mod.mountsingapore;

import mountsingapore.Common.CommonProxy;
import net.minecraft.src.Block;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;




@Mod(modid ="MountSingapore", name = "tut", version = "0.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class mod_mountsingapore {
		public static Block Block1;
		
		@SidedProxy(clientSide="mountsingapore.Client.ClientProxy", serverSide="mountsingapore.common.ClientProxy")
		public static CommonProxy proxy;
		
@Init
public void load(FMLInitializationEvent event){
	Block1 = new Block1(230, 0).setHardness(3F).setResistance(1.0F).setBlockName("TestBlock");
	
	GameRegistry.registerBlock(Block1);
	
	
	LanguageRegistry.addName(Block1, "TempName");
	
	proxy.registerRenderThings();
}
}
