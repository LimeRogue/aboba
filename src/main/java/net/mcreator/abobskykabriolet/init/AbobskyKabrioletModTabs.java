
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.abobskykabriolet.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.abobskykabriolet.AbobskyKabrioletMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AbobskyKabrioletModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AbobskyKabrioletMod.MODID);
	public static final RegistryObject<CreativeModeTab> KABRIOLETMOD = REGISTRY.register("kabrioletmod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.abobsky_kabriolet.kabrioletmod")).icon(() -> new ItemStack(AbobskyKabrioletModItems.SALO.get())).displayItems((parameters, tabData) -> {
				tabData.accept(AbobskyKabrioletModItems.PIECHIEN.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(AbobskyKabrioletModItems.ZANIESLO.get());
			tabData.accept(AbobskyKabrioletModItems.ABOBSKII.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(AbobskyKabrioletModItems.SALO.get());
		}
	}
}
