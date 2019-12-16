package coloredDiamonds.blocks.catalyzer;


import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;

import javax.annotation.Nullable;
import javax.swing.plaf.basic.BasicComboBoxUI.ItemHandler;

import coloredDiamonds.Main;
import coloredDiamonds.ModGuiHandler;
import coloredDiamonds.blocks.BlockTileEntity;

public class BlockCatalyzer extends BlockTileEntity<TileEntityCatalyzer> {

	public BlockCatalyzer() {
		super(Material.ROCK, "catalyzer_block");
	}
	
	@Override
	@Deprecated
	public boolean isOpaqueCube(IBlockState state) {
		return true;
	}
	
	@Override
	@Deprecated
	public boolean isFullCube(IBlockState state) {
		return true;
	}


	
	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {
		if (!world.isRemote) {
			TileEntityCatalyzer tile = getTileEntity(world, pos);
			IItemHandler itemHandler = tile.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, side);
			if (player.isSneaking()) {
				if (player.getHeldItem(hand).isEmpty()) {
					player.setHeldItem(hand, itemHandler.extractItem(0, 64, false));
				} else {
					player.setHeldItem(hand, itemHandler.insertItem(0, player.getHeldItem(hand), false));
				}
				
			} else {
			
  				player.openGui(Main.instance, ModGuiHandler.CATALYZER, world, pos.getX(), pos.getY(), pos.getZ());
  			}
			
			tile.markDirty();
  			
  		}
  		return true;
			
	}
	
	
	
	
	@Override
	public Class<TileEntityCatalyzer> getTileEntityClass() {
		return TileEntityCatalyzer.class;
	}
	
	@Nullable
	@Override
	public TileEntityCatalyzer createTileEntity(World world, IBlockState state) {
		return new TileEntityCatalyzer();
	}

	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState state) {
		TileEntityCatalyzer tile = getTileEntity(world, pos);
		IItemHandler itemHandler = tile.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, EnumFacing.NORTH);
		ItemStack stack = itemHandler.getStackInSlot(0);
		if (!stack.isEmpty()) {
			EntityItem item = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), stack);
			world.spawnEntity(item);
		}
		super.breakBlock(world, pos, state);
	}
	
	


	
	public void registerItemModel() {
		// TODO Auto-generated method stub
		
	}

	public Item createItemBlock() {
		// TODO Auto-generated method stub
		return null;
	}

}