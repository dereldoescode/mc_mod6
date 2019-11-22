package coloredDiamonds.items.tools;

import coloredDiamonds.Main;
import coloredDiamonds.init.ModItems;
import coloredDiamonds.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;


public class ToolSpade extends ItemSpade implements IHasModel {

	public ToolSpade (String name, ToolMaterial Material) {
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
