package mountsingapore;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class ModWorldGenerator implements IWorldGenerator {

	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
	switch (world.provider.dimensionId)
	{
	case -1 : generateNether(world, rand, chunkX * 16, chunkZ * 16);
	case 0 : generateSurface(world, rand, chunkX * 16, chunkZ * 16);
	}
	}

	public void generateSurface(World world, Random rand, int blockX, int blockZ) {
		addOreGen(mod_mountsingapore.LAAxeBlock.blockID, 1, 99, 16, blockX, blockZ, world, rand);
		addOreGen(mod_mountsingapore.LAStickBlock.blockID, 1, 299, 16, blockX, blockZ, world, rand);
		addOreGen(mod_mountsingapore.PunBladeBlock.blockID, 1, 299, 16, blockX, blockZ, world, rand);
		addOreGen(mod_mountsingapore.PunHiltBlock.blockID, 1, 299, 16, blockX, blockZ, world, rand);
		addOreGen(mod_mountsingapore.SAstickBlock.blockID, 1, 299, 16, blockX, blockZ, world, rand);
		addOreGen(mod_mountsingapore.SAheadBlock.blockID, 1, 299, 16, blockX, blockZ, world, rand);
		addOreGen(mod_mountsingapore.SPstickBlock.blockID, 1, 299, 16, blockX, blockZ, world, rand);
		addOreGen(mod_mountsingapore.SPheadBlock.blockID, 1, 299, 16, blockX, blockZ, world, rand);
		}

	public void generateNether(World world, Random rand, int blockX, int blockZ) {}

	public void addOreGen(int blockID, int veinSize, int rarity, int maxYLevel, int blockX, int blockZ, World world, Random rand)
	{
	for (int i = 0; i < rarity; i++)
	{
	int x = blockX + rand.nextInt(16);
	int y = rand.nextInt(maxYLevel);
	int z = blockZ + rand.nextInt(16);

	(new WorldGenMinable(blockID, veinSize)).generate(world, rand, x, y, z);
	}
	}
	}
