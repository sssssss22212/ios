package com.decorativeblocks.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.*;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class VoidWandItem extends Item {
    public VoidWandItem(Properties props) { super(props); }

    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack stack = player.getItemInHand(hand);
        if (!world.isClientSide) {
            // Teleport player upwards 10 blocks if safe
            double nx = player.getX();
            double ny = Math.min(player.getY() + 10, 255);
            double nz = player.getZ();
            player.teleportTo(nx, ny, nz);
            player.addEffect(new EffectInstance(Effects.SLOW_FALLING, 100, 0));
            ((ServerWorld) world).sendParticles(ParticleTypes.PORTAL,
                player.getX(), player.getY(), player.getZ(), 30, 0.5, 0.5, 0.5, 0.1);
            world.playSound(null, player.blockPosition(), SoundEvents.ENDERMAN_TELEPORT,
                net.minecraft.util.SoundCategory.PLAYERS, 1.0f, 1.0f);
            stack.hurtAndBreak(1, player, p -> p.broadcastBreakEvent(hand));
        }
        return ActionResult.sidedSuccess(stack, world.isClientSide);
    }
}
