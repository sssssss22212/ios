package com.decorativeblocks;

import com.decorativeblocks.init.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {
    BRONZE  (2, 500,  6.5f, 2.5f, 14, () -> Ingredient.of(ModItems.BRONZE_INGOT.get())),
    TITANIUM(4, 2000, 9.0f, 4.0f, 22, () -> Ingredient.of(ModItems.TITANIUM_SHARD.get())),
    MITHRIL (4, 1800, 8.5f, 3.5f, 20, () -> Ingredient.of(ModItems.MITHRIL_INGOT.get())),
    RUBY    (3, 900,  7.5f, 3.0f, 18, () -> Ingredient.of(ModItems.RUBY.get())),
    ONYX    (5, 2500,10.0f, 4.5f, 24, () -> Ingredient.of(ModItems.ONYX_SHARD.get()));

    private final int level, uses, enchVal;
    private final float speed, damage;
    private final Supplier<Ingredient> repair;

    ModItemTier(int level, int uses, float speed, float damage, int enchVal, Supplier<Ingredient> repair) {
        this.level = level; this.uses = uses; this.speed = speed;
        this.damage = damage; this.enchVal = enchVal; this.repair = repair;
    }

    @Override public int getUses()                    { return uses; }
    @Override public float getSpeed()                 { return speed; }
    @Override public float getAttackDamageBonus()     { return damage; }
    @Override public int getLevel()                   { return level; }
    @Override public int getEnchantmentValue()        { return enchVal; }
    @Override public Ingredient getRepairIngredient() { return repair.get(); }
}
