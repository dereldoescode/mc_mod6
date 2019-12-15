package coloredDiamonds.init;

import java.util.ArrayList;
import java.util.List;

import coloredDiamonds.blocks.BlockBase;
import coloredDiamonds.blocks.RoseOre;
import coloredDiamonds.blocks.counter.BlockCounter;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlock 
{

public static final List<Block> BLOCKS = new ArrayList<Block>();	

public static final Block ROSE_BLOCK = new BlockBase("rose_block", Material.IRON);

public static final Block ROSE_ORE = new RoseOre("rose_ore",Material.ROCK);

public static final Block CATALYZER = new BlockBase("catalyzer_block", Material.IRON);

public static BlockCounter counter = new BlockCounter();

public static void register(IForgeRegistry<Block> registry) {
	registry.registerAll(
			// ...
			counter
	);

	GameRegistry.registerTileEntity(counter.getTileEntityClass(), counter.getRegistryName().toString());
}

public static void registerItemBlocks(IForgeRegistry<Item> registry) {
	registry.registerAll(
			// ...
			counter.createItemBlock()
	);
}

public static void registerModels() {
	// ...
	counter.registerItemModel();
}

}
	

