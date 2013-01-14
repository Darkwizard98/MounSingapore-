package net.mountsingapore.Client;

import net.minecraftforge.client.MinecraftForgeClient;
import net.mountsingapore.Common.CommonProxy;

public class ClientProxy extends CommonProxy
{
 @Override
 public void registerRenderThings(){
	 MinecraftForgeClient.preloadTexture("textures/Blocks.png");
	 MinecraftForgeClient.preloadTexture("textures/Items.png");
 }
 
}
