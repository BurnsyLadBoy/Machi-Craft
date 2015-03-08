package machicraft.items;

import machicraft.help.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemTungstenIngot extends Item {
	public ItemTungstenIngot() {
        super();
        setCreativeTab(tabs.ModTabs.tabMachiCraft);
    }
	

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister par1IconRegister) {
	    itemIcon = par1IconRegister.registerIcon(Reference.MODID + ":" + getUnlocalizedName().substring(5));
	}
}
