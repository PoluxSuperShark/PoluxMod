
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.poluxsupershark.init;

import net.poluxsupershark.PoluxsupersharkMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PoluxsupersharkModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PoluxsupersharkMod.MODID);
	public static final RegistryObject<CreativeModeTab> MONSTERS_POLUX = REGISTRY.register("monsters_polux",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.poluxsupershark.monsters_polux")).icon(() -> new ItemStack(PoluxsupersharkModItems.ENTITY_306_SPAWN_EGG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PoluxsupersharkModItems.ENTITY_306_SPAWN_EGG.get());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> TRAINS_EXTRAS = REGISTRY.register("trains_extras",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.poluxsupershark.trains_extras")).icon(() -> new ItemStack(Items.MINECART)).displayItems((parameters, tabData) -> {
				tabData.accept(PoluxsupersharkModBlocks.TRAINS_PLATFORM.get().asItem());
				tabData.accept(PoluxsupersharkModItems.TRAIN_CONTROLLER_SPAWN_EGG.get());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> POLUXITE = REGISTRY.register("poluxite",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.poluxsupershark.poluxite")).icon(() -> new ItemStack(PoluxsupersharkModItems.POLUXITE_TOOLS_SWORD.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PoluxsupersharkModItems.POLUXITE_TOOLS_AXE.get());
				tabData.accept(PoluxsupersharkModItems.POLUXITE_TOOLS_PICKAXE.get());
				tabData.accept(PoluxsupersharkModItems.POLUXITE_TOOLS_SWORD.get());
				tabData.accept(PoluxsupersharkModItems.POLUXITE_TOOLS_SHOVEL.get());
				tabData.accept(PoluxsupersharkModItems.POLUXITE_TOOLS_HOE.get());
				tabData.accept(PoluxsupersharkModItems.POLUXITE_ARMOR_HELMET.get());
				tabData.accept(PoluxsupersharkModItems.POLUXITE_ARMOR_CHESTPLATE.get());
				tabData.accept(PoluxsupersharkModItems.POLUXITE_ARMOR_LEGGINGS.get());
				tabData.accept(PoluxsupersharkModItems.POLUXITE_ARMOR_BOOTS.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> COLORED_BLOCKS = REGISTRY.register("colored_blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.poluxsupershark.colored_blocks")).icon(() -> new ItemStack(Blocks.RED_CONCRETE_POWDER)).displayItems((parameters, tabData) -> {
				tabData.accept(PoluxsupersharkModBlocks.RED_FILLED.get().asItem());
				tabData.accept(PoluxsupersharkModBlocks.BLUE_FILLED.get().asItem());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(PoluxsupersharkModItems.RICK_ROLL.get());
		}
	}
}
