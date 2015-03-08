package tabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import machicraft.init.ModBlocks;
import machicraft.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MachiCraftTab extends CreativeTabs {
String name;
    
    public MachiCraftTab(int par1, String par2Str) {
        super(par1, par2Str);
        this.name = par2Str;
    }
    
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem()
    {
        if (this.name == "tabMachiCraft") {
            return ModItems.electroMagnet;
        }
	return null;
}

}
