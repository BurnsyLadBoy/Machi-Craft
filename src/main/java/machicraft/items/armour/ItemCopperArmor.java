package machicraft.items.armour;

import tabs.ModTabs;
import machicraft.help.Reference;
import machicraft.init.ModArmory;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemCopperArmor extends ItemArmor {
	public ItemCopperArmor(ArmorMaterial material, int ArmorType, String name) {
        super(material, 0, ArmorType);
        setUnlocalizedName(name);
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(ModTabs.tabMachiCraft);
    }
    
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if (stack.getItem() == ModArmory.copperHelm || stack.getItem() == ModArmory.copperPlate || stack.getItem() == ModArmory.copperBoots)
        {
            return Reference.MODID + ":models/armor/copper_layer1.png";
        }
        else if (stack.getItem() == ModArmory.copperPants)
        {
            return Reference.MODID + ":models/armor/copper_layer2.png";
        }
        else
        {
            return null;
        }    
    }
}
