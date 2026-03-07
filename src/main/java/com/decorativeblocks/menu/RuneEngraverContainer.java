package com.decorativeblocks.menu;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;

public class RuneEngraverContainer extends Container {
    private final Inventory internal = new Inventory(5);

    public RuneEngraverContainer(int id, PlayerInventory inv, PacketBuffer buf) { this(id, inv); }

    public RuneEngraverContainer(int id, PlayerInventory inv) {
        super(ModMenuTypes.RUNE_ENGRAVER.get(), id);
        addSlot(new Slot(internal, 0, 26, 35));
        addSlot(new Slot(internal, 1, 62, 17));
        addSlot(new Slot(internal, 2, 80, 17));
        addSlot(new Slot(internal, 3, 98, 17));
        addSlot(new Slot(internal, 4, 134, 35) {
            @Override public boolean mayPlace(ItemStack s) { return false; }
        });
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 9; c++)
                addSlot(new Slot(inv, c+r*9+9, 8+c*18, 112+r*18));
        for (int c = 0; c < 9; c++)
            addSlot(new Slot(inv, c, 8+c*18, 170));
    }

    @Override public boolean stillValid(PlayerEntity p) { return true; }
    @Override public ItemStack quickMoveStack(PlayerEntity p, int i) { return ItemStack.EMPTY; }
}