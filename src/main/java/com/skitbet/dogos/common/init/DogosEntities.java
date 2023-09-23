package com.skitbet.dogos.common.init;

import com.skitbet.dogos.common.DogosMod;
import com.skitbet.dogos.common.entities.GermanShepherdEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class DogosEntities {
    public static final EntityType<GermanShepherdEntity> GERMAN_SHEPHERD = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(DogosMod.MODID, "german_shepherd"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, GermanShepherdEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 1f)).build());;


}
