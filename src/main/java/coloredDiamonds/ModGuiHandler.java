package coloredDiamonds;

import coloredDiamonds.blocks.GUICatalyzer;
import coloredDiamonds.blocks.catalyzer.CatalyzerContents;
import coloredDiamonds.blocks.catalyzer.TileEntityCatalyzer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class ModGuiHandler implements IGuiHandler {

	public static final int CATALYZER = 0;
	
	
	@Override
	public Container getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch (ID) {
			case CATALYZER:
				return new CatalyzerContents(player.inventory, (TileEntityCatalyzer)world.getTileEntity(new BlockPos(x, y, z)));
			default:
				return null;
		}
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch (ID) {
			case CATALYZER:
				return new GUICatalyzer(getServerGuiElement(ID, player, world, x, y, z), player.inventory);
			default:
				return null;
		}
	}

	
	
}
