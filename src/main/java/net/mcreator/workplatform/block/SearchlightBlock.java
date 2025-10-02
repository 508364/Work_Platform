
package net.mcreator.workplatform.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.FaceAttachedHorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.entity.Mob;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class SearchlightBlock extends Block implements SimpleWaterloggedBlock {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	public static final EnumProperty<AttachFace> FACE = FaceAttachedHorizontalDirectionalBlock.FACE;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	public SearchlightBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GLASS).strength(20f, 600f).lightLevel(s -> 15).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(FACE, AttachFace.WALL).setValue(WATERLOGGED, false));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return state.getFluidState().isEmpty();
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> switch (state.getValue(FACE)) {
				case FLOOR -> Shapes.or(box(3, 5, 0, 13, 12, 1), box(12, 7, 1, 13, 9, 4), box(3, 7, 1, 4, 9, 4), box(2, 1.81074, 2.95148, 14, 11.81074, 3.95148));
				case WALL -> Shapes.or(box(3, 15, 5, 13, 16, 12), box(12, 12, 7, 13, 15, 9), box(3, 12, 7, 4, 15, 9), box(2, 12.04852, 1.81074, 14, 13.04852, 11.81074));
				case CEILING -> Shapes.or(box(3, 4, 0, 13, 11, 1), box(3, 7, 1, 4, 9, 4), box(12, 7, 1, 13, 9, 4), box(2, 4.18926, 2.95148, 14, 14.18926, 3.95148));
			};
			case NORTH -> switch (state.getValue(FACE)) {
				case FLOOR -> Shapes.or(box(3, 5, 15, 13, 12, 16), box(3, 7, 12, 4, 9, 15), box(12, 7, 12, 13, 9, 15), box(2, 1.81074, 12.04852, 14, 11.81074, 13.04852));
				case WALL -> Shapes.or(box(3, 15, 4, 13, 16, 11), box(3, 12, 7, 4, 15, 9), box(12, 12, 7, 13, 15, 9), box(2, 12.04852, 4.18926, 14, 13.04852, 14.18926));
				case CEILING -> Shapes.or(box(3, 4, 15, 13, 11, 16), box(12, 7, 12, 13, 9, 15), box(3, 7, 12, 4, 9, 15), box(2, 4.18926, 12.04852, 14, 14.18926, 13.04852));
			};
			case EAST -> switch (state.getValue(FACE)) {
				case FLOOR -> Shapes.or(box(0, 5, 3, 1, 12, 13), box(1, 7, 3, 4, 9, 4), box(1, 7, 12, 4, 9, 13), box(2.95148, 1.81074, 2, 3.95148, 11.81074, 14));
				case WALL -> Shapes.or(box(5, 15, 3, 12, 16, 13), box(7, 12, 3, 9, 15, 4), box(7, 12, 12, 9, 15, 13), box(1.81074, 12.04852, 2, 11.81074, 13.04852, 14));
				case CEILING -> Shapes.or(box(0, 4, 3, 1, 11, 13), box(1, 7, 12, 4, 9, 13), box(1, 7, 3, 4, 9, 4), box(2.95148, 4.18926, 2, 3.95148, 14.18926, 14));
			};
			case WEST -> switch (state.getValue(FACE)) {
				case FLOOR -> Shapes.or(box(15, 5, 3, 16, 12, 13), box(12, 7, 12, 15, 9, 13), box(12, 7, 3, 15, 9, 4), box(12.04852, 1.81074, 2, 13.04852, 11.81074, 14));
				case WALL -> Shapes.or(box(4, 15, 3, 11, 16, 13), box(7, 12, 12, 9, 15, 13), box(7, 12, 3, 9, 15, 4), box(4.18926, 12.04852, 2, 14.18926, 13.04852, 14));
				case CEILING -> Shapes.or(box(15, 4, 3, 16, 11, 13), box(12, 7, 3, 15, 9, 4), box(12, 7, 12, 15, 9, 13), box(12.04852, 4.18926, 2, 13.04852, 14.18926, 14));
			};
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING, FACE, WATERLOGGED);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		boolean flag = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;
		return super.getStateForPlacement(context).setValue(FACE, faceForDirection(context.getNearestLookingDirection())).setValue(FACING, context.getHorizontalDirection().getOpposite()).setValue(WATERLOGGED, flag);
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	private AttachFace faceForDirection(Direction direction) {
		if (direction.getAxis() == Direction.Axis.Y)
			return direction == Direction.UP ? AttachFace.CEILING : AttachFace.FLOOR;
		else
			return AttachFace.WALL;
	}

	@Override
	public FluidState getFluidState(BlockState state) {
		return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
	}

	@Override
	public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos, BlockPos facingPos) {
		if (state.getValue(WATERLOGGED)) {
			world.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
		}
		return super.updateShape(state, facing, facingState, world, currentPos, facingPos);
	}

	@Override
	public BlockPathTypes getBlockPathType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
		return BlockPathTypes.UNPASSABLE_RAIL;
	}
}
