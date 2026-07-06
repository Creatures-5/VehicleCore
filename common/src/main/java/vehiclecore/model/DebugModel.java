package vehiclecore.model;

import net.minecraft.resources.ResourceLocation;
import vehiclecore.entity.DebugEntity;
import software.bernie.geckolib.GeckoLib;
import software.bernie.geckolib.model.GeoModel;

public class DebugModel extends GeoModel<DebugEntity> {

	@Override
	public ResourceLocation getModelResource(DebugEntity animatable) {
		return new ResourceLocation(GeckoLib.MOD_ID, "geo/debug_plane.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DebugEntity animatable) {
		return new ResourceLocation(GeckoLib.MOD_ID, "textures/entity/debug_plane.png");
	}

	@Override
	public ResourceLocation getAnimationResource(DebugEntity animatable) {
		return new ResourceLocation(GeckoLib.MOD_ID, "animations/debug_plane.animation.json");
	}
}
