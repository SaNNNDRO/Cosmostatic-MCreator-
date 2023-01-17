
package net.mcreator.cosmostatic.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SlimeModel;

import net.mcreator.cosmostatic.entity.DarkmatterwispEntity;

public class DarkmatterwispRenderer extends MobRenderer<DarkmatterwispEntity, SlimeModel<DarkmatterwispEntity>> {
	public DarkmatterwispRenderer(EntityRendererProvider.Context context) {
		super(context, new SlimeModel(context.bakeLayer(ModelLayers.SLIME)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DarkmatterwispEntity entity) {
		return new ResourceLocation("cosmostatic:textures/entities/darkmatter.png");
	}
}
