 package coloredDiamonds.init;

import java.util.ArrayList;
import java.util.List;

import coloredDiamonds.items.ItemBase;
import coloredDiamonds.items.tools.ToolAxe;
import coloredDiamonds.items.tools.ToolHoe;
import coloredDiamonds.items.tools.ToolPickaxe;
import coloredDiamonds.items.tools.ToolSpade;
import coloredDiamonds.items.tools.ToolSword;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	
public static final List<Item> ITEMS = new ArrayList<Item>();
//Materials

public static final ToolMaterial MATERIAL_ROSE = EnumHelper.addToolMaterial("material_rose", 3, 300, 16.0F, 6.0F, 10);

//Items 
public static final Item rose = new ItemBase("rose"); 

//Tools

public static final ItemSword ROSE_SWORD = new ToolSword("rose_sword", MATERIAL_ROSE);
public static final ItemSpade ROSE_SHOVEL = new ToolSpade("rose_spade", MATERIAL_ROSE);
public static final ItemPickaxe ROSE_PICKAXE = new ToolPickaxe("rose_pickaxe", MATERIAL_ROSE);
public static final ItemAxe ROSE_AXE = new ToolAxe("rose_axe", MATERIAL_ROSE);
public static final ItemHoe ROSE_HOE = new ToolHoe("rose_hoe", MATERIAL_ROSE);


}
