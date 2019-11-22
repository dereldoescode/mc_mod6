package coloredDiamonds.items.tools;

import coloredDiamonds.Main;
import coloredDiamonds.init.ModItems;
import coloredDiamonds.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;

import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel {

	public ToolAxe  (String name, ToolMaterial Material) {
		super(Material,  10.0F, -3.0F); 
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
