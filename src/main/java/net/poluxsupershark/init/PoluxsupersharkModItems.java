
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.poluxsupershark.init;

import net.poluxsupershark.item.RickRollItem;
import net.poluxsupershark.item.PoluxiteToolsSwordItem;
import net.poluxsupershark.item.PoluxiteToolsShovelItem;
import net.poluxsupershark.item.PoluxiteToolsPickaxeItem;
import net.poluxsupershark.item.PoluxiteToolsHoeItem;
import net.poluxsupershark.item.PoluxiteToolsAxeItem;
import net.poluxsupershark.item.PoluxiteArmorItem;
import net.poluxsupershark.PoluxsupersharkMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class PoluxsupersharkModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PoluxsupersharkMod.MODID);
	public static final RegistryObject<Item> ENTITY_306_SPAWN_EGG = REGISTRY.register("entity_306_spawn_egg", () -> new ForgeSpawnEggItem(PoluxsupersharkModEntities.ENTITY_306, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> TRAINS_PLATFORM = block(PoluxsupersharkModBlocks.TRAINS_PLATFORM);
	public static final RegistryObject<Item> TRAIN_CONTROLLER_SPAWN_EGG = REGISTRY.register("train_controller_spawn_egg", () -> new ForgeSpawnEggItem(PoluxsupersharkModEntities.TRAIN_CONTROLLER, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> RICK_ROLL = REGISTRY.register("rick_roll", () -> new RickRollItem());
	public static final RegistryObject<Item> POLUXITE_TOOLS_AXE = REGISTRY.register("poluxite_tools_axe", () -> new PoluxiteToolsAxeItem());
	public static final RegistryObject<Item> POLUXITE_TOOLS_PICKAXE = REGISTRY.register("poluxite_tools_pickaxe", () -> new PoluxiteToolsPickaxeItem());
	public static final RegistryObject<Item> POLUXITE_TOOLS_SWORD = REGISTRY.register("poluxite_tools_sword", () -> new PoluxiteToolsSwordItem());
	public static final RegistryObject<Item> POLUXITE_TOOLS_SHOVEL = REGISTRY.register("poluxite_tools_shovel", () -> new PoluxiteToolsShovelItem());
	public static final RegistryObject<Item> POLUXITE_TOOLS_HOE = REGISTRY.register("poluxite_tools_hoe", () -> new PoluxiteToolsHoeItem());
	public static final RegistryObject<Item> POLUXITE_ARMOR_HELMET = REGISTRY.register("poluxite_armor_helmet", () -> new PoluxiteArmorItem.Helmet());
	public static final RegistryObject<Item> POLUXITE_ARMOR_CHESTPLATE = REGISTRY.register("poluxite_armor_chestplate", () -> new PoluxiteArmorItem.Chestplate());
	public static final RegistryObject<Item> POLUXITE_ARMOR_LEGGINGS = REGISTRY.register("poluxite_armor_leggings", () -> new PoluxiteArmorItem.Leggings());
	public static final RegistryObject<Item> POLUXITE_ARMOR_BOOTS = REGISTRY.register("poluxite_armor_boots", () -> new PoluxiteArmorItem.Boots());
	public static final RegistryObject<Item> RED_FILLED = block(PoluxsupersharkModBlocks.RED_FILLED);
	public static final RegistryObject<Item> BLUE_FILLED = block(PoluxsupersharkModBlocks.BLUE_FILLED);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
