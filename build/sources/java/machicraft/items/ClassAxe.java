package machicraft.items;

import machicraft.help.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ClassAxe extends ItemAxe {
	public final ToolMaterial toolMaterial;

	public ClassAxe(ToolMaterial EnumToolMaterial) {
		super(EnumToolMaterial);
		toolMaterial = EnumToolMaterial;
		setCreativeTab(tabs.ModTabs.tabMachiCraft);
	}

	@SideOnly(Side.CLIENT)
		public void registerIcons(IIconRegister par1IconRegister) {
		this.itemIcon = par1IconRegister.registerIcon(Reference.MODID + ":" + getUnlocalizedName().substring(5));
	}
}
