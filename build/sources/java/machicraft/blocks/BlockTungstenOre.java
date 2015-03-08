package machicraft.blocks;

import machicraft.help.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import tabs.ModTabs;

public class BlockTungstenOre extends Block {
	public BlockTungstenOre() {
        super(Material.iron);
        setCreativeTab(ModTabs.tabMachiCraft);
        setBlockName("tungstenOre");
        setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setStepSound(soundTypeStone);
        setHardness(50F);
        setResistance(100.0F);
        setHarvestLevel("pickaxe", 3);
    }
}
