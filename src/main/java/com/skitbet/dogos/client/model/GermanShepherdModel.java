package com.skitbet.dogos.client.model;

import com.skitbet.dogos.common.DogosMod;
import com.skitbet.dogos.common.entities.GermanShepherdEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class GermanShepherdModel extends GeoModel<GermanShepherdEntity> {

    @Override
    public Identifier getModelResource(GermanShepherdEntity animatable) {
        return new Identifier(DogosMod.MODID, "geo/german_shepherd.geo.json");
    }

    @Override
    public Identifier getTextureResource(GermanShepherdEntity animatable) {
        return new Identifier(DogosMod.MODID, "textures/entity/german_shepherd.png");
    }

    @Override
    public Identifier getAnimationResource(GermanShepherdEntity animatable) {
        return new Identifier(DogosMod.MODID, "animations/german_shepherd.animation.json");
    }

    @Override
    public void setCustomAnimations(GermanShepherdEntity animatable, long instanceId, AnimationState<GermanShepherdEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if (head != null) {
            EntityModelData entityModelData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
            head.setRotX(entityModelData.headPitch() * MathHelper.RADIANS_PER_DEGREE);
            head.setRotY(entityModelData.netHeadYaw() * MathHelper.RADIANS_PER_DEGREE);
        }
    }
}
