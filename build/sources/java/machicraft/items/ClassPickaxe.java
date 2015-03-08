package machicraft.items;

import machicraft.help.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;
import tabs.ModTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ClassPickaxe extends ItemPickaxe {
	public final ToolMaterial toolMaterial;

	public ClassPickaxe(ToolMaterial EnumToolMaterial) {
		super(EnumToolMaterial);
		toolMaterial = EnumToolMaterial;
		setCreativeTab(tabs.ModTabs.tabMachiCraft);
	}

	@SideOnly(Side.CLIENT)
		public void registerIcons(IIconRegister par1IconRegister) {
		this.itemIcon = par1IconRegister.registerIcon(Reference.MODID + ":" + getUnlocalizedName().substring(5));
	}
}
