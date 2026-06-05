package com.ordana.molten_metals.reg;

import com.ordana.molten_metals.MoltenMetals;
import com.ordana.molten_metals.items.MoltenMetalBucketItem;
import net.mehvahdjukaar.moonlight.api.platform.RegHelper;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class ModItems {

    public static void init() {
    }

    public static <T extends Item> Supplier<T> regItem(String name, Supplier<T> itemSup) {
        return RegHelper.registerItem(MoltenMetals.res(name), itemSup);
    }

    //Buckets
    public static final Supplier<Item> MOLTEN_IRON_BUCKET = regItem("molten_iron_bucket", () ->
        new MoltenMetalBucketItem(ModFluids.MOLTEN_IRON, (new Item.Properties().stacksTo(1))));
    public static final Supplier<Item> MOLTEN_COPPER_BUCKET = regItem("molten_copper_bucket", () ->
        new MoltenMetalBucketItem(ModFluids.MOLTEN_COPPER, (new Item.Properties().stacksTo(1))));
    public static final Supplier<Item> MOLTEN_GOLD_BUCKET = regItem("molten_gold_bucket", () ->
        new MoltenMetalBucketItem(ModFluids.MOLTEN_GOLD, (new Item.Properties().stacksTo(1))));
    public static final Supplier<Item> MOLTEN_NETHERITE_BUCKET = regItem("molten_netherite_bucket", () ->
        new MoltenMetalBucketItem(ModFluids.MOLTEN_NETHERITE, (new Item.Properties().stacksTo(1))));
    public static final Supplier<Item> MOLTEN_ZINC_BUCKET = regItem("molten_zinc_bucket", () ->
        new MoltenMetalBucketItem(ModFluids.MOLTEN_ZINC, (new Item.Properties().stacksTo(1))));
    public static final Supplier<Item> MOLTEN_BRASS_BUCKET = regItem("molten_brass_bucket", () ->
        new MoltenMetalBucketItem(ModFluids.MOLTEN_BRASS, (new Item.Properties().stacksTo(1))));

    public static final Supplier<Item> MOLTEN_SILVER_BUCKET = regItem("molten_silver_bucket", () ->
        new MoltenMetalBucketItem(ModFluids.MOLTEN_SILVER, (new Item.Properties().stacksTo(1))));
    public static final Supplier<Item> MOLTEN_BISMUTH_BUCKET = regItem("molten_bismuth_bucket", () ->
        new MoltenMetalBucketItem(ModFluids.MOLTEN_BISMUTH, (new Item.Properties().stacksTo(1))));
    public static final Supplier<Item> MOLTEN_MERCURY_BUCKET = regItem("molten_mercury_bucket", () ->
        new MoltenMetalBucketItem(ModFluids.MOLTEN_MERCURY, (new Item.Properties().stacksTo(1))));
    public static final Supplier<Item> MOLTEN_ELECTRUM_BUCKET = regItem("molten_electrum_bucket", () ->
        new MoltenMetalBucketItem(ModFluids.MOLTEN_ELECTRUM, (new Item.Properties().stacksTo(1))));
    public static final Supplier<Item> MOLTEN_NECROMIUM_BUCKET = regItem("molten_necromium_bucket", () ->
        new MoltenMetalBucketItem(ModFluids.MOLTEN_NECROMIUM, (new Item.Properties().stacksTo(1))));
    public static final Supplier<Item> MOLTEN_TIN_BUCKET = regItem("molten_tin_bucket", () ->
        new MoltenMetalBucketItem(ModFluids.MOLTEN_TIN, (new Item.Properties().stacksTo(1))));
    public static final Supplier<Item> MOLTEN_BRONZE_BUCKET = regItem("molten_bronze_bucket", () ->
        new MoltenMetalBucketItem(ModFluids.MOLTEN_BRONZE, (new Item.Properties().stacksTo(1))));
    public static final Supplier<Item> MOLTEN_STEEL_BUCKET = regItem("molten_steel_bucket", () ->
        new MoltenMetalBucketItem(ModFluids.MOLTEN_STEEL, (new Item.Properties().stacksTo(1))));

    /*
    //Molds
    public static final Supplier<Item> UNFIRED_CERAMIC_INGOT_MOLD = regItem("unfired_ceramic_ingot_mold", () ->
        new Item(new Item.Properties().stacksTo(16)));
    public static final Supplier<Item> CERAMIC_INGOT_MOLD = regItem("ceramic_ingot_mold", () ->
        new Item(new Item.Properties().stacksTo(16)));
    public static final Supplier<Item> INGOT_MOLD = regItem("ingot_mold", () ->
        new Item(new Item.Properties().stacksTo(16)));


    //Filled Ceramic Molds
    public static final Supplier<Item> MOLTEN_IRON_CERAMIC_INGOT_MOLD = regItem("molten_iron_ceramic_ingot_mold", () ->
        new Item(new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> MOLTEN_COPPER_CERAMIC_INGOT_MOLD = regItem("molten_copper_ceramic_ingot_mold", () ->
        new Item(new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> MOLTEN_GOLD_CERAMIC_INGOT_MOLD = regItem("molten_gold_ceramic_ingot_mold", () ->
        new Item(new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> MOLTEN_NETHERITE_CERAMIC_INGOT_MOLD = regItem("molten_netherite_ceramic_ingot_mold", () ->
        new Item(new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> MOLTEN_ZINC_CERAMIC_INGOT_MOLD = regItem("molten_zinc_ceramic_ingot_mold", () ->
        new Item(new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> MOLTEN_BRASS_CERAMIC_INGOT_MOLD = regItem("molten_brass_ceramic_ingot_mold", () ->
        new Item(new Item.Properties().stacksTo(1)));

    public static final Supplier<Item> MOLTEN_SILVER_CERAMIC_INGOT_MOLD = regItem("molten_silver_ceramic_ingot_mold", () ->
        new Item(new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> MOLTEN_LEAD_CERAMIC_INGOT_MOLD = regItem("molten_lead_ceramic_ingot_mold", () ->
        new Item(new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> MOLTEN_BISMUTH_CERAMIC_INGOT_MOLD = regItem("molten_bismuth_ceramic_ingot_mold", () ->
        new Item(new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> MOLTEN_ELECTRUM_CERAMIC_INGOT_MOLD = regItem("molten_electrum_ceramic_ingot_mold", () ->
        new Item(new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> MOLTEN_NECROMIUM_CERAMIC_INGOT_MOLD = regItem("molten_necromium_ceramic_ingot_mold", () ->
        new Item(new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> MOLTEN_TIN_CERAMIC_INGOT_MOLD = regItem("molten_tin_ceramic_ingot_mold", () ->
        new Item(new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> MOLTEN_BRONZE_CERAMIC_INGOT_MOLD = regItem("molten_bronze_ceramic_ingot_mold", () ->
        new Item(new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> MOLTEN_STEEL_CERAMIC_INGOT_MOLD = regItem("molten_steel_ceramic_ingot_mold", () ->
        new Item(new Item.Properties().stacksTo(1)));

    //Filled Iron Molds
    public static final Supplier<Item> MOLTEN_IRON_INGOT_MOLD = regItem("molten_iron_ingot_mold", () ->
        new Item(new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> MOLTEN_COPPER_INGOT_MOLD = regItem("molten_copper_ingot_mold", () ->
        new Item(new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> MOLTEN_GOLD_INGOT_MOLD = regItem("molten_gold_ingot_mold", () ->
        new Item(new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> MOLTEN_NETHERITE_INGOT_MOLD = regItem("molten_netherite_ingot_mold", () ->
        new Item(new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> MOLTEN_ZINC_INGOT_MOLD = regItem("molten_zinc_ingot_mold", () ->
        new Item(new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> MOLTEN_BRASS_INGOT_MOLD = regItem("molten_brass_ingot_mold", () ->
        new Item(new Item.Properties().stacksTo(1)));

    public static final Supplier<Item> MOLTEN_SILVER_INGOT_MOLD = regItem("molten_silver_ingot_mold", () ->
        new Item(new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> MOLTEN_LEAD_INGOT_MOLD = regItem("molten_lead_ingot_mold", () ->
        new Item(new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> MOLTEN_BISMUTH_INGOT_MOLD = regItem("molten_bismuth_ingot_mold", () ->
        new Item(new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> MOLTEN_ELECTRUM_INGOT_MOLD = regItem("molten_electrum_ingot_mold", () ->
        new Item(new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> MOLTEN_NECROMIUM_INGOT_MOLD = regItem("molten_necromium_ingot_mold", () ->
        new Item(new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> MOLTEN_TIN_INGOT_MOLD = regItem("molten_tin_ingot_mold", () ->
        new Item(new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> MOLTEN_BRONZE_INGOT_MOLD = regItem("molten_bronze_ingot_mold", () ->
        new Item(new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> MOLTEN_STEEL_INGOT_MOLD = regItem("molten_steel_ingot_mold", () ->
        new Item(new Item.Properties().stacksTo(1)));

     */

    //Slag
    public static final Supplier<Item> SLAG = regItem("slag", () ->
        new Item(new Item.Properties()));
    public static final Supplier<Item> SLAG_NUGGET = regItem("slag_nugget", () ->
        new Item(new Item.Properties()));
}

