
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.poluxsupershark.init;

import net.poluxsupershark.PoluxsupersharkMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public class PoluxsupersharkModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, PoluxsupersharkMod.MODID);
	public static final RegistryObject<SoundEvent> RICKROLL = REGISTRY.register("rickroll", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("poluxsupershark", "rickroll")));
}
