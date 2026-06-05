package com.ordana.molten_metals.configs;

import com.ordana.molten_metals.MoltenMetals;
import net.mehvahdjukaar.moonlight.api.platform.configs.ConfigBuilder;
import net.mehvahdjukaar.moonlight.api.platform.configs.ConfigType;
import net.mehvahdjukaar.moonlight.api.platform.configs.ModConfigHolder;

import java.util.function.Supplier;

public class CommonConfigs {
    public static ModConfigHolder SERVER_SPEC;

    public static Supplier<Boolean> CREATIVE_TAB;


    public static void init() {
        // bump class load init
    }

    static {
        ConfigBuilder builder = ConfigBuilder.create(MoltenMetals.res("common"), ConfigType.COMMON);

        builder.push("misc");
        CREATIVE_TAB = builder.define("creative_tab", false);
        builder.pop();

        SERVER_SPEC = builder.build();
        SERVER_SPEC.forceLoad();
    }
}