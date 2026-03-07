package com.decorativeblocks.menu;

import com.decorativeblocks.init.ModMenuTypes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;

public class AlchemyTableContainer extends Container {
    private final Inventory internal = new Inventory(6); // 4 ingredients + 1 catalyst + 1 output

    public AlchemyTableContainer(int windowId, PlayerInventory playerInv, PacketBuffer data) {
        this(windowId, playerInv);
    }

    public AlchemyTableContainer(int windowId, PlayerInventory playerInv) {
        super(ModMenuTypes.ALCHEMY_TABLE.get(), windowId);

        // 4 ingredient slots (cross pattern)
        this.addSlot(new Slot(internal, 0, 62, 17));  // top
        this.addSlot(new Slot(internal, 1, 44, 35));  // left
        this.addSlot(new Slot(internal, 2, 80, 35));  // right
        this.addSlot(new Slot(internal, 3, 62, 53));  // bottom
        // Catalyst slot (center)
        this.addSlot(new Slot(internal, 4, 62, 35));
        // Output
        this.addSlot(new Slot(internal, 5, 134, 35) {
            @Override public boolean mayPlace(ItemStack stack) { return false; }
        });

        // Player inventory
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 9; col++)
                this.addSlot(new Slot(playerInv, col + row * 9 + 9, 8 + col * 18, 112 + row * 18));
        for (int col = 0; col < 9; col++)
            this.addSlot(new Slot(playerInv, col, 8 + col * 18, 170));
    }

    @Override public boolean stillValid(PlayerEntity player) { return true; }
    @Override public ItemStack quickMoveStack(PlayerEntity player, int index) { return ItemStack.EMPTY; }
}
