package com.skitbet.dogos.client;

import com.skitbet.dogos.client.renderer.GermanShepherdRenderer;
import com.skitbet.dogos.common.init.DogosBlocks;
import com.skitbet.dogos.common.init.DogosEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;

public class DogosClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(DogosBlocks.WHITE_BOWL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DogosBlocks.BLUE_BOWL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DogosBlocks.RED_BOWL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DogosBlocks.AQUA_BOWL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DogosBlocks.GREEN_BOWL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DogosBlocks.ORANGE_BOWL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DogosBlocks.PINK_BOWL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DogosBlocks.YELLOW_BOWL, RenderLayer.getCutout());

        EntityRendererRegistry.register(DogosEntities.GERMAN_SHEPHERD, GermanShepherdRenderer::new);
    }
}
