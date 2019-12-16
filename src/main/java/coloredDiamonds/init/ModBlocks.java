package coloredDiamonds.init;

import java.util.ArrayList;
import java.util.List;

import coloredDiamonds.blocks.BlockBase;
import coloredDiamonds.blocks.RoseOre;
import coloredDiamonds.blocks.catalyzer.BlockCatalyzer;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks 
{

public static final List<Block> BLOCKS = new ArrayList<Block>();	

public static final Block ROSE_BLOCK = new BlockBase("rose_block", Material.IRON);

public static final Block ROSE_ORE = new RoseOre("rose_ore",Material.ROCK);

public static final Block CATALYZER = new BlockCatalyzer();



@SuppressWarnings("deprecation")
public static void register(IForgeRegistry<Block> registry) {
	registry.registerAll(
			// ...
			CATALYZER
	);

	GameRegistry.registerTileEntity(((BlockCatalyzer) CATALYZER).getTileEntityClass(), CATALYZER.getRegistryName().toString());
}

public static void registerItemBlocks(IForgeRegistry<Item> registry) {
	registry.registerAll(
			// ...
			((BlockCatalyzer) CATALYZER).createItemBlock()
	);
}

public static void registerModels() {
	// ...
	((BlockCatalyzer) CATALYZER).registerItemModel();
}



}
	

