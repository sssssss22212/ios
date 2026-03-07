package com.decorativeblocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FlintAndSteelItem;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import java.util.Random;

public class BrazierBlock extends Block {
    public static final BooleanProperty LIT = BlockStateProperties.LIT;

    public BrazierBlock(Properties props) {
        super(props);
        this.registerDefaultState(this.stateDefinition.any().setValue(LIT, false));
    }

    @Override
    public ActionResultType use(BlockState state, World world, BlockPos pos,
                                PlayerEntity player, Hand hand, BlockRayTraceResult hit) {
        if (!world.isClientSide) {
            boolean isLit = state.getValue(LIT);
            if (!isLit && (player.getItemInHand(hand).getItem() instanceof FlintAndSteelItem
                        || player.getItemInHand(hand).getItem() == net.minecraft.item.Items.FIRE_CHARGE)) {
                world.setBlock(pos, state.setValue(LIT, true), 3);
                world.playSound(null, pos, SoundEvents.FLINTANDSTEEL_USE,
                    SoundCategory.BLOCKS, 1.0f, 1.0f);
                if (player.getItemInHand(hand).getItem() instanceof FlintAndSteelItem)
                    player.getItemInHand(hand).hurtAndBreak(1, player,
                        p -> p.broadcastBreakEvent(hand));
                return ActionResultType.SUCCESS;
            } else if (isLit) {
                world.setBlock(pos, state.setValue(LIT, false), 3);
                world.playSound(null, pos, SoundEvents.FIRE_EXTINGUISH,
                    SoundCategory.BLOCKS, 0.5f, 1.0f);
                return ActionResultType.SUCCESS;
            }
        }
        return ActionResultType.PASS;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState state, World world, BlockPos pos, Random rand) {
        if (state.getValue(LIT)) {
            double x = pos.getX() + 0.5 + (rand.nextDouble()-0.5)*0.4;
            double y = pos.getY() + 0.8;
            double z = pos.getZ() + 0.5 + (rand.nextDouble()-0.5)*0.4;
            world.addParticle(ParticleTypes.FLAME, x, y, z, 0, 0.02, 0);
            world.addParticle(ParticleTypes.SMOKE, x, y+0.1, z, 0, 0.02, 0);
        }
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(LIT);
    }
}
