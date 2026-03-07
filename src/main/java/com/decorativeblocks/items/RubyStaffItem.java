package com.decorativeblocks.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.*;
import net.minecraft.world.World;

public class RubyStaffItem extends Item {
    public RubyStaffItem(Properties props) { super(props); }

    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack stack = player.getItemInHand(hand);
        if (!world.isClientSide) {
            // Give fire resistance + strength burst
            player.addEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 200, 0));
            player.addEffect(new EffectInstance(Effects.DAMAGE_BOOST, 100, 1));
            player.addEffect(new EffectInstance(Effects.ABSORPTION, 200, 1));
            world.playSound(null, player.blockPosition(), SoundEvents.BLAZE_AMBIENT,
                net.minecraft.util.SoundCategory.PLAYERS, 1.0f, 0.8f);
            stack.hurtAndBreak(1, player, p -> p.broadcastBreakEvent(hand));
        }
        return ActionResult.sidedSuccess(stack, world.isClientSide);
    }
}
