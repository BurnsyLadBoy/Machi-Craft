package machicraft.init;

import machicraft.help.RegisterHelper;
import machicraft.items.*;
import net.minecraft.item.Item;

public class ModItems {
	public static Item copperIngot = new ItemCopperIngot().setUnlocalizedName("copperIngot");
	public static Item copperWire = new ItemCopperWire().setUnlocalizedName("copperWire");
	public static Item copperNugget = new ItemCopperNugget().setUnlocalizedName("copperNugget");
	public static Item electroMagnet = new ItemElectroMagnet().setUnlocalizedName("electroMagnet");
	public static Item ironBar = new ItemIronBar().setUnlocalizedName("ironBar");
	public static Item tungstenIngot = new ItemTungstenIngot().setUnlocalizedName("tungstenIngot");
	public static Item tungstenNugget = new ItemTungstenNugget().setUnlocalizedName("tungstenNugget");
	public static Item tinIngot = new ItemTinIngot().setUnlocalizedName("tinIngot");
	public static Item tinNugget = new ItemTinNugget().setUnlocalizedName("tinNugget");
	public static Item tungstenWire = new ItemTungstenWire().setUnlocalizedName("tungstenWire");

	public static void init() {
	    RegisterHelper.registerItem(copperIngot);
	    RegisterHelper.registerItem(copperWire);
	    RegisterHelper.registerItem(copperNugget);
	    RegisterHelper.registerItem(electroMagnet);
	    RegisterHelper.registerItem(ironBar);
	    RegisterHelper.registerItem(tungstenIngot);
	    RegisterHelper.registerItem(tungstenNugget);
	    RegisterHelper.registerItem(tinIngot);
	    RegisterHelper.registerItem(tinNugget);
	    RegisterHelper.registerItem(tungstenWire);
	}
}

