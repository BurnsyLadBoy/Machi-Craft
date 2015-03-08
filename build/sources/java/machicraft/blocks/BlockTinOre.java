package machicraft.blocks;

import machicraft.help.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import tabs.ModTabs;

public class BlockTinOre extends Block {
	public BlockTinOre() {
        super(Material.iron);
        setCreativeTab(ModTabs.tabMachiCraft);
        setBlockName("tinOre");
        setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setStepSound(soundTypeStone);
        setHardness(3F);
        setResistance(15.0F);
        setHarvestLevel("pickaxe", 2);
    }
}
