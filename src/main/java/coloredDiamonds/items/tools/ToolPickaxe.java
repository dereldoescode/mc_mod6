package coloredDiamonds.items.tools;

import coloredDiamonds.Main;
import coloredDiamonds.init.ModItems;
import coloredDiamonds.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;

import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe implements IHasModel {
	public ToolPickaxe (String name, ToolMaterial Material) {
		super(Material); 
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this,0,"inventory");
	}
	
}
