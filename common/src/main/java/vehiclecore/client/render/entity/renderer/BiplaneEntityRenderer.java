package vehiclecore.client.render.entity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import vehiclecore.Main;
import vehiclecore.client.render.entity.renderer.utils.ModelPartRenderHandler;
import vehiclecore.entity.AircraftEntity;
import vehiclecore.entity.BiplaneEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class BiplaneEntityRenderer<T extends BiplaneEntity> extends AircraftEntityRenderer<T> {
    private static final ResourceLocation ID = Main.locate("biplane");

    protected ResourceLocation getModelId() {
        return ID;
    }

    private final ModelPartRenderHandler<T> model = new ModelPartRenderHandler<T>()
            .add("banners", this::renderBanners);

    public BiplaneEntityRenderer(EntityRendererProvider.Context context) {
        super(context);

        this.shadowRadius = 0.8f;
    }

    @Override
    protected ModelPartRenderHandler<T> getModel(AircraftEntity entity) {
        return model;
    }
}
