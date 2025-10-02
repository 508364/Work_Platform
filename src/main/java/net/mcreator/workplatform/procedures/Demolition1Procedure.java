package net.mcreator.workplatform.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class Demolition1Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		String Interval_Position = "";
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		Interval_Position = ("/fill" + " " + Math.floor(x / 16) * 16 + " " + (y - 1) + " " + Math.floor(z / 16) * 16 + " " + (Math.floor(x / 16) * 16 + 15) + " " + (y - 1) + " " + (Math.floor(z / 16) * 16 + 15) + " ").replace(".0", "");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(
					new CommandSourceStack(CommandSource.NULL, new Vec3((Math.floor(x / 16) * 16), (y - 1), (Math.floor(z / 16) * 16)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					(Interval_Position + "air replace #wp:light"));
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(
					new CommandSourceStack(CommandSource.NULL, new Vec3((Math.floor(x / 16) * 16), (y - 1), (Math.floor(z / 16) * 16)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					(Interval_Position + "air replace #wp:high_strength_concrete"));
	}
}
