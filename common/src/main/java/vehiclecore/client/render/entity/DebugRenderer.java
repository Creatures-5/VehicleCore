package vehiclecore.client.render.entity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.renderer.GeoEntityRenderer;
import vehiclecore.entity.DebugEntity;
import vehiclecore.model.DebugModel;

public class DebugRenderer extends GeoEntityRenderer<DebugEntity> {
        public DebugRenderer(EntityRendererProvider.Context context) {
            super(context, new DebugModel());
        }
    }