package net.mcreator.workplatform.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.workplatform.init.WorkPlatformModBlocks;

public class Replaceableblock1Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.WHITE_CONCRETE.asItem()) == true) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z), WorkPlatformModBlocks.WHITE_HIGH_STRENGTH_CONCRETE.get().defaultBlockState(), 3);
		} else if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.ORANGE_CONCRETE.asItem()) == true) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z), WorkPlatformModBlocks.ORANGE_HIGH_STRENGTH_CONCRETE.get().defaultBlockState(), 3);
		} else if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.MAGENTA_CONCRETE.asItem()) == true) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z), WorkPlatformModBlocks.MAGENTA_HIGH_STRENGTH_CONCRETE.get().defaultBlockState(), 3);
		} else if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.LIGHT_BLUE_CONCRETE.asItem()) == true) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z), WorkPlatformModBlocks.LIGHT_BLUE_HIGH_STRENGTH_CONCRETE.get().defaultBlockState(), 3);
		} else if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.YELLOW_CONCRETE.asItem()) == true) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z), WorkPlatformModBlocks.YELLOW_HIGH_STRENGTH_CONCRETE.get().defaultBlockState(), 3);
		} else if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.LIME_CONCRETE.asItem()) == true) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z), WorkPlatformModBlocks.LIME_HIGH_STRENGTH_CONCRETE.get().defaultBlockState(), 3);
		} else if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.PINK_CONCRETE.asItem()) == true) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z), WorkPlatformModBlocks.PINK_HIGH_STRENGTH_CONCRETE.get().defaultBlockState(), 3);
		} else if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.GRAY_CONCRETE.asItem()) == true) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z), WorkPlatformModBlocks.GRAY_HIGH_STRENGTH_CONCRETE.get().defaultBlockState(), 3);
		} else if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.LIGHT_GRAY_CONCRETE.asItem()) == true) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z), WorkPlatformModBlocks.LIGHT_GRAY_HIGH_STRENGTH_CONCRETE.get().defaultBlockState(), 3);
		} else if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.PURPLE_CONCRETE.asItem()) == true) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z), WorkPlatformModBlocks.PURPLE_HIGH_STRENGTH_CONCRETE.get().defaultBlockState(), 3);
		} else if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.BLUE_CONCRETE.asItem()) == true) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z), WorkPlatformModBlocks.BLUE_HIGH_STRENGTH_CONCRETE.get().defaultBlockState(), 3);
		} else if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.BROWN_CONCRETE.asItem()) == true) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z), WorkPlatformModBlocks.BROWN_HIGH_STRENGTH_CONCRETE.get().defaultBlockState(), 3);
		} else if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.GREEN_CONCRETE.asItem()) == true) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z), WorkPlatformModBlocks.GREEN_HIGH_STRENGTH_CONCRETE.get().defaultBlockState(), 3);
		} else if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.RED_CONCRETE.asItem()) == true) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z), WorkPlatformModBlocks.RED_HIGH_STRENGTH_CONCRETE.get().defaultBlockState(), 3);
		} else if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.BLACK_CONCRETE.asItem()) == true) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z), WorkPlatformModBlocks.BLACK_HIGH_STRENGTH_CONCRETE.get().defaultBlockState(), 3);
		}
	}
}
