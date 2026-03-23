
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.poluxsupershark.init;

import net.poluxsupershark.client.renderer.TrainControllerRenderer;
import net.poluxsupershark.client.renderer.Entity306Renderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PoluxsupersharkModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PoluxsupersharkModEntities.ENTITY_306.get(), Entity306Renderer::new);
		event.registerEntityRenderer(PoluxsupersharkModEntities.TRAIN_CONTROLLER.get(), TrainControllerRenderer::new);
	}
}
