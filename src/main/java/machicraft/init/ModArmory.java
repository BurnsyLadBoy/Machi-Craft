package machicraft.init;

import machicraft.help.RegisterHelper;
import machicraft.items.ClassAxe;
import machicraft.items.ClassPickaxe;
import machicraft.items.ClassSword;
import machicraft.items.armour.ItemCopperArmor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModArmory {
	static Item.ToolMaterial COPPER = EnumHelper.addToolMaterial("COPPER", 2, 215, 6.0F, 0.0F, 14);
    public static Item copperPick = new ClassPickaxe(COPPER).setUnlocalizedName("copperPick");
    public static Item copperAxe = new ClassAxe(COPPER).setUnlocalizedName("copperAxe");
    public static Item copperSword = new ClassSword(COPPER).setUnlocalizedName("copperSword");
    
    static ArmorMaterial ACOPPER = EnumHelper.addArmorMaterial("ACOPPER", 13, new int[]{3, 7, 5, 2}, 14);
    public static Item copperHelm = new ItemCopperArmor(ACOPPER, 0, "copperHelm");
    public static Item copperPlate = new ItemCopperArmor(ACOPPER, 1, "copperPlate");
    public static Item copperPants = new ItemCopperArmor(ACOPPER, 2, "copperPants");
    public static Item copperBoots = new ItemCopperArmor(ACOPPER, 3, "copperBoots");
    
    public static void init() {
        RegisterHelper.registerItem(copperPick);
        RegisterHelper.registerItem(copperAxe);
        RegisterHelper.registerItem(copperSword);
        
        RegisterHelper.registerItem(copperHelm);
        RegisterHelper.registerItem(copperPlate);
        RegisterHelper.registerItem(copperPants);
        RegisterHelper.registerItem(copperBoots);
    }
}