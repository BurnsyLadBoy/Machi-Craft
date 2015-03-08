package machicraft.init;

import machicraft.help.RegisterHelper;
import machicraft.items.ItemCopperIngot;
import machicraft.items.ItemCopperNugget;
import machicraft.items.ItemCopperWire;
import machicraft.items.ItemElectroMagnet;
import machicraft.items.ItemIronBar;
import machicraft.items.ItemTungstenIngot;
import machicraft.items.ItemTungstenNugget;
import net.minecraft.item.Item;

public class ModItems {
	public static Item copperIngot = new ItemCopperIngot().setUnlocalizedName("copperIngot");
	public static Item copperWire = new ItemCopperWire().setUnlocalizedName("copperWire");
	public static Item copperNugget = new ItemCopperNugget().setUnlocalizedName("copperNugget");
	public static Item electroMagnet = new ItemElectroMagnet().setUnlocalizedName("electroMagnet");
	public static Item ironBar = new ItemIronBar().setUnlocalizedName("ironBar");
	public static Item tungstenIngot = new ItemTungstenIngot().setUnlocalizedName("tungstenIngot");
	public static Item tungstenNugget = new ItemTungstenNugget().setUnlocalizedName("tungstenNugget");

	public static void init() {
	    RegisterHelper.registerItem(copperIngot);
	    RegisterHelper.registerItem(copperWire);
	    RegisterHelper.registerItem(copperNugget);
	    RegisterHelper.registerItem(electroMagnet);
	    RegisterHelper.registerItem(ironBar);
	    RegisterHelper.registerItem(tungstenIngot);
	    RegisterHelper.registerItem(tungstenNugget);
	}
}

