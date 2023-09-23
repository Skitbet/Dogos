package com.skitbet.dogos.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

import java.util.stream.Stream;

public class BowlBlock extends Block {

    public BowlBlock(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return Stream.of(
                Block.createCuboidShape(1, 0, 1, 15, 3, 15),
                Block.createCuboidShape(1, 3, 1, 3, 6, 15),
                Block.createCuboidShape(3, 3, 1, 13, 6, 3),
                Block.createCuboidShape(3, 3, 13, 13, 6, 15),
                Block.createCuboidShape(13, 3, 1, 15, 6, 15)
        ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    }

}
