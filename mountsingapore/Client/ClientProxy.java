package mountsingapore.Client;

import mountsingapore.Common.CommonProxy;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy
{
 @Override
 public void registerRenderThings(){
	 MinecraftForgeClient.preloadTexture("/textures/blocks.png");
	 MinecraftForgeClient.preloadTexture("/textures/items.png");
 }
 
}
