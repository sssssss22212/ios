package com.decorativeblocks.menu;

import com.decorativeblocks.init.ModMenuTypes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.CraftingInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.BlockPos;

public class GemForgeContainer extends Container {
    private final Inventory input = new Inventory(10); // 9 slots + 1 fuel
    private final Inventory output = new Inventory(1);

    // Client constructor
    public GemForgeContainer(int windowId, PlayerInventory playerInv, PacketBuffer data) {
        this(windowId, playerInv);
    }

    // Server constructor
    public GemForgeContainer(int windowId, PlayerInventory playerInv) {
        super(ModMenuTypes.GEM_FORGE.get(), windowId);

        // 9 input slots (3x3 grid)
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                int idx = row * 3 + col;
                this.addSlot(new Slot(input, idx, 30 + col * 18, 17 + row * 18));
            }
        }
        // Fuel slot
        this.addSlot(new Slot(input, 9, 30, 77) {
            @Override public boolean mayPlace(ItemStack stack) {
                return stack.getBurnTime() > 0 ||
                    stack.getItem() == net.minecraft.item.Items.BLAZE_ROD ||
                    stack.getItem() == net.minecraft.item.Items.COAL;
            }
        });
        // Output slot
        this.addSlot(new Slot(output, 0, 134, 35) {
            @Override public boolean mayPlace(ItemStack stack) { return false; }
        });

        // Player inventory
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 9; col++)
                this.addSlot(new Slot(playerInv, col + row * 9 + 9, 8 + col * 18, 112 + row * 18));
        // Hotbar
        for (int col = 0; col < 9; col++)
            this.addSlot(new Slot(playerInv, col, 8 + col * 18, 170));
    }

    @Override
    public boolean stillValid(PlayerEntity player) { return true; }

    @Override
    public ItemStack quickMoveStack(PlayerEntity player, int index) {
        return ItemStack.EMPTY;
    }
}
