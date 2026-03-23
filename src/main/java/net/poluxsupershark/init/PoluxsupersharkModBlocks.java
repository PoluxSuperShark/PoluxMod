
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.poluxsupershark.init;

import net.poluxsupershark.block.TrainsPlatformBlock;
import net.poluxsupershark.block.RedFilledBlock;
import net.poluxsupershark.block.BlueFilledBlock;
import net.poluxsupershark.PoluxsupersharkMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class PoluxsupersharkModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PoluxsupersharkMod.MODID);
	public static final RegistryObject<Block> TRAINS_PLATFORM = REGISTRY.register("trains_platform", () -> new TrainsPlatformBlock());
	public static final RegistryObject<Block> RED_FILLED = REGISTRY.register("red_filled", () -> new RedFilledBlock());
	public static final RegistryObject<Block> BLUE_FILLED = REGISTRY.register("blue_filled", () -> new BlueFilledBlock());
}
