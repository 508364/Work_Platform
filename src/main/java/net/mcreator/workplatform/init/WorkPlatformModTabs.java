
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.workplatform.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.workplatform.WorkPlatformMod;

public class WorkPlatformModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WorkPlatformMod.MODID);
	public static final RegistryObject<CreativeModeTab> PLATFORM = REGISTRY.register("platform",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.work_platform.platform")).icon(() -> new ItemStack(WorkPlatformModItems.WORKPLATFORM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(WorkPlatformModItems.WORKPLATFORM.get());
				tabData.accept(WorkPlatformModItems.WORKPLATFORMLIGHTING.get());
				tabData.accept(WorkPlatformModItems.WORKPLATFORMBIG.get());
				tabData.accept(WorkPlatformModItems.WORKPLATFORMBIGLIGHTING.get());
				tabData.accept(WorkPlatformModItems.DEMOLITION.get());
			}).build());
	public static final RegistryObject<CreativeModeTab> HARDENEDCONCRETE = REGISTRY.register("hardenedconcrete",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.work_platform.hardenedconcrete")).icon(() -> new ItemStack(Blocks.WHITE_CONCRETE)).displayItems((parameters, tabData) -> {
				tabData.accept(WorkPlatformModItems.WHITE_HIGH_STRENGTH_CONCRETE.get());
				tabData.accept(WorkPlatformModItems.ORANGE_HIGH_STRENGTH_CONCRETE.get());
				tabData.accept(WorkPlatformModItems.MAGENTA_HIGH_STRENGTH_CONCRETE.get());
				tabData.accept(WorkPlatformModItems.LIGHT_BLUE_HIGH_STRENGTH_CONCRETE.get());
				tabData.accept(WorkPlatformModItems.YELLOW_HIGH_STRENGTH_CONCRETE.get());
				tabData.accept(WorkPlatformModItems.LIME_HIGH_STRENGTH_CONCRETE.get());
				tabData.accept(WorkPlatformModItems.PINK_HIGH_STRENGTH_CONCRETE.get());
				tabData.accept(WorkPlatformModItems.GRAY_HIGH_STRENGTH_CONCRETE.get());
				tabData.accept(WorkPlatformModItems.LIGHT_GRAY_HIGH_STRENGTH_CONCRETE.get());
				tabData.accept(WorkPlatformModItems.CYAN_HIGH_STRENGTH_CONCRETE.get());
				tabData.accept(WorkPlatformModItems.PURPLE_HIGH_STRENGTH_CONCRETE.get());
				tabData.accept(WorkPlatformModItems.BLUE_HIGH_STRENGTH_CONCRETE.get());
				tabData.accept(WorkPlatformModItems.BROWN_HIGH_STRENGTH_CONCRETE.get());
				tabData.accept(WorkPlatformModItems.GREEN_HIGH_STRENGTH_CONCRETE.get());
				tabData.accept(WorkPlatformModItems.RED_HIGH_STRENGTH_CONCRETE.get());
				tabData.accept(WorkPlatformModItems.BLACK_HIGH_STRENGTH_CONCRETE.get());
				tabData.accept(WorkPlatformModItems.REPLACEABLEBLOCK.get());
			}).withTabsBefore(PLATFORM.getId()).build());
	public static final RegistryObject<CreativeModeTab> LIGHT = REGISTRY.register("light",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.work_platform.light")).icon(() -> new ItemStack(WorkPlatformModItems.HIGHSTRENGTHLIGHT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(WorkPlatformModItems.LIGHTPANEL.get());
				tabData.accept(WorkPlatformModBlocks.SEARCHLIGHT.get().asItem());
				tabData.accept(WorkPlatformModItems.LIGHTTUBE.get());
				tabData.accept(WorkPlatformModItems.HIGHSTRENGTHLIGHT.get());
			}).withTabsBefore(HARDENEDCONCRETE.getId()).build());
}
