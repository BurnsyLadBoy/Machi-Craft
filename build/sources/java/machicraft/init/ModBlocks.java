package machicraft.init;

import machicraft.blocks.*;
import machicraft.help.RegisterHelper;
import net.minecraft.block.Block;

public class ModBlocks {
	public static Block copperOre = new BlockCopperOre(); 
	public static Block copperBlock = new BlockCopperBlock(); 
	public static Block tungstenOre = new BlockTungstenOre(); 
	public static Block tinOre = new BlockTinOre(); 
	public static Block tinBlock = new BlockTinBlock(); 
	
	 public static void init() {
           RegisterHelper.registerBlock(copperOre);
           RegisterHelper.registerBlock(tungstenOre);
           RegisterHelper.registerBlock(copperBlock);
           RegisterHelper.registerBlock(tinOre);
           RegisterHelper.registerBlock(tinBlock);
     }
}
