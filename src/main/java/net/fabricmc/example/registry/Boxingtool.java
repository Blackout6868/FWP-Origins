package net.fabricmc.example.registry;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class Boxingtool implements ToolMaterial {

    public static final Boxingtool INSTANCE = new Boxingtool();

    @Override
    public int getDurability() {
        return 61;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {
        return 9;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
