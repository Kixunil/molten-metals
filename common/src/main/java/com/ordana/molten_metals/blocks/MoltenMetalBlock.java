package com.ordana.molten_metals.blocks;

import com.ordana.molten_metals.reg.ModBlocks;
import com.ordana.molten_metals.reg.ModFluids;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FlowingFluid;

import java.util.function.Supplier;

public class MoltenMetalBlock extends LiquidBlock {
    private final Supplier<FlowingFluid> fluidSupplier;

    public MoltenMetalBlock(Supplier<FlowingFluid> flowingFluid, Properties properties) {
        super(flowingFluid.get(), properties);
        this.fluidSupplier = flowingFluid;
    }

    public boolean isRandomlyTicking(BlockState state) {
        return state.getFluidState().isRandomlyTicking();
    }

    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        state.getFluidState().randomTick(level, pos, random);
    }

    public void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
        if (!level.isClientSide && this.fluidSupplier.get().isSame(ModFluids.MOLTEN_MERCURY.get())) {
            if (entity instanceof LivingEntity) {
                LivingEntity livingEntity = (LivingEntity)entity;
                livingEntity.addEffect(new MobEffectInstance(MobEffects.POISON, 80, 2));
            }
        }
    }

    @Override
    public void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean movedByPiston) {
        if (this.shouldSpreadLiquid(level, pos, state)) {
            level.scheduleTick(pos, state.getFluidState().getType(), this.fluidSupplier.get().getTickDelay(level));
        }
    }

    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block neighborBlock, BlockPos neighborPos, boolean movedByPiston) {
        if (this.shouldSpreadLiquid(level, pos, state)) {
            level.scheduleTick(pos, state.getFluidState().getType(), this.fluidSupplier.get().getTickDelay(level));
        }
    }

    private boolean shouldSpreadLiquid(Level level, BlockPos pos, BlockState state) {

        for (Direction direction : POSSIBLE_FLOW_DIRECTIONS) {
            BlockPos blockPos = pos.relative(direction.getOpposite());
            if (level.getBlockState(blockPos).getBlock() instanceof MoltenMetalBlock && level.getBlockState(blockPos).getBlock() != this) {
                level.setBlockAndUpdate(pos, ModBlocks.SLAG_BLOCK.get().defaultBlockState());
                this.fizz(level, pos);
                return false;
            }
        }

        return true;
    }

    private void fizz(LevelAccessor level, BlockPos pos) {
        level.levelEvent(1501, pos, 0);
    }
}