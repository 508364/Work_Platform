
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.workplatform.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.workplatform.WorkPlatformMod;

public class WorkPlatformModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, WorkPlatformMod.MODID);
	public static final RegistryObject<Item> WORKPLATFORM = block(WorkPlatformModBlocks.WORKPLATFORM);
	public static final RegistryObject<Item> WORKPLATFORMLIGHTING = block(WorkPlatformModBlocks.WORKPLATFORMLIGHTING);
	public static final RegistryObject<Item> DEMOLITION = block(WorkPlatformModBlocks.DEMOLITION);
	public static final RegistryObject<Item> WORKPLATFORMBIG = block(WorkPlatformModBlocks.WORKPLATFORMBIG);
	public static final RegistryObject<Item> WORKPLATFORMBIGLIGHTING = block(WorkPlatformModBlocks.WORKPLATFORMBIGLIGHTING);
	public static final RegistryObject<Item> WHITE_HIGH_STRENGTH_CONCRETE = block(WorkPlatformModBlocks.WHITE_HIGH_STRENGTH_CONCRETE);
	public static final RegistryObject<Item> ORANGE_HIGH_STRENGTH_CONCRETE = block(WorkPlatformModBlocks.ORANGE_HIGH_STRENGTH_CONCRETE);
	public static final RegistryObject<Item> MAGENTA_HIGH_STRENGTH_CONCRETE = block(WorkPlatformModBlocks.MAGENTA_HIGH_STRENGTH_CONCRETE);
	public static final RegistryObject<Item> LIGHT_BLUE_HIGH_STRENGTH_CONCRETE = block(WorkPlatformModBlocks.LIGHT_BLUE_HIGH_STRENGTH_CONCRETE);
	public static final RegistryObject<Item> YELLOW_HIGH_STRENGTH_CONCRETE = block(WorkPlatformModBlocks.YELLOW_HIGH_STRENGTH_CONCRETE);
	public static final RegistryObject<Item> LIME_HIGH_STRENGTH_CONCRETE = block(WorkPlatformModBlocks.LIME_HIGH_STRENGTH_CONCRETE);
	public static final RegistryObject<Item> PINK_HIGH_STRENGTH_CONCRETE = block(WorkPlatformModBlocks.PINK_HIGH_STRENGTH_CONCRETE);
	public static final RegistryObject<Item> GRAY_HIGH_STRENGTH_CONCRETE = block(WorkPlatformModBlocks.GRAY_HIGH_STRENGTH_CONCRETE);
	public static final RegistryObject<Item> LIGHT_GRAY_HIGH_STRENGTH_CONCRETE = block(WorkPlatformModBlocks.LIGHT_GRAY_HIGH_STRENGTH_CONCRETE);
	public static final RegistryObject<Item> CYAN_HIGH_STRENGTH_CONCRETE = block(WorkPlatformModBlocks.CYAN_HIGH_STRENGTH_CONCRETE);
	public static final RegistryObject<Item> PURPLE_HIGH_STRENGTH_CONCRETE = block(WorkPlatformModBlocks.PURPLE_HIGH_STRENGTH_CONCRETE);
	public static final RegistryObject<Item> BLUE_HIGH_STRENGTH_CONCRETE = block(WorkPlatformModBlocks.BLUE_HIGH_STRENGTH_CONCRETE);
	public static final RegistryObject<Item> BROWN_HIGH_STRENGTH_CONCRETE = block(WorkPlatformModBlocks.BROWN_HIGH_STRENGTH_CONCRETE);
	public static final RegistryObject<Item> GREEN_HIGH_STRENGTH_CONCRETE = block(WorkPlatformModBlocks.GREEN_HIGH_STRENGTH_CONCRETE);
	public static final RegistryObject<Item> RED_HIGH_STRENGTH_CONCRETE = block(WorkPlatformModBlocks.RED_HIGH_STRENGTH_CONCRETE);
	public static final RegistryObject<Item> BLACK_HIGH_STRENGTH_CONCRETE = block(WorkPlatformModBlocks.BLACK_HIGH_STRENGTH_CONCRETE);
	public static final RegistryObject<Item> LIGHTPANEL = block(WorkPlatformModBlocks.LIGHTPANEL);
	public static final RegistryObject<Item> SEARCHLIGHT = block(WorkPlatformModBlocks.SEARCHLIGHT);
	public static final RegistryObject<Item> LIGHTTUBE = block(WorkPlatformModBlocks.LIGHTTUBE);
	public static final RegistryObject<Item> HIGHSTRENGTHLIGHT = block(WorkPlatformModBlocks.HIGHSTRENGTHLIGHT);
	public static final RegistryObject<Item> REPLACEABLEBLOCK = block(WorkPlatformModBlocks.REPLACEABLEBLOCK);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
