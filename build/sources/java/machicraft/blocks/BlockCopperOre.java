package machicraft.blocks;

import tabs.ModTabs;
import machicraft.help.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockCopperOre extends Block {
	public BlockCopperOre() {
        super(Material.iron);
        setCreativeTab(ModTabs.tabMachiCraft);
        setBlockName("copperOre");
        setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setStepSound(soundTypeStone);
        setHardness(3F);
        setResistance(15.0F);
        setHarvestLevel("pickaxe", 2);
    }
}
