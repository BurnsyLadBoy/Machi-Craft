package machicraft.init;

import machicraft.help.RegisterHelper;
import machicraft.items.ClassAxe;
import machicraft.items.ClassPickaxe;
import machicraft.items.ClassSword;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class ModArmory {
	static Item.ToolMaterial COPPER = EnumHelper.addToolMaterial("COPPER", 2, 215, 6.0F, 0.0F, 14);
    public static Item copperPick = new ClassPickaxe(COPPER).setUnlocalizedName("copperPick");
    public static Item copperAxe = new ClassAxe(COPPER).setUnlocalizedName("copperAxe");
    public static Item copperSword = new ClassSword(COPPER).setUnlocalizedName("copperSword");
    
    public static void init() {
        RegisterHelper.registerItem(copperPick);
        RegisterHelper.registerItem(copperAxe);
        RegisterHelper.registerItem(copperSword);
    }
}