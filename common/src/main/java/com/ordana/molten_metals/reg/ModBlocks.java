package com.ordana.molten_metals.reg;

import com.ordana.molten_metals.MoltenMetals;
import com.ordana.molten_metals.MoltenMetalsPlatform;
import com.ordana.molten_metals.blocks.MoldBlock;
import net.mehvahdjukaar.moonlight.api.platform.RegHelper;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import java.util.function.Supplier;

public class ModBlocks {

    public static void init() {
    }

    private static boolean always(BlockState state, BlockGetter blockGetter, BlockPos pos) {
        return true;
    }

    public static <T extends Block> Supplier<T> regBlock(String name, Supplier<T> block) {
        return RegHelper.registerBlock(MoltenMetals.res(name), block);
    }

    public static <T extends Block> Supplier<T> regWithItem(String name, Supplier<T> blockFactory) {
        Supplier<T> block = regBlock(name, blockFactory);
        regBlockItem(name, block, new Item.Properties());
        return block;
    }

    public static <T extends Block> Supplier<T> regMoldItem(String name, Supplier<T> blockFactory) {
        Supplier<T> block = regBlock(name, blockFactory);
        regBlockItem(name, block, new Item.Properties().stacksTo(1));
        return block;
    }

    public static void regBlockItem(String name, Supplier<? extends Block> blockSup, Item.Properties properties) {
        RegHelper.registerItem(MoltenMetals.res(name), () -> new BlockItem(blockSup.get(), properties));
    }

    public static final Supplier<LiquidBlock> MOLTEN_IRON = regBlock("molten_iron", () ->
            MoltenMetalsPlatform.doMoltenMetal(ModFluids.MOLTEN_IRON, BlockBehaviour.Properties.of().mapColor(MapColor.FIRE).replaceable().randomTicks().liquid().sound(SoundType.EMPTY).pushReaction(PushReaction.DESTROY).noCollission().strength(100f).noLootTable().lightLevel((blockStatex) -> 8).emissiveRendering(ModBlocks::always)));
    public static final Supplier<LiquidBlock> MOLTEN_COPPER = regBlock("molten_copper", () ->
            MoltenMetalsPlatform.doMoltenMetal(ModFluids.MOLTEN_COPPER, BlockBehaviour.Properties.of().mapColor(MapColor.FIRE).replaceable().randomTicks().liquid().sound(SoundType.EMPTY).pushReaction(PushReaction.DESTROY).noCollission().strength(100f).noLootTable().lightLevel((blockStatex) -> 8).emissiveRendering(ModBlocks::always)));
    public static final Supplier<LiquidBlock> MOLTEN_GOLD = regBlock("molten_gold", () ->
            MoltenMetalsPlatform.doMoltenMetal(ModFluids.MOLTEN_GOLD, BlockBehaviour.Properties.of().mapColor(MapColor.FIRE).replaceable().randomTicks().liquid().sound(SoundType.EMPTY).pushReaction(PushReaction.DESTROY).noCollission().strength(100f)));
    public static final Supplier<LiquidBlock> MOLTEN_NETHERITE = regBlock("molten_netherite", () ->
            MoltenMetalsPlatform.doMoltenMetal(ModFluids.MOLTEN_NETHERITE, BlockBehaviour.Properties.of().mapColor(MapColor.FIRE).replaceable().randomTicks().liquid().sound(SoundType.EMPTY).pushReaction(PushReaction.DESTROY).noCollission().strength(100f).noLootTable().lightLevel((blockStatex) -> 8).emissiveRendering(ModBlocks::always)));
    public static final Supplier<LiquidBlock> MOLTEN_ZINC = regBlock("molten_zinc", () ->
            MoltenMetalsPlatform.doMoltenMetal(ModFluids.MOLTEN_ZINC, BlockBehaviour.Properties.of().mapColor(MapColor.FIRE).replaceable().randomTicks().liquid().sound(SoundType.EMPTY).pushReaction(PushReaction.DESTROY).noCollission().strength(100f).noLootTable()));
    public static final Supplier<LiquidBlock> MOLTEN_BRASS = regBlock("molten_brass", () ->
            MoltenMetalsPlatform.doMoltenMetal(ModFluids.MOLTEN_BRASS, BlockBehaviour.Properties.of().mapColor(MapColor.FIRE).replaceable().randomTicks().liquid().sound(SoundType.EMPTY).pushReaction(PushReaction.DESTROY).noCollission().strength(100f).noLootTable().lightLevel((blockStatex) -> 8).emissiveRendering(ModBlocks::always)));

    public static final Supplier<LiquidBlock> MOLTEN_BISMUTH = regBlock("molten_bismuth", () ->
            MoltenMetalsPlatform.doMoltenMetal(ModFluids.MOLTEN_BISMUTH, BlockBehaviour.Properties.of().mapColor(MapColor.FIRE).replaceable().randomTicks().liquid().sound(SoundType.EMPTY).pushReaction(PushReaction.DESTROY).noCollission().strength(100f).noLootTable()));
    public static final Supplier<LiquidBlock> MOLTEN_SILVER = regBlock("molten_silver", () ->
        MoltenMetalsPlatform.doMoltenMetal(ModFluids.MOLTEN_SILVER, BlockBehaviour.Properties.of().mapColor(MapColor.FIRE).replaceable().randomTicks().liquid().sound(SoundType.EMPTY).pushReaction(PushReaction.DESTROY).noCollission().strength(100f).noLootTable().lightLevel((blockStatex) -> 8).emissiveRendering(ModBlocks::always)));
    public static final Supplier<LiquidBlock> MOLTEN_MERCURY = regBlock("molten_mercury", () ->
            MoltenMetalsPlatform.doMoltenMetal(ModFluids.MOLTEN_MERCURY, BlockBehaviour.Properties.of().mapColor(MapColor.FIRE).replaceable().randomTicks().liquid().sound(SoundType.EMPTY).pushReaction(PushReaction.DESTROY).noCollission().strength(100f).noLootTable()));
    public static final Supplier<LiquidBlock> MOLTEN_NECROMIUM = regBlock("molten_necromium", () ->
        MoltenMetalsPlatform.doMoltenMetal(ModFluids.MOLTEN_NECROMIUM, BlockBehaviour.Properties.of().mapColor(MapColor.FIRE).replaceable().randomTicks().liquid().sound(SoundType.EMPTY).pushReaction(PushReaction.DESTROY).noCollission().strength(100f).noLootTable().lightLevel((blockStatex) -> 8).emissiveRendering(ModBlocks::always)));
    public static final Supplier<LiquidBlock> MOLTEN_ELECTRUM = regBlock("molten_electrum", () ->
        MoltenMetalsPlatform.doMoltenMetal(ModFluids.MOLTEN_ELECTRUM, BlockBehaviour.Properties.of().mapColor(MapColor.FIRE).replaceable().randomTicks().liquid().sound(SoundType.EMPTY).pushReaction(PushReaction.DESTROY).noCollission().strength(100f).noLootTable().lightLevel((blockStatex) -> 8).emissiveRendering(ModBlocks::always)));
    public static final Supplier<LiquidBlock> MOLTEN_TIN = regBlock("molten_tin", () ->
        MoltenMetalsPlatform.doMoltenMetal(ModFluids.MOLTEN_TIN, BlockBehaviour.Properties.of().mapColor(MapColor.FIRE).replaceable().randomTicks().liquid().sound(SoundType.EMPTY).pushReaction(PushReaction.DESTROY).noCollission().strength(100f).noLootTable()));
    public static final Supplier<LiquidBlock> MOLTEN_BRONZE = regBlock("molten_bronze", () ->
        MoltenMetalsPlatform.doMoltenMetal(ModFluids.MOLTEN_BRONZE, BlockBehaviour.Properties.of().mapColor(MapColor.FIRE).replaceable().randomTicks().liquid().sound(SoundType.EMPTY).pushReaction(PushReaction.DESTROY).noCollission().strength(100f).noLootTable().lightLevel((blockStatex) -> 8).emissiveRendering(ModBlocks::always)));
    public static final Supplier<LiquidBlock> MOLTEN_STEEL = regBlock("molten_steel", () ->
        MoltenMetalsPlatform.doMoltenMetal(ModFluids.MOLTEN_STEEL, BlockBehaviour.Properties.of().mapColor(MapColor.FIRE).replaceable().randomTicks().liquid().sound(SoundType.EMPTY).pushReaction(PushReaction.DESTROY).noCollission().strength(100f).noLootTable().lightLevel((blockStatex) -> 8).emissiveRendering(ModBlocks::always)));


    public static final Supplier<MoldBlock> UNFIRED_CERAMIC_INGOT_MOLD = regMoldItem("unfired_ceramic_ingot_mold", () ->
        new MoldBlock(BlockBehaviour.Properties.of().instabreak().pushReaction(PushReaction.DESTROY).noOcclusion().sound(SoundType.CANDLE)));
    public static final Supplier<MoldBlock> CERAMIC_INGOT_MOLD = regMoldItem("ceramic_ingot_mold", () ->
        new MoldBlock(BlockBehaviour.Properties.of().instabreak().pushReaction(PushReaction.DESTROY).noOcclusion().sound(SoundType.DECORATED_POT)));
    public static final Supplier<MoldBlock> INGOT_MOLD = regMoldItem("ingot_mold", () ->
        new MoldBlock(BlockBehaviour.Properties.of().instabreak().pushReaction(PushReaction.DESTROY).noOcclusion().sound(SoundType.COPPER)));

    public static final Supplier<MoldBlock> MOLTEN_IRON_CERAMIC_INGOT_MOLD = regMoldItem("molten_iron_ceramic_ingot_mold", () ->
        new MoldBlock(BlockBehaviour.Properties.of().lightLevel((blockStatex) -> 4).instabreak().pushReaction(PushReaction.DESTROY).noOcclusion().sound(SoundType.DECORATED_POT).lightLevel((blockStatex) -> 8).emissiveRendering(ModBlocks::always)));
    public static final Supplier<MoldBlock> MOLTEN_COPPER_CERAMIC_INGOT_MOLD = regMoldItem("molten_copper_ceramic_ingot_mold", () ->
        new MoldBlock(BlockBehaviour.Properties.of().lightLevel((blockStatex) -> 4).instabreak().pushReaction(PushReaction.DESTROY).noOcclusion().sound(SoundType.DECORATED_POT).lightLevel((blockStatex) -> 8).emissiveRendering(ModBlocks::always)));
    public static final Supplier<MoldBlock> MOLTEN_GOLD_CERAMIC_INGOT_MOLD = regMoldItem("molten_gold_ceramic_ingot_mold", () ->
        new MoldBlock(BlockBehaviour.Properties.of().lightLevel((blockStatex) -> 4).instabreak().pushReaction(PushReaction.DESTROY).noOcclusion().sound(SoundType.DECORATED_POT)));
    public static final Supplier<MoldBlock> MOLTEN_NETHERITE_CERAMIC_INGOT_MOLD = regMoldItem("molten_netherite_ceramic_ingot_mold", () ->
        new MoldBlock(BlockBehaviour.Properties.of().lightLevel((blockStatex) -> 4).instabreak().pushReaction(PushReaction.DESTROY).noOcclusion().sound(SoundType.DECORATED_POT).lightLevel((blockStatex) -> 8).emissiveRendering(ModBlocks::always)));
    public static final Supplier<MoldBlock> MOLTEN_ZINC_CERAMIC_INGOT_MOLD = regMoldItem("molten_zinc_ceramic_ingot_mold", () ->
        new MoldBlock(BlockBehaviour.Properties.of().lightLevel((blockStatex) -> 4).instabreak().pushReaction(PushReaction.DESTROY).noOcclusion().sound(SoundType.DECORATED_POT)));
    public static final Supplier<MoldBlock> MOLTEN_BRASS_CERAMIC_INGOT_MOLD = regMoldItem("molten_brass_ceramic_ingot_mold", () ->
        new MoldBlock(BlockBehaviour.Properties.of().lightLevel((blockStatex) -> 4).instabreak().pushReaction(PushReaction.DESTROY).noOcclusion().sound(SoundType.DECORATED_POT).lightLevel((blockStatex) -> 8).emissiveRendering(ModBlocks::always)));
    public static final Supplier<MoldBlock> MOLTEN_SILVER_CERAMIC_INGOT_MOLD = regMoldItem("molten_silver_ceramic_ingot_mold", () ->
        new MoldBlock(BlockBehaviour.Properties.of().lightLevel((blockStatex) -> 4).instabreak().pushReaction(PushReaction.DESTROY).noOcclusion().sound(SoundType.DECORATED_POT).lightLevel((blockStatex) -> 8).emissiveRendering(ModBlocks::always)));
    public static final Supplier<MoldBlock> MOLTEN_LEAD_CERAMIC_INGOT_MOLD = regMoldItem("molten_lead_ceramic_ingot_mold", () ->
        new MoldBlock(BlockBehaviour.Properties.of().lightLevel((blockStatex) -> 4).instabreak().pushReaction(PushReaction.DESTROY).noOcclusion().sound(SoundType.DECORATED_POT).lightLevel((blockStatex) -> 8).emissiveRendering(ModBlocks::always)));
    public static final Supplier<MoldBlock> MOLTEN_BISMUTH_CERAMIC_INGOT_MOLD = regMoldItem("molten_bismuth_ceramic_ingot_mold", () ->
        new MoldBlock(BlockBehaviour.Properties.of().lightLevel((blockStatex) -> 4).instabreak().pushReaction(PushReaction.DESTROY).noOcclusion().sound(SoundType.DECORATED_POT)));
    public static final Supplier<MoldBlock> MOLTEN_ELECTRUM_CERAMIC_INGOT_MOLD = regMoldItem("molten_electrum_ceramic_ingot_mold", () ->
        new MoldBlock(BlockBehaviour.Properties.of().lightLevel((blockStatex) -> 4).instabreak().pushReaction(PushReaction.DESTROY).noOcclusion().sound(SoundType.DECORATED_POT).lightLevel((blockStatex) -> 8).emissiveRendering(ModBlocks::always)));
    public static final Supplier<MoldBlock> MOLTEN_NECROMIUM_CERAMIC_INGOT_MOLD = regMoldItem("molten_necromium_ceramic_ingot_mold", () ->
        new MoldBlock(BlockBehaviour.Properties.of().lightLevel((blockStatex) -> 4).instabreak().pushReaction(PushReaction.DESTROY).noOcclusion().sound(SoundType.DECORATED_POT).lightLevel((blockStatex) -> 8).emissiveRendering(ModBlocks::always)));
    public static final Supplier<MoldBlock> MOLTEN_TIN_CERAMIC_INGOT_MOLD = regMoldItem("molten_tin_ceramic_ingot_mold", () ->
        new MoldBlock(BlockBehaviour.Properties.of().lightLevel((blockStatex) -> 4).instabreak().pushReaction(PushReaction.DESTROY).noOcclusion().sound(SoundType.DECORATED_POT)));
    public static final Supplier<MoldBlock> MOLTEN_BRONZE_CERAMIC_INGOT_MOLD = regMoldItem("molten_bronze_ceramic_ingot_mold", () ->
        new MoldBlock(BlockBehaviour.Properties.of().lightLevel((blockStatex) -> 4).instabreak().pushReaction(PushReaction.DESTROY).noOcclusion().sound(SoundType.DECORATED_POT).lightLevel((blockStatex) -> 8).emissiveRendering(ModBlocks::always)));
    public static final Supplier<MoldBlock> MOLTEN_STEEL_CERAMIC_INGOT_MOLD = regMoldItem("molten_steel_ceramic_ingot_mold", () ->
        new MoldBlock(BlockBehaviour.Properties.of().lightLevel((blockStatex) -> 4).instabreak().pushReaction(PushReaction.DESTROY).noOcclusion().sound(SoundType.DECORATED_POT).lightLevel((blockStatex) -> 8).emissiveRendering(ModBlocks::always)));

    public static final Supplier<MoldBlock> MOLTEN_IRON_INGOT_MOLD = regMoldItem("molten_iron_ingot_mold", () ->
        new MoldBlock(BlockBehaviour.Properties.of().lightLevel((blockStatex) -> 4).instabreak().pushReaction(PushReaction.DESTROY).noOcclusion().sound(SoundType.COPPER).lightLevel((blockStatex) -> 8).emissiveRendering(ModBlocks::always)));
    public static final Supplier<MoldBlock> MOLTEN_COPPER_INGOT_MOLD = regMoldItem("molten_copper_ingot_mold", () ->
        new MoldBlock(BlockBehaviour.Properties.of().lightLevel((blockStatex) -> 4).instabreak().pushReaction(PushReaction.DESTROY).noOcclusion().sound(SoundType.COPPER).lightLevel((blockStatex) -> 8).emissiveRendering(ModBlocks::always)));
    public static final Supplier<MoldBlock> MOLTEN_GOLD_INGOT_MOLD = regMoldItem("molten_gold_ingot_mold", () ->
        new MoldBlock(BlockBehaviour.Properties.of().lightLevel((blockStatex) -> 4).instabreak().pushReaction(PushReaction.DESTROY).noOcclusion().sound(SoundType.COPPER)));
    public static final Supplier<MoldBlock> MOLTEN_NETHERITE_INGOT_MOLD = regMoldItem("molten_netherite_ingot_mold", () ->
        new MoldBlock(BlockBehaviour.Properties.of().lightLevel((blockStatex) -> 4).instabreak().pushReaction(PushReaction.DESTROY).noOcclusion().sound(SoundType.COPPER).lightLevel((blockStatex) -> 8).emissiveRendering(ModBlocks::always)));
    public static final Supplier<MoldBlock> MOLTEN_ZINC_INGOT_MOLD = regMoldItem("molten_zinc_ingot_mold", () ->
        new MoldBlock(BlockBehaviour.Properties.of().lightLevel((blockStatex) -> 4).instabreak().pushReaction(PushReaction.DESTROY).noOcclusion().sound(SoundType.COPPER)));
    public static final Supplier<MoldBlock> MOLTEN_BRASS_INGOT_MOLD = regMoldItem("molten_brass_ingot_mold", () ->
        new MoldBlock(BlockBehaviour.Properties.of().lightLevel((blockStatex) -> 4).instabreak().pushReaction(PushReaction.DESTROY).noOcclusion().sound(SoundType.COPPER).lightLevel((blockStatex) -> 8).emissiveRendering(ModBlocks::always)));
    public static final Supplier<MoldBlock> MOLTEN_SILVER_INGOT_MOLD = regMoldItem("molten_silver_ingot_mold", () ->
        new MoldBlock(BlockBehaviour.Properties.of().lightLevel((blockStatex) -> 4).instabreak().pushReaction(PushReaction.DESTROY).noOcclusion().sound(SoundType.COPPER).lightLevel((blockStatex) -> 8).emissiveRendering(ModBlocks::always)));
    public static final Supplier<MoldBlock> MOLTEN_LEAD_INGOT_MOLD = regMoldItem("molten_lead_ingot_mold", () ->
        new MoldBlock(BlockBehaviour.Properties.of().lightLevel((blockStatex) -> 4).instabreak().pushReaction(PushReaction.DESTROY).noOcclusion().sound(SoundType.COPPER).lightLevel((blockStatex) -> 8).emissiveRendering(ModBlocks::always)));
    public static final Supplier<MoldBlock> MOLTEN_BISMUTH_INGOT_MOLD = regMoldItem("molten_bismuth_ingot_mold", () ->
        new MoldBlock(BlockBehaviour.Properties.of().lightLevel((blockStatex) -> 4).instabreak().pushReaction(PushReaction.DESTROY).noOcclusion().sound(SoundType.COPPER)));
    public static final Supplier<MoldBlock> MOLTEN_ELECTRUM_INGOT_MOLD = regMoldItem("molten_electrum_ingot_mold", () ->
        new MoldBlock(BlockBehaviour.Properties.of().lightLevel((blockStatex) -> 4).instabreak().pushReaction(PushReaction.DESTROY).noOcclusion().sound(SoundType.COPPER).lightLevel((blockStatex) -> 8).emissiveRendering(ModBlocks::always)));
    public static final Supplier<MoldBlock> MOLTEN_NECROMIUM_INGOT_MOLD = regMoldItem("molten_necromium_ingot_mold", () ->
        new MoldBlock(BlockBehaviour.Properties.of().lightLevel((blockStatex) -> 4).instabreak().pushReaction(PushReaction.DESTROY).noOcclusion().sound(SoundType.COPPER).lightLevel((blockStatex) -> 8).emissiveRendering(ModBlocks::always)));
    public static final Supplier<MoldBlock> MOLTEN_TIN_INGOT_MOLD = regMoldItem("molten_tin_ingot_mold", () ->
        new MoldBlock(BlockBehaviour.Properties.of().lightLevel((blockStatex) -> 4).instabreak().pushReaction(PushReaction.DESTROY).noOcclusion().sound(SoundType.COPPER)));
    public static final Supplier<MoldBlock> MOLTEN_BRONZE_INGOT_MOLD = regMoldItem("molten_bronze_ingot_mold", () ->
        new MoldBlock(BlockBehaviour.Properties.of().lightLevel((blockStatex) -> 4).instabreak().pushReaction(PushReaction.DESTROY).noOcclusion().sound(SoundType.COPPER).lightLevel((blockStatex) -> 8).emissiveRendering(ModBlocks::always)));
    public static final Supplier<MoldBlock> MOLTEN_STEEL_INGOT_MOLD = regMoldItem("molten_steel_ingot_mold", () ->
        new MoldBlock(BlockBehaviour.Properties.of().lightLevel((blockStatex) -> 4).instabreak().pushReaction(PushReaction.DESTROY).noOcclusion().sound(SoundType.COPPER).lightLevel((blockStatex) -> 8).emissiveRendering(ModBlocks::always)));

    
    public static final Supplier<Block> SLAG_BLOCK = regWithItem("slag_block", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK)));

}
