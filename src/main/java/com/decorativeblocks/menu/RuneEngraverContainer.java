package com.decorativeblocks.menu;

import com.decorativeblocks.init.ModMenuTypes;
import com.decorativeblocks.init.ModItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;

public class RuneEngraverContainer extends Container {
    private final Inventory internal = new Inventory(5); // 1 item + 3 runes + 1 output

    public RuneEngraverContainer(int windowId, PlayerInventory playerInv, PacketBuffer data) {
        this(windowId, playerInv);
    }

    public RuneEngraverContainer(int windowId, PlayerInventory playerInv) {
        super(ModMenuTypes.RUNE_ENGRAVER.get(), windowId);

        // Item to engrave
        this.addSlot(new Slot(internal, 0, 26, 35));
        // 3 rune slots
        this.addSlot(new Slot(internal, 1, 62, 17) {
            @Override public boolean mayPlace(ItemStack stack) {
                return stack.getItem() == ModItems.ANCIENT_FRAGMENT.get()
                    || stack.getItem() == ModItems.RUBY.get()
                    || stack.getItem() == ModItems.SAPPHIRE.get()
                    || stack.getItem() == ModItems.AMETHYST_GEM.get();
            }
        });
        this.addSlot(new Slot(internal, 2, 80, 17) {
            @Override public boolean mayPlace(ItemStack stack) {
                return stack.getItem() == ModItems.ANCIENT_FRAGMENT.get()
                    || stack.getItem() == ModItems.RUBY.get()
                    || stack.getItem() == ModItems.SAPPHIRE.get()
                    || stack.getItem() == ModItems.AMETHYST_GEM.get();
            }
        });
        this.addSlot(new Slot(internal, 3, 98, 17) {
            @Override public boolean mayPlace(ItemStack stack) {
                return stack.getItem() == ModItems.ANCIENT_FRAGMENT.get()
                    || stack.getItem() == ModItems.RUBY.get()
                    || stack.getItem() == ModItems.SAPPHIRE.get()
                    || stack.getItem() == ModItems.AMETHYST_GEM.get();
            }
        });
        // Output
        this.addSlot(new Slot(internal, 4, 134, 35) {
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
