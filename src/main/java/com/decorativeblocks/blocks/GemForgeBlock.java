package com.decorativeblocks.blocks;

import com.decorativeblocks.menu.GemForgeContainer;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.container.SimpleNamedContainerProvider;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class GemForgeBlock extends Block {
    public GemForgeBlock() {
        super(Properties.of(Material.STONE).strength(3.5f, 8.0f)
            .sound(net.minecraft.block.SoundType.STONE)
            .lightLevel(s -> 8));
    }

    @Override
    public ActionResultType use(BlockState state, World world, BlockPos pos,
                                 PlayerEntity player, Hand hand, BlockRayTraceResult hit) {
        if (!world.isClientSide && player instanceof ServerPlayerEntity) {
            NetworkHooks.openGui((ServerPlayerEntity) player,
                new SimpleNamedContainerProvider(
                    (id, inv, p) -> new GemForgeContainer(id, inv),
                    new TranslationTextComponent("container.decorativeblocks.gem_forge")),
                pos);
        }
        return ActionResultType.sidedSuccess(world.isClientSide);
    }
}
