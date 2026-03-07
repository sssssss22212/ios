package com.decorativeblocks.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class SoulCompassItem extends Item {
    public SoulCompassItem(Properties props) { super(props); }

    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack stack = player.getItemInHand(hand);
        if (!world.isClientSide) {
            BlockPos spawn = ((ServerWorld) world).getSharedSpawnPos();
            double dist = Math.sqrt(player.blockPosition().distSqr(spawn));
            player.displayClientMessage(new StringTextComponent(
                "§6☆ Портал домой: §e" + (int) dist + " блоков §7(" +
                spawn.getX() + ", " + spawn.getZ() + ")"), false);
            world.playSound(null, player.blockPosition(), SoundEvents.EXPERIENCE_ORB_PICKUP,
                net.minecraft.util.SoundCategory.PLAYERS, 1.0f, 1.0f);
        }
        return ActionResult.sidedSuccess(stack, world.isClientSide);
    }
}
