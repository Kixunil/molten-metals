package com.ordana.molten_metals.reg;

import com.ordana.molten_metals.MoltenMetals;
import com.ordana.molten_metals.configs.CommonConfigs;
import net.mehvahdjukaar.moonlight.api.misc.RegSupplier;
import net.mehvahdjukaar.moonlight.api.platform.PlatHelper;
import net.mehvahdjukaar.moonlight.api.platform.RegHelper;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.minecraft.world.level.ItemLike;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ModCreativeTabs {

    public static final RegSupplier<CreativeModeTab> MOD_TAB = !CommonConfigs.CREATIVE_TAB.get() ? null :
            RegHelper.registerCreativeModeTab(MoltenMetals.res("molten_metals"),
                    (c) -> c.title(Component.translatable("itemGroup.molten_metals"))
                            .icon(() -> ModItems.MOLTEN_IRON_BUCKET.get().getDefaultInstance()));


    public static void init() {
        RegHelper.addItemsToTabsRegistration(ModCreativeTabs::registerItemsToTabs);
    }

    public static void registerItemsToTabs(RegHelper.ItemToTabEvent e) {
        after(e, Items.WATER_BUCKET, CreativeModeTabs.TOOLS_AND_UTILITIES,
                ModItems.MOLTEN_IRON_BUCKET, ModItems.MOLTEN_COPPER_BUCKET, ModItems.MOLTEN_GOLD_BUCKET,
                ModItems.MOLTEN_NETHERITE_BUCKET, ModItems.MOLTEN_ZINC_BUCKET, ModItems.MOLTEN_BRASS_BUCKET
        );

        after(e, ModItems.MOLTEN_BRASS_BUCKET.get(), CreativeModeTabs.TOOLS_AND_UTILITIES,
            ModBlocks.UNFIRED_CERAMIC_INGOT_MOLD, ModBlocks.CERAMIC_INGOT_MOLD, ModBlocks.INGOT_MOLD,
            ModBlocks.MOLTEN_IRON_CERAMIC_INGOT_MOLD, ModBlocks.MOLTEN_COPPER_CERAMIC_INGOT_MOLD, ModBlocks.MOLTEN_GOLD_CERAMIC_INGOT_MOLD,
            ModBlocks.MOLTEN_NETHERITE_CERAMIC_INGOT_MOLD, ModBlocks.MOLTEN_ZINC_CERAMIC_INGOT_MOLD, ModBlocks.MOLTEN_BRASS_CERAMIC_INGOT_MOLD
        );

        after(e, ModBlocks.MOLTEN_BRASS_CERAMIC_INGOT_MOLD.get().asItem(), CreativeModeTabs.TOOLS_AND_UTILITIES,
            ModBlocks.MOLTEN_IRON_INGOT_MOLD, ModBlocks.MOLTEN_COPPER_INGOT_MOLD, ModBlocks.MOLTEN_GOLD_INGOT_MOLD,
            ModBlocks.MOLTEN_NETHERITE_INGOT_MOLD, ModBlocks.MOLTEN_ZINC_INGOT_MOLD, ModBlocks.MOLTEN_BRASS_INGOT_MOLD
        );

        after(e, Items.RAW_GOLD_BLOCK, CreativeModeTabs.NATURAL_BLOCKS,
            ModBlocks.SLAG_BLOCK
        );

        after(e, Items.RAW_GOLD, CreativeModeTabs.INGREDIENTS,
            ModItems.SLAG, ModItems.SLAG_NUGGET
        );


        //ETCETERA
        afterML(e, ModItems.MOLTEN_BRASS_BUCKET.get(), CreativeModeTabs.TOOLS_AND_UTILITIES, "etcetera",
                ModItems.MOLTEN_BISMUTH_BUCKET
        );
        afterML(e, ModBlocks.MOLTEN_BRASS_CERAMIC_INGOT_MOLD.get().asItem(), CreativeModeTabs.TOOLS_AND_UTILITIES, "etcetera",
            ModBlocks.MOLTEN_BISMUTH_CERAMIC_INGOT_MOLD
        );
        afterML(e, ModBlocks.MOLTEN_BRASS_INGOT_MOLD.get().asItem(), CreativeModeTabs.TOOLS_AND_UTILITIES, "etcetera",
            ModBlocks.MOLTEN_BISMUTH_INGOT_MOLD
        );

        //OREGANIZED
        afterML(e, ModItems.MOLTEN_BRASS_BUCKET.get(), CreativeModeTabs.TOOLS_AND_UTILITIES, "oreganized",
            ModItems.MOLTEN_SILVER_BUCKET, ModItems.MOLTEN_ELECTRUM_BUCKET
        );
        afterML(e, ModBlocks.MOLTEN_BRASS_CERAMIC_INGOT_MOLD.get().asItem(), CreativeModeTabs.TOOLS_AND_UTILITIES, "oreganized",
            ModBlocks.MOLTEN_LEAD_CERAMIC_INGOT_MOLD, ModBlocks.MOLTEN_SILVER_CERAMIC_INGOT_MOLD, ModBlocks.MOLTEN_ELECTRUM_CERAMIC_INGOT_MOLD
        );
        afterML(e, ModBlocks.MOLTEN_BRASS_INGOT_MOLD.get().asItem(), CreativeModeTabs.TOOLS_AND_UTILITIES, "oreganized",
            ModBlocks.MOLTEN_LEAD_INGOT_MOLD, ModBlocks.MOLTEN_SILVER_INGOT_MOLD, ModBlocks.MOLTEN_ELECTRUM_INGOT_MOLD
        );

        //GALOSPHERE
        afterML(e, ModItems.MOLTEN_BRASS_BUCKET.get(), CreativeModeTabs.TOOLS_AND_UTILITIES, "galosphere",
            ModItems.MOLTEN_SILVER_BUCKET
        );
        afterML(e, ModBlocks.MOLTEN_BRASS_CERAMIC_INGOT_MOLD.get().asItem(), CreativeModeTabs.TOOLS_AND_UTILITIES, "galosphere",
            ModBlocks.MOLTEN_SILVER_CERAMIC_INGOT_MOLD
        );
        afterML(e, ModBlocks.MOLTEN_BRASS_INGOT_MOLD.get().asItem(), CreativeModeTabs.TOOLS_AND_UTILITIES, "galosphere",
            ModBlocks.MOLTEN_SILVER_INGOT_MOLD
        );

        //CAVERNS & CHASMS
        afterML(e, ModItems.MOLTEN_BRASS_BUCKET.get(), CreativeModeTabs.TOOLS_AND_UTILITIES, "caverns_and_chasms",
            ModItems.MOLTEN_SILVER_BUCKET, ModItems.MOLTEN_NECROMIUM_BUCKET
        );
        afterML(e, ModBlocks.MOLTEN_BRASS_CERAMIC_INGOT_MOLD.get().asItem(), CreativeModeTabs.TOOLS_AND_UTILITIES, "caverns_and_chasms",
            ModBlocks.MOLTEN_SILVER_CERAMIC_INGOT_MOLD, ModBlocks.MOLTEN_NECROMIUM_CERAMIC_INGOT_MOLD
        );
        afterML(e, ModBlocks.MOLTEN_BRASS_INGOT_MOLD.get().asItem(), CreativeModeTabs.TOOLS_AND_UTILITIES, "caverns_and_chasms",
            ModBlocks.MOLTEN_SILVER_INGOT_MOLD, ModBlocks.MOLTEN_NECROMIUM_INGOT_MOLD
        );

        //DREAMS & DESIRES
        afterML(e, ModItems.MOLTEN_BRASS_BUCKET.get(), CreativeModeTabs.TOOLS_AND_UTILITIES, "create_dd",
            ModItems.MOLTEN_TIN_BUCKET, ModItems.MOLTEN_BRONZE_BUCKET, ModItems.MOLTEN_STEEL_BUCKET
        );
        afterML(e, ModBlocks.MOLTEN_BRASS_CERAMIC_INGOT_MOLD.get().asItem(), CreativeModeTabs.TOOLS_AND_UTILITIES, "create_dd",
            ModBlocks.MOLTEN_TIN_CERAMIC_INGOT_MOLD, ModBlocks.MOLTEN_BRONZE_CERAMIC_INGOT_MOLD, ModBlocks.MOLTEN_STEEL_CERAMIC_INGOT_MOLD
        );
        afterML(e, ModBlocks.MOLTEN_BRASS_INGOT_MOLD.get().asItem(), CreativeModeTabs.TOOLS_AND_UTILITIES, "create_dd",
            ModBlocks.MOLTEN_TIN_INGOT_MOLD, ModBlocks.MOLTEN_BRONZE_INGOT_MOLD, ModBlocks.MOLTEN_STEEL_INGOT_MOLD
        );

        //MERCURY
        after(e, ModItems.MOLTEN_BRASS_BUCKET.get(), CreativeModeTabs.TOOLS_AND_UTILITIES,
                ModItems.MOLTEN_MERCURY_BUCKET
        );
    }

    private static void after(RegHelper.ItemToTabEvent event, Item target,
                              ResourceKey<CreativeModeTab> tab, Supplier<?>... items) {
        after(event, i -> i.is(target), tab, items);
    }

    private static void after(RegHelper.ItemToTabEvent event, Predicate<ItemStack> targetPred,
                              ResourceKey<CreativeModeTab> tab, Supplier<?>... items) {
        ItemLike[] entries = Arrays.stream(items).map((s -> (ItemLike) (s.get()))).toArray(ItemLike[]::new);
        if(CommonConfigs.CREATIVE_TAB.get()){
            tab = MOD_TAB.getHolder().unwrapKey().get();
        }
        event.addAfter(tab, targetPred, entries);
    }

    private static void before(RegHelper.ItemToTabEvent event, Item target,
                               ResourceKey<CreativeModeTab> tab, String key, Supplier<?>... items) {
        before(event, i -> i.is(target), tab, key, items);
    }

    private static void before(RegHelper.ItemToTabEvent event, Predicate<ItemStack> targetPred,
                               ResourceKey<CreativeModeTab> tab, String key, Supplier<?>... items) {
        ItemLike[] entries = Arrays.stream(items).map(s -> (ItemLike) s.get()).toArray(ItemLike[]::new);
        if(CommonConfigs.CREATIVE_TAB.get()){
            tab = MOD_TAB.getHolder().unwrapKey().get();
        }
        event.addBefore(tab, targetPred, entries);
    }

    private static void afterML(RegHelper.ItemToTabEvent event, Item target,
                                ResourceKey<CreativeModeTab> tab, String modLoaded,
                                Supplier<?>... items) {
        if (PlatHelper.isModLoaded(modLoaded)) {
            after(event, target, tab, items);
        }
    }

    private static void beforeML(RegHelper.ItemToTabEvent event, Item target,
                                 ResourceKey<CreativeModeTab> tab,
                                 String key, String modLoaded,
                                 Supplier<?>... items) {
        if (PlatHelper.isModLoaded(modLoaded)) {
            before(event, target, tab, key, items);
        }
    }

}