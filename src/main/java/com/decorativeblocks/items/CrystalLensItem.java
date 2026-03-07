package com.decorativeblocks.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class CrystalLensItem extends Item {
    public CrystalLensItem(Properties props) { super(props); }

    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack stack = player.getItemInHand(hand);
        if (!world.isClientSide) {
            // Give night vision briefly + show block info
            player.addEffect(new EffectInstance(Effects.NIGHT_VISION, 200, 0));
            player.addEffect(new EffectInstance(Effects.CONDUIT_POWER, 60, 0));
            // Raycast to get looked-at block
            RayTraceResult result = player.pick(8.0, 0, false);
            if (result.getType() == RayTraceResult.Type.BLOCK) {
                BlockPos pos = ((BlockRayTraceResult) result).getBlockPos();
                String blockName = world.getBlockState(pos).getBlock().getName().getString();
                player.displayClientMessage(new StringTextComponent(
                    "§b🔮 Блок: §f" + blockName + " §7[" + pos.getX() + "," + pos.getY() + "," + pos.getZ() + "]"), true);
            }
            stack.hurtAndBreak(1, player, p -> p.broadcastBreakEvent(hand));
        }
        return ActionResult.sidedSuccess(stack, world.isClientSide);
    }
}
