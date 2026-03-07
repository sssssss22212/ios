package com.decorativeblocks.world;

import com.decorativeblocks.DecorativeBlocks;
import com.decorativeblocks.init.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.BlockMatchRuleTest;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.DepthAverageConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DecorativeBlocks.MOD_ID)
public class ModOreGeneration {

    private static final RuleTest STONE = new BlockMatchRuleTest(Blocks.STONE);

    private static void addOre(BiomeLoadingEvent e, BlockState state, int size, int center, int spread, int count) {
        e.getGeneration().addFeature(
            GenerationStage.Decoration.UNDERGROUND_ORES,
            Feature.ORE.configured(new OreFeatureConfig(STONE, state, size))
                .decorated(Placement.DEPTH_AVERAGE.configured(new DepthAverageConfig(center, spread)))
                .count(count)
        );
    }

    @SubscribeEvent
    public static void onBiomeLoad(BiomeLoadingEvent e) {
        addOre(e, ModBlocks.RUBY_ORE.get().defaultBlockState(),     4, 5,  16, 4);
        addOre(e, ModBlocks.SAPPHIRE_ORE.get().defaultBlockState(), 4, 5,  20, 4);
        addOre(e, ModBlocks.MITHRIL_ORE.get().defaultBlockState(),  3, 5,  12, 2);
        addOre(e, ModBlocks.AMETHYST_ORE.get().defaultBlockState(), 6, 10, 24, 6);
        addOre(e, ModBlocks.TOPAZ_ORE.get().defaultBlockState(),    5, 8,  30, 5);
        addOre(e, ModBlocks.ONYX_ORE.get().defaultBlockState(),     3, 5,  8,  1);
        addOre(e, ModBlocks.JADE_ORE.get().defaultBlockState(),     5, 8,  24, 4);
        addOre(e, ModBlocks.OPAL_ORE.get().defaultBlockState(),     4, 6,  20, 3);
    }
}