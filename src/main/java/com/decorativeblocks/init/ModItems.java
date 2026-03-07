package com.decorativeblocks.init;

import com.decorativeblocks.DecorativeBlocks;
import com.decorativeblocks.ModItemTier;
import com.decorativeblocks.init.CrystalWandItem;
import com.decorativeblocks.init.ModCreativeTabs;
import com.decorativeblocks.items.*;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, DecorativeBlocks.MOD_ID);

    // ════════════════════════════════════════════════════════
    // TAB 1: STONE & BRICKS — block items
    // ════════════════════════════════════════════════════════
    public static final RegistryObject<Item> MARBLE_COLUMN          = bs("marble_column",          ModBlocks.MARBLE_COLUMN,          ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> MARBLE_TILES           = bs("marble_tiles",           ModBlocks.MARBLE_TILES,           ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> ORNATE_TILES           = bs("ornate_tiles",           ModBlocks.ORNATE_TILES,           ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> SANDSTONE_TILES        = bs("sandstone_tiles",        ModBlocks.SANDSTONE_TILES,        ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> DARK_BRICKS            = bs("dark_bricks",            ModBlocks.DARK_BRICKS,            ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> CARVED_STONE           = bs("carved_stone",           ModBlocks.CARVED_STONE,           ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> GRANITE_TILES          = bs("granite_tiles",          ModBlocks.GRANITE_TILES,          ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> OBSIDIAN_TILES         = bs("obsidian_tiles",         ModBlocks.OBSIDIAN_TILES,         ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> MOSSY_DARK_BRICKS      = bs("mossy_dark_bricks",      ModBlocks.MOSSY_DARK_BRICKS,      ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> CRACKED_CARVED_STONE   = bs("cracked_carved_stone",   ModBlocks.CRACKED_CARVED_STONE,   ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> GILDED_STONE           = bs("gilded_stone",           ModBlocks.GILDED_STONE,           ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> VOID_STONE             = bs("void_stone",             ModBlocks.VOID_STONE,             ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> BONE_TILES             = bs("bone_tiles",             ModBlocks.BONE_TILES,             ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> ENDER_TILES            = bs("ender_tiles",            ModBlocks.ENDER_TILES,            ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> SHADOW_STONE           = bs("shadow_stone",           ModBlocks.SHADOW_STONE,           ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> MOSSY_COBBLESTONE_BRICKS = bs("mossy_cobblestone_bricks", ModBlocks.MOSSY_COBBLESTONE_BRICKS, ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> STAINED_MARBLE_RED     = bs("stained_marble_red",     ModBlocks.STAINED_MARBLE_RED,     ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> STAINED_MARBLE_BLUE    = bs("stained_marble_blue",    ModBlocks.STAINED_MARBLE_BLUE,    ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> POLISHED_GRANITE_BRICKS = bs("polished_granite_bricks", ModBlocks.POLISHED_GRANITE_BRICKS, ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> CHISELED_SANDSTONE     = bs("chiseled_sandstone_bricks", ModBlocks.CHISELED_SANDSTONE, ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> COBALT_BRICKS          = bs("cobalt_bricks",          ModBlocks.COBALT_BRICKS,          ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> ANCIENT_COBBLESTONE    = bs("ancient_cobblestone",    ModBlocks.ANCIENT_COBBLESTONE,    ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> MOSSY_GRANITE          = bs("mossy_granite",          ModBlocks.MOSSY_GRANITE,          ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> CRACKED_OBSIDIAN       = bs("cracked_obsidian",       ModBlocks.CRACKED_OBSIDIAN,       ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> SOUL_BRICKS            = bs("soul_bricks",            ModBlocks.SOUL_BRICKS,            ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> CRYSTAL_BRICKS         = bs("crystal_bricks",         ModBlocks.CRYSTAL_BRICKS,         ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> LAVA_BRICKS            = bs("lava_bricks",            ModBlocks.LAVA_BRICKS,            ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> ICE_BRICKS             = bs("ice_bricks",             ModBlocks.ICE_BRICKS,             ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> MOSSY_SANDSTONE        = bs("mossy_sandstone",        ModBlocks.MOSSY_SANDSTONE,        ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> CARVED_OBSIDIAN        = bs("carved_obsidian",        ModBlocks.CARVED_OBSIDIAN,        ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> RUBY_TILES             = bs("ruby_tiles",             ModBlocks.RUBY_TILES,             ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> MITHRIL_TILES          = bs("mithril_tiles",          ModBlocks.MITHRIL_TILES,          ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> ANCIENT_PILLAR         = bs("ancient_pillar",         ModBlocks.ANCIENT_PILLAR,         ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> PEDESTAL               = bs("pedestal",               ModBlocks.PEDESTAL,               ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> RUNE_STONE             = bs("rune_stone",             ModBlocks.RUNE_STONE,             ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> RUNE_STONE_LIT         = bs("rune_stone_lit",         ModBlocks.RUNE_STONE_LIT,         ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> ENCHANTED_STONE        = bs("enchanted_stone",        ModBlocks.ENCHANTED_STONE,        ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> PETRIFIED_WOOD         = bs("petrified_wood",         ModBlocks.PETRIFIED_WOOD,         ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> VOLCANIC_ROCK          = bs("volcanic_rock",          ModBlocks.VOLCANIC_ROCK,          ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> VOLCANIC_BRICKS        = bs("volcanic_bricks",        ModBlocks.VOLCANIC_BRICKS,        ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> MOSSY_VOLCANIC         = bs("mossy_volcanic",         ModBlocks.MOSSY_VOLCANIC,         ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> HARDENED_CLAY_BRICKS   = bs("hardened_clay_bricks",   ModBlocks.HARDENED_CLAY_BRICKS,   ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> MOSSY_CLAY_BRICKS      = bs("mossy_clay_bricks",      ModBlocks.MOSSY_CLAY_BRICKS,      ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> CRYSTALLINE_DIRT       = bs("crystalline_dirt",       ModBlocks.CRYSTALLINE_DIRT,       ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> ANCIENT_SAND           = bs("ancient_sand",           ModBlocks.ANCIENT_SAND,           ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> POLISHED_DIORITE_BRICKS = bs("polished_diorite_bricks", ModBlocks.POLISHED_DIORITE_BRICKS, ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> ANDESITE_BRICKS        = bs("andesite_bricks",        ModBlocks.ANDESITE_BRICKS,        ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> MOSSY_ANDESITE         = bs("mossy_andesite",         ModBlocks.MOSSY_ANDESITE,         ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> CRACKED_SOUL_BRICKS    = bs("cracked_soul_bricks",    ModBlocks.CRACKED_SOUL_BRICKS,    ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> GILDED_OBSIDIAN        = bs("gilded_obsidian",        ModBlocks.GILDED_OBSIDIAN,        ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> AMETHYST_TILES         = bs("amethyst_tiles",         ModBlocks.AMETHYST_TILES,         ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> SAPPHIRE_TILES         = bs("sapphire_tiles",         ModBlocks.SAPPHIRE_TILES,         ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> TOPAZ_TILES            = bs("topaz_tiles",            ModBlocks.TOPAZ_TILES,            ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> ONYX_TILES             = bs("onyx_tiles",             ModBlocks.ONYX_TILES,             ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> DRAGON_SCALE_BRICKS    = bs("dragon_scale_bricks",    ModBlocks.DRAGON_SCALE_BRICKS,    ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> ANCIENT_STONE_ROAD     = bs("ancient_stone_road",     ModBlocks.ANCIENT_STONE_ROAD,     ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> MOSSY_ENDER_BRICKS     = bs("mossy_ender_bricks",     ModBlocks.MOSSY_ENDER_BRICKS,     ModCreativeTabs.TAB_STONE);
    public static final RegistryObject<Item> CRACKED_DARK_BRICKS    = bs("cracked_dark_bricks",    ModBlocks.CRACKED_DARK_BRICKS,    ModCreativeTabs.TAB_STONE);

    // ════════════════════════════════════════════════════════
    // TAB 2: METALS & ORES — block items
    // ════════════════════════════════════════════════════════
    public static final RegistryObject<Item> RUBY_ORE_ITEM      = bs("ruby_ore",      ModBlocks.RUBY_ORE,      ModCreativeTabs.TAB_METALS);
    public static final RegistryObject<Item> SAPPHIRE_ORE_ITEM  = bs("sapphire_ore",  ModBlocks.SAPPHIRE_ORE,  ModCreativeTabs.TAB_METALS);
    public static final RegistryObject<Item> MITHRIL_ORE_ITEM   = bs("mithril_ore",   ModBlocks.MITHRIL_ORE,   ModCreativeTabs.TAB_METALS);
    public static final RegistryObject<Item> AMETHYST_ORE_ITEM  = bs("amethyst_ore",  ModBlocks.AMETHYST_ORE,  ModCreativeTabs.TAB_METALS);
    public static final RegistryObject<Item> TOPAZ_ORE_ITEM     = bs("topaz_ore",     ModBlocks.TOPAZ_ORE,     ModCreativeTabs.TAB_METALS);
    public static final RegistryObject<Item> ONYX_ORE_ITEM      = bs("onyx_ore",      ModBlocks.ONYX_ORE,      ModCreativeTabs.TAB_METALS);
    public static final RegistryObject<Item> JADE_ORE_ITEM      = bs("jade_ore",      ModBlocks.JADE_ORE,      ModCreativeTabs.TAB_METALS);
    public static final RegistryObject<Item> OPAL_ORE_ITEM      = bs("opal_ore",      ModBlocks.OPAL_ORE,      ModCreativeTabs.TAB_METALS);
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM    = bs("ruby_block",    ModBlocks.RUBY_BLOCK,    ModCreativeTabs.TAB_METALS);
    public static final RegistryObject<Item> SAPPHIRE_BLOCK_ITEM = bs("sapphire_block", ModBlocks.SAPPHIRE_BLOCK, ModCreativeTabs.TAB_METALS);
    public static final RegistryObject<Item> MITHRIL_BLOCK_ITEM = bs("mithril_block", ModBlocks.MITHRIL_BLOCK, ModCreativeTabs.TAB_METALS);
    public static final RegistryObject<Item> AMETHYST_BLOCK_ITEM = bs("amethyst_block", ModBlocks.AMETHYST_BLOCK, ModCreativeTabs.TAB_METALS);
    public static final RegistryObject<Item> JADE_BLOCK_ITEM    = bs("jade_block",    ModBlocks.JADE_BLOCK,    ModCreativeTabs.TAB_METALS);
    public static final RegistryObject<Item> OPAL_BLOCK_ITEM    = bs("opal_block",    ModBlocks.OPAL_BLOCK,    ModCreativeTabs.TAB_METALS);
    public static final RegistryObject<Item> ONYX_BLOCK_ITEM    = bs("onyx_block",    ModBlocks.ONYX_BLOCK,    ModCreativeTabs.TAB_METALS);
    public static final RegistryObject<Item> STEEL_BLOCK_ITEM   = bs("steel_block",   ModBlocks.STEEL_BLOCK,   ModCreativeTabs.TAB_METALS);
    public static final RegistryObject<Item> BRONZE_BLOCK_ITEM  = bs("bronze_block",  ModBlocks.BRONZE_BLOCK,  ModCreativeTabs.TAB_METALS);
    public static final RegistryObject<Item> TITANIUM_BLOCK_ITEM = bs("titanium_block", ModBlocks.TITANIUM_BLOCK, ModCreativeTabs.TAB_METALS);
    public static final RegistryObject<Item> DARK_STEEL_BLOCK_ITEM = bs("dark_steel_block", ModBlocks.DARK_STEEL_BLOCK, ModCreativeTabs.TAB_METALS);
    public static final RegistryObject<Item> MITHRIL_PLATING_ITEM = bs("mithril_plating", ModBlocks.MITHRIL_PLATING, ModCreativeTabs.TAB_METALS);
    public static final RegistryObject<Item> TITANIUM_PLATING_ITEM = bs("titanium_plating", ModBlocks.TITANIUM_PLATING, ModCreativeTabs.TAB_METALS);
    public static final RegistryObject<Item> GOLDEN_PLATING_ITEM = bs("golden_plating", ModBlocks.GOLDEN_PLATING, ModCreativeTabs.TAB_METALS);
    public static final RegistryObject<Item> BRONZE_TILES_ITEM  = bs("bronze_tiles",  ModBlocks.BRONZE_TILES,  ModCreativeTabs.TAB_METALS);
    public static final RegistryObject<Item> COPPER_TILES_ITEM  = bs("copper_tiles",  ModBlocks.COPPER_TILES,  ModCreativeTabs.TAB_METALS);
    public static final RegistryObject<Item> COPPER_PLATING_ITEM = bs("copper_plating", ModBlocks.COPPER_PLATING, ModCreativeTabs.TAB_METALS);
    public static final RegistryObject<Item> CORRODED_COPPER_ITEM = bs("corroded_copper", ModBlocks.CORRODED_COPPER, ModCreativeTabs.TAB_METALS);
    public static final RegistryObject<Item> AGED_COPPER_ITEM   = bs("aged_copper",   ModBlocks.AGED_COPPER,   ModCreativeTabs.TAB_METALS);
    public static final RegistryObject<Item> POLISHED_STEEL_ITEM = bs("polished_steel", ModBlocks.POLISHED_STEEL, ModCreativeTabs.TAB_METALS);
    public static final RegistryObject<Item> RUSTED_IRON_ITEM   = bs("rusted_iron",   ModBlocks.RUSTED_IRON,   ModCreativeTabs.TAB_METALS);
    public static final RegistryObject<Item> STEEL_BARS_ITEM    = bs("steel_bars",    ModBlocks.STEEL_BARS,    ModCreativeTabs.TAB_METALS);
    public static final RegistryObject<Item> IRON_GATE_ITEM     = bs("iron_gate",     ModBlocks.IRON_GATE,     ModCreativeTabs.TAB_METALS);
    public static final RegistryObject<Item> MITHRIL_BARS_ITEM  = bs("mithril_bars",  ModBlocks.MITHRIL_BARS,  ModCreativeTabs.TAB_METALS);
    public static final RegistryObject<Item> GOLDEN_BARS_ITEM   = bs("golden_bars",   ModBlocks.GOLDEN_BARS,   ModCreativeTabs.TAB_METALS);
    public static final RegistryObject<Item> COPPER_BARS_ITEM   = bs("copper_bars",   ModBlocks.COPPER_BARS,   ModCreativeTabs.TAB_METALS);
    public static final RegistryObject<Item> INDUSTRIAL_GRATE_ITEM = bs("industrial_grate", ModBlocks.INDUSTRIAL_GRATE, ModCreativeTabs.TAB_METALS);
    public static final RegistryObject<Item> MITHRIL_BRICKS_ITEM = bs("mithril_bricks", ModBlocks.MITHRIL_BRICKS, ModCreativeTabs.TAB_METALS);
    public static final RegistryObject<Item> TITANIUM_BRICKS_ITEM = bs("titanium_bricks", ModBlocks.TITANIUM_BRICKS, ModCreativeTabs.TAB_METALS);

    // ════════════════════════════════════════════════════════
    // TAB 3: GLASS & NEON — block items
    // ════════════════════════════════════════════════════════
    public static final RegistryObject<Item> BLUE_CRYSTAL_GLASS_ITEM   = bs("blue_crystal_glass",   ModBlocks.BLUE_CRYSTAL_GLASS,   ModCreativeTabs.TAB_GLASS);
    public static final RegistryObject<Item> RED_CRYSTAL_GLASS_ITEM    = bs("red_crystal_glass",    ModBlocks.RED_CRYSTAL_GLASS,    ModCreativeTabs.TAB_GLASS);
    public static final RegistryObject<Item> PURPLE_CRYSTAL_GLASS_ITEM = bs("purple_crystal_glass", ModBlocks.PURPLE_CRYSTAL_GLASS, ModCreativeTabs.TAB_GLASS);
    public static final RegistryObject<Item> GOLDEN_CRYSTAL_GLASS_ITEM = bs("golden_crystal_glass", ModBlocks.GOLDEN_CRYSTAL_GLASS, ModCreativeTabs.TAB_GLASS);
    public static final RegistryObject<Item> REINFORCED_GLASS_ITEM     = bs("reinforced_glass",     ModBlocks.REINFORCED_GLASS,     ModCreativeTabs.TAB_GLASS);
    public static final RegistryObject<Item> FROSTED_GLASS_ITEM        = bs("frosted_glass",        ModBlocks.FROSTED_GLASS,        ModCreativeTabs.TAB_GLASS);
    public static final RegistryObject<Item> CRYSTAL_PILLAR_ITEM       = bs("crystal_pillar",       ModBlocks.CRYSTAL_PILLAR,       ModCreativeTabs.TAB_GLASS);
    public static final RegistryObject<Item> MITHRIL_GLASS_ITEM        = bs("mithril_glass",        ModBlocks.MITHRIL_GLASS,        ModCreativeTabs.TAB_GLASS);
    public static final RegistryObject<Item> RUBY_GLASS_ITEM           = bs("ruby_glass",           ModBlocks.RUBY_GLASS,           ModCreativeTabs.TAB_GLASS);
    public static final RegistryObject<Item> SAPPHIRE_GLASS_ITEM       = bs("sapphire_glass",       ModBlocks.SAPPHIRE_GLASS,       ModCreativeTabs.TAB_GLASS);
    public static final RegistryObject<Item> STAR_GLASS_ITEM           = bs("star_glass",           ModBlocks.STAR_GLASS,           ModCreativeTabs.TAB_GLASS);
    public static final RegistryObject<Item> VOID_GLASS_ITEM           = bs("void_glass",           ModBlocks.VOID_GLASS,           ModCreativeTabs.TAB_GLASS);
    public static final RegistryObject<Item> PRISMATIC_GLASS_ITEM      = bs("prismatic_glass",      ModBlocks.PRISMATIC_GLASS,      ModCreativeTabs.TAB_GLASS);
    public static final RegistryObject<Item> AMETHYST_GLASS_ITEM       = bs("amethyst_glass",       ModBlocks.AMETHYST_GLASS,       ModCreativeTabs.TAB_GLASS);
    public static final RegistryObject<Item> TOPAZ_GLASS_ITEM          = bs("topaz_glass",          ModBlocks.TOPAZ_GLASS,          ModCreativeTabs.TAB_GLASS);
    public static final RegistryObject<Item> JADE_GLASS_ITEM           = bs("jade_glass",           ModBlocks.JADE_GLASS,           ModCreativeTabs.TAB_GLASS);
    public static final RegistryObject<Item> ONYX_GLASS_ITEM           = bs("onyx_glass",           ModBlocks.ONYX_GLASS,           ModCreativeTabs.TAB_GLASS);
    public static final RegistryObject<Item> NEON_BLUE_ITEM    = bs("neon_blue",    ModBlocks.NEON_BLUE,    ModCreativeTabs.TAB_GLASS);
    public static final RegistryObject<Item> NEON_RED_ITEM     = bs("neon_red",     ModBlocks.NEON_RED,     ModCreativeTabs.TAB_GLASS);
    public static final RegistryObject<Item> NEON_GREEN_ITEM   = bs("neon_green",   ModBlocks.NEON_GREEN,   ModCreativeTabs.TAB_GLASS);
    public static final RegistryObject<Item> NEON_YELLOW_ITEM  = bs("neon_yellow",  ModBlocks.NEON_YELLOW,  ModCreativeTabs.TAB_GLASS);
    public static final RegistryObject<Item> NEON_PURPLE_ITEM  = bs("neon_purple",  ModBlocks.NEON_PURPLE,  ModCreativeTabs.TAB_GLASS);
    public static final RegistryObject<Item> NEON_CYAN_ITEM    = bs("neon_cyan",    ModBlocks.NEON_CYAN,    ModCreativeTabs.TAB_GLASS);
    public static final RegistryObject<Item> NEON_WHITE_ITEM   = bs("neon_white",   ModBlocks.NEON_WHITE,   ModCreativeTabs.TAB_GLASS);
    public static final RegistryObject<Item> NEON_ORANGE_ITEM  = bs("neon_orange",  ModBlocks.NEON_ORANGE,  ModCreativeTabs.TAB_GLASS);
    public static final RegistryObject<Item> NEON_PINK_ITEM    = bs("neon_pink",    ModBlocks.NEON_PINK,    ModCreativeTabs.TAB_GLASS);
    public static final RegistryObject<Item> NEON_LIME_ITEM    = bs("neon_lime",    ModBlocks.NEON_LIME,    ModCreativeTabs.TAB_GLASS);

    // ════════════════════════════════════════════════════════
    // TAB 4: MAGIC & SPECIAL — block items
    // ════════════════════════════════════════════════════════
    public static final RegistryObject<Item> ANCIENT_ALTAR_ITEM   = bs("ancient_altar",   ModBlocks.ANCIENT_ALTAR,   ModCreativeTabs.TAB_MAGIC);
    public static final RegistryObject<Item> MAGIC_ALTAR_ITEM     = bs("magic_altar",     ModBlocks.MAGIC_ALTAR,     ModCreativeTabs.TAB_MAGIC);
    public static final RegistryObject<Item> ALTAR_OF_REBIRTH_ITEM = bs("altar_of_rebirth", ModBlocks.ALTAR_OF_REBIRTH, ModCreativeTabs.TAB_MAGIC);
    public static final RegistryObject<Item> BRAZIER_ITEM         = bs("brazier",         ModBlocks.BRAZIER,         ModCreativeTabs.TAB_MAGIC);
    public static final RegistryObject<Item> MAGIC_LANTERN_ITEM   = bs("magic_lantern",   ModBlocks.MAGIC_LANTERN,   ModCreativeTabs.TAB_MAGIC);
    public static final RegistryObject<Item> SOUL_LANTERN_ITEM    = bs("soul_lantern_block", ModBlocks.SOUL_LANTERN_BLOCK, ModCreativeTabs.TAB_MAGIC);
    public static final RegistryObject<Item> CRYSTAL_TORCH_ITEM   = bs("crystal_torch_block", ModBlocks.CRYSTAL_TORCH_BLOCK, ModCreativeTabs.TAB_MAGIC);
    public static final RegistryObject<Item> ENCHANTED_PILLAR_ITEM = bs("enchanted_pillar", ModBlocks.ENCHANTED_PILLAR, ModCreativeTabs.TAB_MAGIC);
    public static final RegistryObject<Item> DRAGON_EGG_PEDESTAL_ITEM = bs("dragon_egg_pedestal", ModBlocks.DRAGON_EGG_PEDESTAL, ModCreativeTabs.TAB_MAGIC);
    public static final RegistryObject<Item> ARCANE_BOOKSHELF_ITEM = bs("arcane_bookshelf", ModBlocks.ARCANE_BOOKSHELF, ModCreativeTabs.TAB_MAGIC);
    public static final RegistryObject<Item> INFUSED_OBSIDIAN_ITEM = bs("infused_obsidian", ModBlocks.INFUSED_OBSIDIAN, ModCreativeTabs.TAB_MAGIC);
    public static final RegistryObject<Item> GEM_FORGE_ITEM       = bs("gem_forge",       ModBlocks.GEM_FORGE,       ModCreativeTabs.TAB_MAGIC);
    public static final RegistryObject<Item> ALCHEMY_TABLE_ITEM   = bs("alchemy_table",   ModBlocks.ALCHEMY_TABLE,   ModCreativeTabs.TAB_MAGIC);
    public static final RegistryObject<Item> RUNE_ENGRAVER_ITEM   = bs("rune_engraver",   ModBlocks.RUNE_ENGRAVER,   ModCreativeTabs.TAB_MAGIC);

    // ════════════════════════════════════════════════════════
    // TAB 5: TOOLS, WEAPONS & ITEMS
    // ════════════════════════════════════════════════════════
    // Raw materials / gems
    public static final RegistryObject<Item> STEEL_INGOT          = item("steel_ingot");
    public static final RegistryObject<Item> BRONZE_INGOT         = item("bronze_ingot");
    public static final RegistryObject<Item> COPPER_INGOT         = item("copper_ingot");
    public static final RegistryObject<Item> TITANIUM_SHARD       = item("titanium_shard");
    public static final RegistryObject<Item> RUBY                 = item("ruby");
    public static final RegistryObject<Item> SAPPHIRE             = item("sapphire");
    public static final RegistryObject<Item> MITHRIL_INGOT        = item("mithril_ingot");
    public static final RegistryObject<Item> AMETHYST_GEM         = item("amethyst_gem");
    public static final RegistryObject<Item> TOPAZ                = item("topaz");
    public static final RegistryObject<Item> ONYX_SHARD           = item("onyx_shard");
    public static final RegistryObject<Item> JADE                 = item("jade");
    public static final RegistryObject<Item> OPAL                 = item("opal");
    public static final RegistryObject<Item> CRYSTAL_SHARD_BLUE   = item("crystal_shard_blue");
    public static final RegistryObject<Item> CRYSTAL_SHARD_RED    = item("crystal_shard_red");
    public static final RegistryObject<Item> CRYSTAL_SHARD_PURPLE = item("crystal_shard_purple");
    public static final RegistryObject<Item> CRYSTAL_SHARD_GOLDEN = item("crystal_shard_golden");
    public static final RegistryObject<Item> MARBLE_CHUNK         = item("marble_chunk");
    public static final RegistryObject<Item> ANCIENT_FRAGMENT     = item("ancient_fragment");
    public static final RegistryObject<Item> VOID_ESSENCE         = item("void_essence");
    public static final RegistryObject<Item> DRAGON_SCALE         = item("dragon_scale");
    public static final RegistryObject<Item> MITHRIL_DUST         = item("mithril_dust");
    public static final RegistryObject<Item> ARCANE_DUST          = item("arcane_dust");

    // Swords
    public static final RegistryObject<Item> BRONZE_SWORD   = sword("bronze_sword",   ModItemTier.BRONZE,   3, -2.4f);
    public static final RegistryObject<Item> MITHRIL_SWORD  = sword("mithril_sword",  ModItemTier.MITHRIL,  5, -2.2f);
    public static final RegistryObject<Item> RUBY_SWORD     = sword("ruby_sword",     ModItemTier.RUBY,     4, -2.3f);
    public static final RegistryObject<Item> ONYX_SWORD     = sword("onyx_sword",     ModItemTier.ONYX,     6, -2.1f);
    public static final RegistryObject<Item> TITANIUM_SWORD = sword("titanium_sword", ModItemTier.TITANIUM, 5, -2.1f);

    // Pickaxes
    public static final RegistryObject<Item> MITHRIL_PICKAXE  = pick("mithril_pickaxe",  ModItemTier.MITHRIL);
    public static final RegistryObject<Item> TITANIUM_PICKAXE = pick("titanium_pickaxe", ModItemTier.TITANIUM);
    public static final RegistryObject<Item> ONYX_PICKAXE     = pick("onyx_pickaxe",     ModItemTier.ONYX);

    // Special items with mechanics
    public static final RegistryObject<Item> CRYSTAL_WAND =
        ITEMS.register("crystal_wand", () ->
            new CrystalWandItem(new Item.Properties().tab(ModCreativeTabs.TAB_ITEMS).durability(128)));
    public static final RegistryObject<Item> VOID_WAND =
        ITEMS.register("void_wand", () ->
            new VoidWandItem(new Item.Properties().tab(ModCreativeTabs.TAB_ITEMS).durability(256)));
    public static final RegistryObject<Item> RUBY_STAFF =
        ITEMS.register("ruby_staff", () ->
            new RubyStaffItem(new Item.Properties().tab(ModCreativeTabs.TAB_ITEMS).durability(200)));
    public static final RegistryObject<Item> MITHRIL_SHIELD =
        ITEMS.register("mithril_shield", () ->
            new MithrilShieldItem(new Item.Properties().tab(ModCreativeTabs.TAB_ITEMS).durability(800)));
    public static final RegistryObject<Item> SOUL_COMPASS =
        ITEMS.register("soul_compass", () ->
            new SoulCompassItem(new Item.Properties().tab(ModCreativeTabs.TAB_ITEMS)));
    public static final RegistryObject<Item> CRYSTAL_LENS =
        ITEMS.register("crystal_lens", () ->
            new CrystalLensItem(new Item.Properties().tab(ModCreativeTabs.TAB_ITEMS).durability(64)));

    // ── HELPERS ──────────────────────────────────────────────
    private static RegistryObject<Item> bs(String name, RegistryObject<Block> b, net.minecraft.item.ItemGroup tab) {
        return ITEMS.register(name, () -> new BlockItem(b.get(), new Item.Properties().tab(tab)));
    }
    private static RegistryObject<Item> item(String name) {
        return ITEMS.register(name, () -> new Item(new Item.Properties().tab(ModCreativeTabs.TAB_ITEMS)));
    }
    private static RegistryObject<Item> sword(String name, ModItemTier tier, int dmg, float spd) {
        return ITEMS.register(name, () -> new SwordItem(tier, dmg, spd, new Item.Properties().tab(ModCreativeTabs.TAB_ITEMS)));
    }
    private static RegistryObject<Item> pick(String name, ModItemTier tier) {
        return ITEMS.register(name, () -> new PickaxeItem(tier, 1, -2.8f, new Item.Properties().tab(ModCreativeTabs.TAB_ITEMS)));
    }
}
