package com.decorativeblocks.init;

import com.decorativeblocks.init.ModBlocks;
import com.decorativeblocks.init.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModCreativeTabs {

    // Tab 1: Stone & Bricks
    public static final ItemGroup TAB_STONE = new ItemGroup("decorativeblocks_stone") {
        @Override public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.MARBLE_TILES.get());
        }
    };

    // Tab 2: Metals & Ores
    public static final ItemGroup TAB_METALS = new ItemGroup("decorativeblocks_metals") {
        @Override public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.MITHRIL_BLOCK.get());
        }
    };

    // Tab 3: Glass & Neon
    public static final ItemGroup TAB_GLASS = new ItemGroup("decorativeblocks_glass") {
        @Override public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.PRISMATIC_GLASS.get());
        }
    };

    // Tab 4: Magic & Special
    public static final ItemGroup TAB_MAGIC = new ItemGroup("decorativeblocks_magic") {
        @Override public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.ANCIENT_ALTAR.get());
        }
    };

    // Tab 5: Tools, Weapons & Items
    public static final ItemGroup TAB_ITEMS = new ItemGroup("decorativeblocks_items") {
        @Override public ItemStack makeIcon() {
            return new ItemStack(ModItems.MITHRIL_SWORD.get());
        }
    };
}
