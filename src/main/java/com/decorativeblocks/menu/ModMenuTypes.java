package com.decorativeblocks.menu;

import com.decorativeblocks.DecorativeBlocks;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModMenuTypes {
    public static final DeferredRegister<ContainerType<?>> CONTAINERS =
        DeferredRegister.create(ForgeRegistries.CONTAINERS, DecorativeBlocks.MOD_ID);

    public static final RegistryObject<ContainerType<GemForgeContainer>> GEM_FORGE =
        CONTAINERS.register("gem_forge", () ->
            IForgeContainerType.create(GemForgeContainer::new));

    public static final RegistryObject<ContainerType<AlchemyTableContainer>> ALCHEMY_TABLE =
        CONTAINERS.register("alchemy_table", () ->
            IForgeContainerType.create(AlchemyTableContainer::new));

    public static final RegistryObject<ContainerType<RuneEngraverContainer>> RUNE_ENGRAVER =
        CONTAINERS.register("rune_engraver", () ->
            IForgeContainerType.create(RuneEngraverContainer::new));
}