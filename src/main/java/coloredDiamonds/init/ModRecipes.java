package coloredDiamonds.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init() {
		
		GameRegistry.addSmelting(ModBlock.ROSE_ORE, new ItemStack (ModItems.rose, 4), 1.5f);
		
		
	}
	
	
	

}
