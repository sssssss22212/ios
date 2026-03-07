package com.decorativeblocks.init;

import com.decorativeblocks.AncientAltarBlock;
import com.decorativeblocks.BrazierBlock;
import com.decorativeblocks.DecorativeBlocks;
import com.decorativeblocks.blocks.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
        DeferredRegister.create(ForgeRegistries.BLOCKS, DecorativeBlocks.MOD_ID);

    // ════════════════════════════════════════════════════════
    // CATEGORY 1: STONE & BRICKS  (TAB_STONE)
    // ════════════════════════════════════════════════════════
    public static final RegistryObject<Block> MARBLE_COLUMN = stone("marble_column", 1.5f, 6f);
    public static final RegistryObject<Block> MARBLE_TILES  = stone("marble_tiles",  1.5f, 6f);
    public static final RegistryObject<Block> ORNATE_TILES  = stone("ornate_tiles",  1.5f, 6f);
    public static final RegistryObject<Block> SANDSTONE_TILES = stone("sandstone_tiles", 1.5f, 6f);
    public static final RegistryObject<Block> DARK_BRICKS   = stone("dark_bricks",   1.5f, 6f);
    public static final RegistryObject<Block> CARVED_STONE  = stone("carved_stone",  1.5f, 6f);
    public static final RegistryObject<Block> GRANITE_TILES = stone("granite_tiles", 1.5f, 6f);
    public static final RegistryObject<Block> OBSIDIAN_TILES = stone("obsidian_tiles", 50f, 1200f);
    public static final RegistryObject<Block> MOSSY_DARK_BRICKS = stone("mossy_dark_bricks", 1.5f, 6f);
    public static final RegistryObject<Block> CRACKED_CARVED_STONE = stone("cracked_carved_stone", 1.5f, 6f);
    public static final RegistryObject<Block> GILDED_STONE  = stone("gilded_stone",  1.5f, 6f);
    public static final RegistryObject<Block> VOID_STONE    = stone("void_stone",    1.5f, 6f);
    public static final RegistryObject<Block> BONE_TILES    = stone("bone_tiles",    1.5f, 6f);
    public static final RegistryObject<Block> ENDER_TILES   = stone("ender_tiles",   1.5f, 6f);
    public static final RegistryObject<Block> SHADOW_STONE  = stone("shadow_stone",  1.5f, 6f);
    public static final RegistryObject<Block> MOSSY_COBBLESTONE_BRICKS = stone("mossy_cobblestone_bricks", 1.5f, 6f);
    public static final RegistryObject<Block> STAINED_MARBLE_RED  = stone("stained_marble_red",  1.5f, 6f);
    public static final RegistryObject<Block> STAINED_MARBLE_BLUE = stone("stained_marble_blue", 1.5f, 6f);
    public static final RegistryObject<Block> POLISHED_GRANITE_BRICKS = stone("polished_granite_bricks", 1.5f, 6f);
    public static final RegistryObject<Block> CHISELED_SANDSTONE = stone("chiseled_sandstone_bricks", 1.5f, 6f);
    public static final RegistryObject<Block> COBALT_BRICKS = stone("cobalt_bricks", 2.0f, 6f);
    public static final RegistryObject<Block> ANCIENT_COBBLESTONE = stone("ancient_cobblestone", 2.0f, 6f);
    public static final RegistryObject<Block> MOSSY_GRANITE  = stone("mossy_granite", 1.5f, 6f);
    public static final RegistryObject<Block> CRACKED_OBSIDIAN = stone("cracked_obsidian", 40f, 600f);
    public static final RegistryObject<Block> SOUL_BRICKS    = stone("soul_bricks",   2.0f, 6f);
    public static final RegistryObject<Block> CRYSTAL_BRICKS = stone("crystal_bricks", 2.0f, 6f);
    public static final RegistryObject<Block> LAVA_BRICKS    = BLOCKS.register("lava_bricks",
        () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(2f, 6f).sound(SoundType.STONE).lightLevel(s -> 10)));
    public static final RegistryObject<Block> ICE_BRICKS     = BLOCKS.register("ice_bricks",
        () -> new Block(AbstractBlock.Properties.of(Material.ICE).strength(0.5f, 2f).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> MOSSY_SANDSTONE = stone("mossy_sandstone", 1.5f, 6f);
    public static final RegistryObject<Block> CARVED_OBSIDIAN = stone("carved_obsidian", 50f, 1200f);
    public static final RegistryObject<Block> RUBY_TILES     = stone("ruby_tiles",    3.0f, 6f);
    public static final RegistryObject<Block> MITHRIL_TILES  = stone("mithril_tiles", 4.0f, 8f);
    public static final RegistryObject<Block> ANCIENT_PILLAR = stone("ancient_pillar", 1.5f, 6f);
    public static final RegistryObject<Block> PEDESTAL       = stone("pedestal",       1.5f, 6f);
    public static final RegistryObject<Block> RUNE_STONE     = stone("rune_stone",     2.5f, 6f);
    public static final RegistryObject<Block> RUNE_STONE_LIT = BLOCKS.register("rune_stone_lit",
        () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(2.5f, 6f).sound(SoundType.STONE).lightLevel(s -> 12)));
    public static final RegistryObject<Block> ENCHANTED_STONE = BLOCKS.register("enchanted_stone",
        () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(2f, 6f).sound(SoundType.STONE).lightLevel(s -> 8)));
    public static final RegistryObject<Block> PETRIFIED_WOOD = stone("petrified_wood", 2.5f, 6f);
    public static final RegistryObject<Block> VOLCANIC_ROCK  = BLOCKS.register("volcanic_rock",
        () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(2f, 6f).sound(SoundType.BASALT)));
    public static final RegistryObject<Block> VOLCANIC_BRICKS = BLOCKS.register("volcanic_bricks",
        () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(2.5f, 6f).sound(SoundType.BASALT)));
    public static final RegistryObject<Block> MOSSY_VOLCANIC = BLOCKS.register("mossy_volcanic",
        () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(2f, 6f).sound(SoundType.BASALT)));
    public static final RegistryObject<Block> HARDENED_CLAY_BRICKS = stone("hardened_clay_bricks", 2f, 6f);
    public static final RegistryObject<Block> MOSSY_CLAY_BRICKS = stone("mossy_clay_bricks", 2f, 6f);
    public static final RegistryObject<Block> CRYSTALLINE_DIRT = BLOCKS.register("crystalline_dirt",
        () -> new Block(AbstractBlock.Properties.of(Material.DIRT).strength(0.8f).sound(SoundType.GRAVEL)));
    public static final RegistryObject<Block> ANCIENT_SAND   = BLOCKS.register("ancient_sand",
        () -> new Block(AbstractBlock.Properties.of(Material.SAND).strength(0.5f).sound(SoundType.SAND)));
    // New stone blocks V4
    public static final RegistryObject<Block> POLISHED_DIORITE_BRICKS = stone("polished_diorite_bricks", 1.5f, 6f);
    public static final RegistryObject<Block> ANDESITE_BRICKS  = stone("andesite_bricks",  1.5f, 6f);
    public static final RegistryObject<Block> MOSSY_ANDESITE   = stone("mossy_andesite",   1.5f, 6f);
    public static final RegistryObject<Block> CRACKED_SOUL_BRICKS = stone("cracked_soul_bricks", 2f, 6f);
    public static final RegistryObject<Block> GILDED_OBSIDIAN  = stone("gilded_obsidian",  50f, 1200f);
    public static final RegistryObject<Block> AMETHYST_TILES   = stone("amethyst_tiles",   3f, 6f);
    public static final RegistryObject<Block> SAPPHIRE_TILES   = stone("sapphire_tiles",   3f, 6f);
    public static final RegistryObject<Block> TOPAZ_TILES      = stone("topaz_tiles",      3f, 6f);
    public static final RegistryObject<Block> ONYX_TILES       = stone("onyx_tiles",       5f, 8f);
    public static final RegistryObject<Block> DRAGON_SCALE_BRICKS = stone("dragon_scale_bricks", 4f, 8f);
    public static final RegistryObject<Block> ANCIENT_STONE_ROAD = stone("ancient_stone_road", 1.5f, 6f);
    public static final RegistryObject<Block> MOSSY_ENDER_BRICKS = stone("mossy_ender_bricks", 1.5f, 6f);
    public static final RegistryObject<Block> CRACKED_DARK_BRICKS = stone("cracked_dark_bricks", 1.5f, 6f);

    // ════════════════════════════════════════════════════════
    // CATEGORY 2: ORES & METAL BLOCKS (TAB_METALS)
    // ════════════════════════════════════════════════════════
    // Ores
    public static final RegistryObject<Block> RUBY_ORE     = ore("ruby_ore",     3f);
    public static final RegistryObject<Block> SAPPHIRE_ORE = ore("sapphire_ore", 3f);
    public static final RegistryObject<Block> MITHRIL_ORE  = ore("mithril_ore",  4f);
    public static final RegistryObject<Block> AMETHYST_ORE = ore("amethyst_ore", 3.5f);
    public static final RegistryObject<Block> TOPAZ_ORE    = ore("topaz_ore",    3f);
    public static final RegistryObject<Block> ONYX_ORE     = ore("onyx_ore",     4.5f);
    // New ores V4
    public static final RegistryObject<Block> JADE_ORE     = ore("jade_ore",     3f);
    public static final RegistryObject<Block> OPAL_ORE     = ore("opal_ore",     3f);

    // Storage blocks
    public static final RegistryObject<Block> RUBY_BLOCK      = metal("ruby_block",      5f, 6f);
    public static final RegistryObject<Block> SAPPHIRE_BLOCK  = metal("sapphire_block",  5f, 6f);
    public static final RegistryObject<Block> MITHRIL_BLOCK   = metal("mithril_block",   5f, 10f);
    public static final RegistryObject<Block> AMETHYST_BLOCK  = metal("amethyst_block",  4f, 6f);
    public static final RegistryObject<Block> JADE_BLOCK      = metal("jade_block",      4f, 6f);
    public static final RegistryObject<Block> OPAL_BLOCK      = metal("opal_block",      4f, 6f);
    // Metal blocks
    public static final RegistryObject<Block> STEEL_BLOCK     = metal("steel_block",     3f, 8f);
    public static final RegistryObject<Block> BRONZE_BLOCK    = metal("bronze_block",    3f, 8f);
    public static final RegistryObject<Block> TITANIUM_BLOCK  = metal("titanium_block",  3f, 8f);
    public static final RegistryObject<Block> DARK_STEEL_BLOCK = metal("dark_steel_block", 4f, 10f);
    public static final RegistryObject<Block> MITHRIL_PLATING = metal("mithril_plating", 5f, 10f);
    public static final RegistryObject<Block> TITANIUM_PLATING = metal("titanium_plating", 5f, 10f);
    public static final RegistryObject<Block> GOLDEN_PLATING  = metal("golden_plating",  1.5f, 4f);
    public static final RegistryObject<Block> BRONZE_TILES    = metal("bronze_tiles",    3f, 8f);
    public static final RegistryObject<Block> COPPER_TILES    = metal("copper_tiles",    3f, 8f);
    public static final RegistryObject<Block> COPPER_PLATING  = metal("copper_plating",  3f, 8f);
    public static final RegistryObject<Block> CORRODED_COPPER = metal("corroded_copper", 3f, 8f);
    public static final RegistryObject<Block> AGED_COPPER     = metal("aged_copper",     2f, 6f);
    public static final RegistryObject<Block> POLISHED_STEEL  = metal("polished_steel",  3f, 8f);
    public static final RegistryObject<Block> RUSTED_IRON     = metal("rusted_iron",     3f, 8f);
    // Metal bars/gates
    public static final RegistryObject<Block> STEEL_BARS      = BLOCKS.register("steel_bars",
        () -> new Block(AbstractBlock.Properties.of(Material.METAL).strength(2f,6f).sound(SoundType.METAL).noOcclusion()));
    public static final RegistryObject<Block> IRON_GATE       = BLOCKS.register("iron_gate",
        () -> new Block(AbstractBlock.Properties.of(Material.METAL).strength(2f,6f).sound(SoundType.METAL).noOcclusion()));
    public static final RegistryObject<Block> MITHRIL_BARS    = BLOCKS.register("mithril_bars",
        () -> new Block(AbstractBlock.Properties.of(Material.METAL).strength(4f,8f).sound(SoundType.METAL).noOcclusion()));
    public static final RegistryObject<Block> GOLDEN_BARS     = BLOCKS.register("golden_bars",
        () -> new Block(AbstractBlock.Properties.of(Material.METAL).strength(1.5f,4f).sound(SoundType.METAL).noOcclusion()));
    public static final RegistryObject<Block> COPPER_BARS     = BLOCKS.register("copper_bars",
        () -> new Block(AbstractBlock.Properties.of(Material.METAL).strength(2f,5f).sound(SoundType.METAL).noOcclusion()));
    public static final RegistryObject<Block> INDUSTRIAL_GRATE = BLOCKS.register("industrial_grate",
        () -> new Block(AbstractBlock.Properties.of(Material.METAL).strength(2f,6f).sound(SoundType.METAL).noOcclusion()));
    // New metal blocks V4
    public static final RegistryObject<Block> JADE_BLOCK_DECO  = metal("jade_block_deco",  4f, 6f);
    public static final RegistryObject<Block> OPAL_BLOCK_DECO  = metal("opal_block_deco",  4f, 6f);
    public static final RegistryObject<Block> MITHRIL_BRICKS   = metal("mithril_bricks",   5f, 10f);
    public static final RegistryObject<Block> TITANIUM_BRICKS  = metal("titanium_bricks",  5f, 10f);
    public static final RegistryObject<Block> ONYX_BLOCK       = metal("onyx_block",       6f, 12f);

    // ════════════════════════════════════════════════════════
    // CATEGORY 3: GLASS & NEON  (TAB_GLASS)
    // ════════════════════════════════════════════════════════
    public static final RegistryObject<Block> BLUE_CRYSTAL_GLASS   = glass("blue_crystal_glass",   0);
    public static final RegistryObject<Block> RED_CRYSTAL_GLASS    = glass("red_crystal_glass",    0);
    public static final RegistryObject<Block> PURPLE_CRYSTAL_GLASS = glass("purple_crystal_glass", 0);
    public static final RegistryObject<Block> GOLDEN_CRYSTAL_GLASS = glass("golden_crystal_glass", 0);
    public static final RegistryObject<Block> REINFORCED_GLASS     = glass("reinforced_glass",     0);
    public static final RegistryObject<Block> FROSTED_GLASS        = glass("frosted_glass",        0);
    public static final RegistryObject<Block> CRYSTAL_PILLAR       = glass("crystal_pillar",       0);
    public static final RegistryObject<Block> MITHRIL_GLASS        = glass("mithril_glass",        6);
    public static final RegistryObject<Block> RUBY_GLASS           = glass("ruby_glass",           8);
    public static final RegistryObject<Block> SAPPHIRE_GLASS       = glass("sapphire_glass",       8);
    public static final RegistryObject<Block> STAR_GLASS           = glass("star_glass",           12);
    public static final RegistryObject<Block> VOID_GLASS           = glass("void_glass",           0);
    public static final RegistryObject<Block> PRISMATIC_GLASS      = glass("prismatic_glass",      10);
    // Neon blocks
    public static final RegistryObject<Block> NEON_BLUE   = neon("neon_blue");
    public static final RegistryObject<Block> NEON_RED    = neon("neon_red");
    public static final RegistryObject<Block> NEON_GREEN  = neon("neon_green");
    public static final RegistryObject<Block> NEON_YELLOW = neon("neon_yellow");
    public static final RegistryObject<Block> NEON_PURPLE = neon("neon_purple");
    public static final RegistryObject<Block> NEON_CYAN   = neon("neon_cyan");
    public static final RegistryObject<Block> NEON_WHITE  = neon("neon_white");
    public static final RegistryObject<Block> NEON_ORANGE = neon("neon_orange");
    // New glass V4
    public static final RegistryObject<Block> AMETHYST_GLASS = glass("amethyst_glass", 8);
    public static final RegistryObject<Block> TOPAZ_GLASS    = glass("topaz_glass",    8);
    public static final RegistryObject<Block> JADE_GLASS     = glass("jade_glass",     8);
    public static final RegistryObject<Block> ONYX_GLASS     = glass("onyx_glass",     4);
    public static final RegistryObject<Block> NEON_PINK      = neon("neon_pink");
    public static final RegistryObject<Block> NEON_LIME      = neon("neon_lime");

    // ════════════════════════════════════════════════════════
    // CATEGORY 4: MAGIC & SPECIAL  (TAB_MAGIC)
    // ════════════════════════════════════════════════════════
    public static final RegistryObject<Block> ANCIENT_ALTAR = BLOCKS.register("ancient_altar",
        () -> new AncientAltarBlock(AbstractBlock.Properties.of(Material.STONE).strength(3f,6f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MAGIC_ALTAR   = BLOCKS.register("magic_altar",
        () -> new AncientAltarBlock(AbstractBlock.Properties.of(Material.STONE).strength(4f,8f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ALTAR_OF_REBIRTH = BLOCKS.register("altar_of_rebirth",
        () -> new AncientAltarBlock(AbstractBlock.Properties.of(Material.STONE).strength(5f,10f).sound(SoundType.STONE).lightLevel(s->10)));
    public static final RegistryObject<Block> BRAZIER       = BLOCKS.register("brazier",
        () -> new BrazierBlock(AbstractBlock.Properties.of(Material.METAL).strength(2f,6f).sound(SoundType.METAL).lightLevel(s->s.getValue(BrazierBlock.LIT)?14:0)));
    public static final RegistryObject<Block> MAGIC_LANTERN = BLOCKS.register("magic_lantern",
        () -> new GlassBlock(AbstractBlock.Properties.of(Material.GLASS).strength(0.3f).sound(SoundType.GLASS).noOcclusion().lightLevel(s->12)));
    public static final RegistryObject<Block> SOUL_LANTERN_BLOCK = BLOCKS.register("soul_lantern_block",
        () -> new Block(AbstractBlock.Properties.of(Material.METAL).strength(1f,4f).sound(SoundType.LANTERN).lightLevel(s->10)));
    public static final RegistryObject<Block> CRYSTAL_TORCH_BLOCK = BLOCKS.register("crystal_torch_block",
        () -> new Block(AbstractBlock.Properties.of(Material.GLASS).strength(0.3f).sound(SoundType.GLASS).noOcclusion().lightLevel(s->14)));
    public static final RegistryObject<Block> ENCHANTED_PILLAR = BLOCKS.register("enchanted_pillar",
        () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(2f,6f).sound(SoundType.STONE).lightLevel(s->8)));
    public static final RegistryObject<Block> RUNE_STONE_ACTIVE = BLOCKS.register("rune_stone_lit",
        () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(2.5f,6f).sound(SoundType.STONE).lightLevel(s->12)));
    public static final RegistryObject<Block> DRAGON_EGG_PEDESTAL = stone("dragon_egg_pedestal", 3f, 8f);
    public static final RegistryObject<Block> ARCANE_BOOKSHELF = BLOCKS.register("arcane_bookshelf",
        () -> new Block(AbstractBlock.Properties.of(Material.WOOD).strength(1.5f,3f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> INFUSED_OBSIDIAN = BLOCKS.register("infused_obsidian",
        () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(50f,1200f).sound(SoundType.STONE).lightLevel(s->6)));
    // Functional blocks with custom menus
    public static final RegistryObject<Block> GEM_FORGE     = BLOCKS.register("gem_forge",
        () -> new GemForgeBlock());
    public static final RegistryObject<Block> ALCHEMY_TABLE = BLOCKS.register("alchemy_table",
        () -> new AlchemyTableBlock());
    public static final RegistryObject<Block> RUNE_ENGRAVER = BLOCKS.register("rune_engraver",
        () -> new RuneEngraverBlock());

    // ── PRIVATE HELPERS ──────────────────────────────────────
    private static RegistryObject<Block> stone(String n, float hard, float res) {
        return BLOCKS.register(n, () -> new Block(
            AbstractBlock.Properties.of(Material.STONE).strength(hard,res).sound(SoundType.STONE)));
    }
    private static RegistryObject<Block> metal(String n, float hard, float res) {
        return BLOCKS.register(n, () -> new Block(
            AbstractBlock.Properties.of(Material.METAL).strength(hard,res).sound(SoundType.METAL)));
    }
    private static RegistryObject<Block> ore(String n, float hard) {
        return BLOCKS.register(n, () -> new OreBlock(
            AbstractBlock.Properties.of(Material.STONE).strength(hard,hard).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    }
    private static RegistryObject<Block> glass(String n, int light) {
        return BLOCKS.register(n, () -> new GlassBlock(
            AbstractBlock.Properties.of(Material.GLASS).strength(0.3f).sound(SoundType.GLASS).noOcclusion().lightLevel(s->light)));
    }
    private static RegistryObject<Block> neon(String n) {
        return BLOCKS.register(n, () -> new Block(
            AbstractBlock.Properties.of(Material.GLASS).strength(0.5f,2f).sound(SoundType.GLASS).noOcclusion().lightLevel(s->15)));
    }
}
