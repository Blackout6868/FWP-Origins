package net.fabricmc.example.registry;

import net.fabricmc.example.FWPOrigins;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;



public class Moditems {
    //public  static final Item BOXING_GLOVES = new Item(new Item.Settings().group(ItemGroup.COMBAT).maxCount(1));
    public static ToolItem BOXING_GLOVES = new SwordItem(Boxingtool.INSTANCE, 0,2, new Item.Settings().group(ItemGroup.COMBAT));

    public  static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(FWPOrigins.MOD_ID, "boxing_gloves"), BOXING_GLOVES);
    }
}
