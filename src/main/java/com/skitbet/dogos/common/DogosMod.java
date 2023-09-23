package com.skitbet.dogos.common;

import com.skitbet.dogos.common.init.DogosBlocks;
import com.skitbet.dogos.common.init.DogosEntities;
import com.skitbet.dogos.common.init.DogosItems;
import com.skitbet.dogos.common.entities.GermanShepherdEntity;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class DogosMod implements ModInitializer {
    public static String MODID = "dogos";

    @Override
    public void onInitialize() {
        DogosBlocks.init();
        DogosItems.init();

        FabricDefaultAttributeRegistry.register(DogosEntities.GERMAN_SHEPHERD, GermanShepherdEntity.setAttributes());
    }
}
