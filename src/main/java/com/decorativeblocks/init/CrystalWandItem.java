package com.decorativeblocks.init;

import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class CrystalWandItem extends Item {
    public CrystalWandItem(Properties props) {
        super(props);
    }

    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack stack = player.getItemInHand(hand);
        if (!world.isClientSide) {
            // Give night vision + speed + jump boost for 30 seconds
            player.addEffect(new EffectInstance(Effects.NIGHT_VISION,    600, 0, false, true));
            player.addEffect(new EffectInstance(Effects.MOVEMENT_SPEED,  400, 1, false, true));
            player.addEffect(new EffectInstance(Effects.JUMP,            400, 1, false, true));
            player.addEffect(new EffectInstance(Effects.DAMAGE_RESISTANCE,200, 0, false, true));

            // Spawn particles around player on server
            if (world instanceof ServerWorld) {
                ServerWorld sw = (ServerWorld) world;
                for (int i = 0; i < 20; i++) {
                    double ox = (world.random.nextDouble()-0.5)*2;
                    double oy = world.random.nextDouble()*2;
                    double oz = (world.random.nextDouble()-0.5)*2;
                    sw.sendParticles(ParticleTypes.END_ROD,
                        player.getX()+ox, player.getY()+oy, player.getZ()+oz,
                        1, 0, 0, 0, 0);
                }
            }

            // Damage the wand
            stack.hurtAndBreak(1, player, p -> p.broadcastBreakEvent(hand));
            player.getCooldowns().addCooldown(this, 60);
            world.playSound(null, player.blockPosition(),
                SoundEvents.BEACON_ACTIVATE, SoundCategory.PLAYERS, 0.5f, 1.5f);
        }
        return ActionResult.sidedSuccess(stack, world.isClientSide);
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return true; // enchantment glint effect
    }
}
