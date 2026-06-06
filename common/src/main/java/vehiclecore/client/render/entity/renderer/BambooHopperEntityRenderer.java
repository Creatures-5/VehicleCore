package vehiclecore.client.render.entity.renderer;

import vehiclecore.Main;
import vehiclecore.client.render.entity.renderer.utils.ModelPartRenderHandler;
import vehiclecore.entity.AircraftEntity;
import vehiclecore.entity.BambooHopperEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class BambooHopperEntityRenderer<T extends BambooHopperEntity> extends AircraftEntityRenderer<T> {
    private static final ResourceLocation ID = Main.locate("bamboo_hopper");

    protected ResourceLocation getModelId() {
        return ID;
    }

    private final ModelPartRenderHandler<T> model = new ModelPartRenderHandler<>();

    public BambooHopperEntityRenderer(EntityRendererProvider.Context context) {
        super(context);

        this.shadowRadius = 2.0f;
    }

    @Override
    protected ModelPartRenderHandler<T> getModel(AircraftEntity entity) {
        return model;
    }
}
