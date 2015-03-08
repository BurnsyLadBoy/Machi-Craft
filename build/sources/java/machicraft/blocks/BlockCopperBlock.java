package machicraft.blocks;

import machicraft.help.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import tabs.ModTabs;

public class BlockCopperBlock extends Block {
	public BlockCopperBlock() {
        super(Material.iron);
        setCreativeTab(ModTabs.tabMachiCraft);
        setBlockName("copperBlock");
        setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setStepSound(soundTypeMetal);
        setHardness(3F);
        setResistance(135.0F);
        setHarvestLevel("pickaxe", 2);
    }
}
