package crafting;

import machicraft.init.ModArmory;
import machicraft.init.ModBlocks;
import machicraft.init.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void init() {
		GameRegistry.addSmelting(ModBlocks.copperOre, new ItemStack(ModItems.copperIngot), 0.8F);
		GameRegistry.addSmelting(ModBlocks.tungstenOre, new ItemStack(ModItems.tungstenIngot), 0.8F);
		
		GameRegistry.addShapedRecipe(new ItemStack(ModArmory.copperPick), new Object[] {"AAA", " B ", " B ", 'A', ModItems.copperIngot, 'B', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(ModArmory.copperSword), new Object[] {" A ", " A ", " B ", 'A', ModItems.copperIngot, 'B', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(ModArmory.copperAxe), new Object[] {"AA ", "AB ", " B ", 'A', ModItems.copperIngot, 'B', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperIngot), new Object[] {"AAA", "AAA", "AAA", 'A', ModItems.copperNugget});
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.copperBlock), new Object[] {"AAA", "AAA", "AAA", 'A', ModItems.copperIngot});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.tungstenIngot), new Object[] {"AAA", "AAA", "AAA", 'A', ModItems.tungstenNugget});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperWire, 9), new Object[] {"AAA", "   ", "   ", 'A', ModItems.copperNugget});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperWire, 9), new Object[] {"   ", "   ", "AAA", 'A', ModItems.copperNugget});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperWire, 9), new Object[] {"   ", "AAA", "   ", 'A', ModItems.copperNugget});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ironBar, 2), new Object[] {"  A", "  A", "  A", 'A', Items.iron_ingot});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ironBar, 2), new Object[] {" A ", " A ", " A ", 'A', Items.iron_ingot});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ironBar, 2), new Object[] {"A  ", "A  ", "A  ", 'A', Items.iron_ingot});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.electroMagnet), new Object[] {"ABA", "ABA", "ABA", 'A', ModItems.copperWire, 'B', ModItems.ironBar});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.tinIngot), new Object[] {"AAA", "AAA", "AAA", 'A', ModItems.tinNugget});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.copperNugget, 9), new Object[] {new ItemStack(ModItems.copperIngot)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.copperIngot, 9), new Object[] {new ItemStack(ModBlocks.copperBlock)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tungstenNugget, 9), new Object[] {new ItemStack(ModItems.tungstenIngot)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tinNugget, 9), new Object[] {new ItemStack(ModItems.tinIngot)});
	}
}
