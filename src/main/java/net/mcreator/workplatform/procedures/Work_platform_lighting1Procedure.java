package net.mcreator.workplatform.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class Work_platform_lighting1Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double a = 0;
		double b = 0;
		a = 16;
		b = 16;
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("work_platform", "2"));
			if (template != null) {
				template.placeInWorld(_serverworld, BlockPos.containing(Math.floor(x / 16) * 16, y, Math.floor(z / 16) * 16), BlockPos.containing(Math.floor(x / 16) * 16, y, Math.floor(z / 16) * 16),
						new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
			}
		}
		for (int index0 = 0; index0 < 3; index0++) {
			for (int index1 = 0; index1 < 3; index1++) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("work_platform", "2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(Math.floor((x + a) / 16) * 16, y, Math.floor((z + b) / 16) * 16), BlockPos.containing(Math.floor((x + a) / 16) * 16, y, Math.floor((z + b) / 16) * 16),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
				a = a - 16;
			}
			a = 16;
			b = b - 16;
		}
		a = 16;
		b = 16;
	}
}
