package fwp_origins_items;

import fwp_origins_items.custom_items.CustomItems;
import net.fabricmc.api.ModInitializer;

public class fwp_origins_custom_items implements ModInitializer {

    public static final String MOD_ID = "fwp_origins";

    @Override
    public void onInitialize() {
        CustomItems.registerItems();
    }
}
