package fwp_origins_items.custom_items;

import fwp_origins_items.fwp_origins_custom_items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CustomItems {

    public static final Item Umbra_Beastkin_Icon = new Item(new Item.Settings().group(ItemGroup.MISC));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(fwp_origins_custom_items.MOD_ID,  "umbra_beastkin_icon"), Umbra_Beastkin_Icon);
    }
}
