package com.decorativeblocks;

import com.decorativeblocks.init.ModBlocks;
import com.decorativeblocks.init.ModItems;
import com.decorativeblocks.init.ModCreativeTabs;
import com.decorativeblocks.menu.ModMenuTypes;
import com.decorativeblocks.world.ModOreGeneration;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(DecorativeBlocks.MOD_ID)
public class DecorativeBlocks {
    public static final String MOD_ID = "decorativeblocks";

    public DecorativeBlocks() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        // Force creative tab class to load
        ModCreativeTabs.TAB_STONE.getClass();

        ModBlocks.BLOCKS.register(bus);
        ModItems.ITEMS.register(bus);
        ModMenuTypes.CONTAINERS.register(bus);

        bus.addListener(this::setup);
        bus.addListener(this::clientSetup);

        MinecraftForge.EVENT_BUS.register(ModOreGeneration.class);
    }

    private void setup(final FMLCommonSetupEvent event) {}

    private void clientSetup(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            net.minecraft.client.gui.ScreenManager.register(
                ModMenuTypes.GEM_FORGE.get(),
                com.decorativeblocks.client.GemForgeScreen::new);
            net.minecraft.client.gui.ScreenManager.register(
                ModMenuTypes.ALCHEMY_TABLE.get(),
                com.decorativeblocks.client.AlchemyTableScreen::new);
            net.minecraft.client.gui.ScreenManager.register(
                ModMenuTypes.RUNE_ENGRAVER.get(),
                com.decorativeblocks.client.RuneEngraverScreen::new);
        });
    }
}
