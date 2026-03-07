package com.decorativeblocks;

import com.decorativeblocks.init.ModBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = DecorativeBlocks.MOD_ID,
                        bus = Mod.EventBusSubscriber.Bus.MOD,
                        value = Dist.CLIENT)
public class ClientSetup {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            // V1 glass
            RenderTypeLookup.setRenderLayer(ModBlocks.BLUE_CRYSTAL_GLASS.get(),   RenderType.translucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.RED_CRYSTAL_GLASS.get(),    RenderType.translucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.PURPLE_CRYSTAL_GLASS.get(), RenderType.translucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.GOLDEN_CRYSTAL_GLASS.get(), RenderType.translucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.INDUSTRIAL_GRATE.get(),     RenderType.cutoutMipped());
            // V2 transparent
            RenderTypeLookup.setRenderLayer(ModBlocks.REINFORCED_GLASS.get(),  RenderType.translucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.FROSTED_GLASS.get(),     RenderType.translucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.CRYSTAL_PILLAR.get(),    RenderType.translucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.NEON_BLUE.get(),         RenderType.translucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.NEON_RED.get(),          RenderType.translucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.NEON_GREEN.get(),        RenderType.translucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.NEON_YELLOW.get(),       RenderType.translucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.MAGIC_LANTERN.get(),     RenderType.translucent());
            // V2 cutout
            RenderTypeLookup.setRenderLayer(ModBlocks.STEEL_BARS.get(),  RenderType.cutoutMipped());
            RenderTypeLookup.setRenderLayer(ModBlocks.IRON_GATE.get(),   RenderType.cutoutMipped());
            // V3 glass/neon
            RenderTypeLookup.setRenderLayer(ModBlocks.NEON_PURPLE.get(),       RenderType.translucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.NEON_CYAN.get(),         RenderType.translucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.NEON_WHITE.get(),        RenderType.translucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.NEON_ORANGE.get(),       RenderType.translucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.MITHRIL_GLASS.get(),     RenderType.translucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.RUBY_GLASS.get(),        RenderType.translucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.SAPPHIRE_GLASS.get(),    RenderType.translucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.STAR_GLASS.get(),        RenderType.translucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.VOID_GLASS.get(),        RenderType.translucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.PRISMATIC_GLASS.get(),   RenderType.translucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.CRYSTAL_TORCH_BLOCK.get(), RenderType.cutoutMipped());
            // V3 cutout bars
            RenderTypeLookup.setRenderLayer(ModBlocks.MITHRIL_BARS.get(), RenderType.cutoutMipped());
            RenderTypeLookup.setRenderLayer(ModBlocks.GOLDEN_BARS.get(),  RenderType.cutoutMipped());
            RenderTypeLookup.setRenderLayer(ModBlocks.COPPER_BARS.get(),  RenderType.cutoutMipped());
        });
    }
}
