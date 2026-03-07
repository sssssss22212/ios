package com.decorativeblocks;

import com.decorativeblocks.init.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModCreativeTab extends ItemGroup {
    public static final ModCreativeTab TAB = new ModCreativeTab();

    private ModCreativeTab() {
        super("decorativeblocks");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ModBlocks.MARBLE_COLUMN.get());
    }
}
