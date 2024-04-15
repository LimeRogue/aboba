
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.abobskykabriolet.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.abobskykabriolet.item.ZaniesloItem;
import net.mcreator.abobskykabriolet.item.SaloItem;
import net.mcreator.abobskykabriolet.item.PiechienItem;
import net.mcreator.abobskykabriolet.item.AbobskiiItem;
import net.mcreator.abobskykabriolet.AbobskyKabrioletMod;

public class AbobskyKabrioletModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AbobskyKabrioletMod.MODID);
	public static final RegistryObject<Item> ZANIESLO = REGISTRY.register("zanieslo", () -> new ZaniesloItem());
	public static final RegistryObject<Item> ABOBSKII = REGISTRY.register("abobskii", () -> new AbobskiiItem());
	public static final RegistryObject<Item> SALO = REGISTRY.register("salo", () -> new SaloItem());
	public static final RegistryObject<Item> PIECHIEN = REGISTRY.register("piechien", () -> new PiechienItem());
}
