package com.decorativeblocks.world;

import com.decorativeblocks.DecorativeBlocks;
import com.decorativeblocks.init.ModBlocks;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.DepthAverageConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DecorativeBlocks.MOD_ID)
public class ModOreGeneration {

    private static final OreFeatureConfig.FillerBlockType STONE =
        OreFeatureConfig.FillerBlockType.NATURAL_STONE;

    @SubscribeEvent
    public static void onBiomeLoad(BiomeLoadingEvent event) {
        // RUBY ORE — Y 5-30, редкий
        event.getGeneration().addFeature(
            GenerationStage.Decoration.UNDERGROUND_ORES,
            Feature.ORE.configured(new OreFeatureConfig(STONE,
                ModBlocks.RUBY_ORE.get().defaultBlockState(), 4))
            .decorated(Placement.DEPTH_AVERAGE.configured(new DepthAverageConfig(5, 16)))
            .count(4));

        // SAPPHIRE ORE — Y 5-35
        event.getGeneration().addFeature(
            GenerationStage.Decoration.UNDERGROUND_ORES,
            Feature.ORE.configured(new OreFeatureConfig(STONE,
                ModBlocks.SAPPHIRE_ORE.get().defaultBlockState(), 4))
            .decorated(Placement.DEPTH_AVERAGE.configured(new DepthAverageConfig(5, 20)))
            .count(4));

        // MITHRIL ORE — Y 5-25, очень редкий
        event.getGeneration().addFeature(
            GenerationStage.Decoration.UNDERGROUND_ORES,
            Feature.ORE.configured(new OreFeatureConfig(STONE,
                ModBlocks.MITHRIL_ORE.get().defaultBlockState(), 3))
            .decorated(Placement.DEPTH_AVERAGE.configured(new DepthAverageConfig(5, 12)))
            .count(2));

        // AMETHYST ORE — Y 10-40
        event.getGeneration().addFeature(
            GenerationStage.Decoration.UNDERGROUND_ORES,
            Feature.ORE.configured(new OreFeatureConfig(STONE,
                ModBlocks.AMETHYST_ORE.get().defaultBlockState(), 6))
            .decorated(Placement.DEPTH_AVERAGE.configured(new DepthAverageConfig(10, 24)))
            .count(6));

        // TOPAZ ORE — Y 0-50
        event.getGeneration().addFeature(
            GenerationStage.Decoration.UNDERGROUND_ORES,
            Feature.ORE.configured(new OreFeatureConfig(STONE,
                ModBlocks.TOPAZ_ORE.get().defaultBlockState(), 5))
            .decorated(Placement.DEPTH_AVERAGE.configured(new DepthAverageConfig(8, 30)))
            .count(5));

        // ONYX ORE — Y 0-16, самый редкий
        event.getGeneration().addFeature(
            GenerationStage.Decoration.UNDERGROUND_ORES,
            Feature.ORE.configured(new OreFeatureConfig(STONE,
                ModBlocks.ONYX_ORE.get().defaultBlockState(), 3))
            .decorated(Placement.DEPTH_AVERAGE.configured(new DepthAverageConfig(5, 8)))
            .count(1));
    }
}
