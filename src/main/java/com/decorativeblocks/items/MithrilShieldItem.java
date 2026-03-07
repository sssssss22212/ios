package com.decorativeblocks.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.UseAction;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class MithrilShieldItem extends Item {
    public MithrilShieldItem(Properties props) { super(props); }

    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        player.startUsingItem(hand);
        return ActionResult.consume(player.getItemInHand(hand));
    }

    @Override
    public UseAction getUseAnimation(ItemStack stack) { return UseAction.BLOCK; }

    @Override
    public int getUseDuration(ItemStack stack) { return 72000; }

    @Override
    public void onUseTick(World world, LivingEntity entity, ItemStack stack, int count) {
        if (!world.isClientSide && entity instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) entity;
            if (count % 20 == 0) {
                // DAMAGE_RESISTANCE — правильное имя для 1.16.5
                player.addEffect(new EffectInstance(Effects.DAMAGE_RESISTANCE, 25, 1, true, false));
            }
        }
    }
}
