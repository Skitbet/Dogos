package com.skitbet.dogos.client.renderer;

import com.skitbet.dogos.client.model.GermanShepherdModel;
import com.skitbet.dogos.common.DogosMod;
import com.skitbet.dogos.common.entities.GermanShepherdEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class GermanShepherdRenderer extends GeoEntityRenderer<GermanShepherdEntity> {

    public GermanShepherdRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new GermanShepherdModel());
    }

    @Override
    public Identifier getTextureLocation(GermanShepherdEntity animatable) {
        return new Identifier(DogosMod.MODID, "textures/entity/german_shepherd.png");
    }

    @Override
    public void render(GermanShepherdEntity entity, float entityYaw, float partialTick, MatrixStack poseStack, VertexConsumerProvider bufferSource, int packedLight) {
        if (entity.isBaby()) {
            poseStack.scale(0.65f, 0.65f, 0.65f);
        }else{
            poseStack.scale(1.2f,1.2f,1.2f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
