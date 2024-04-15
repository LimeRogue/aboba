
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.abobskykabriolet.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.abobskykabriolet.AbobskyKabrioletMod;

public class AbobskyKabrioletModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, AbobskyKabrioletMod.MODID);
	public static final RegistryObject<SoundEvent> FONK = REGISTRY.register("fonk", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("abobsky_kabriolet", "fonk")));
	public static final RegistryObject<SoundEvent> ZANESLOL = REGISTRY.register("zaneslol", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("abobsky_kabriolet", "zaneslol")));
	public static final RegistryObject<SoundEvent> YAKHOCHUPIVA = REGISTRY.register("yakhochupiva", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("abobsky_kabriolet", "yakhochupiva")));
}
