package coloredDiamonds.blocks;

import java.util.Random;

import coloredDiamonds.init.ModItems;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class RoseOre extends BlockBase {
public RoseOre(String name, Material material) {
	super(name, material);
	setSoundType(SoundType.METAL);
	setHardness(5.0F);
	setResistance(15.0F);
	setHarvestLevel("pickaxe", 2); 

	
	
	
	
	  
}

@Override
public Item getItemDropped(IBlockState state, Random rand, int fortune) {
return ModItems.rose;
}

@Override 
public int quantityDropped(Random rand) {
	return 3;
}

}
