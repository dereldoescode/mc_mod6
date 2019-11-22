package coloredDiamonds.init;

import java.util.ArrayList;
import java.util.List;

import coloredDiamonds.blocks.BlockBase;
import coloredDiamonds.blocks.RoseOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlock 
{

public static final List<Block> BLOCKS = new ArrayList<Block>();	

public static final Block ROSE_BLOCK = new BlockBase("rose_block", Material.IRON);

public static final Block ROSE_ORE = new RoseOre("rose_ore",Material.ROCK);
	
	
}
