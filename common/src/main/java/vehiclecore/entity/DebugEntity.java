package vehiclecore.entity;

import vehiclecore.Items;
import vehiclecore.entity.misc.TrailDescriptor;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import org.joml.Matrix4f;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager.ControllerRegistrar;

public class DebugEntity extends AirplaneEntity implements GeoEntity {
    public DebugEntity(EntityType<? extends AircraftEntity> entityType, Level world) {
        super(entityType, world, true);
    }

    @Override
    public float getBaseTrailWidth(Matrix4f transform, int index, TrailDescriptor trail) {
        return (float) (Math.sqrt(getDeltaMovement().length()) * (0.5f - (pressingInterpolatedX.getSmooth() * trail.x()) * 0.025f) - 0.25f);
    }

    @Override
    public Item asItem() {
        return Items.DEBUG.get();
    }

    @Override
    public void tick() {
        super.tick();

        // Smoke
        emitSmokeParticle(
                0.325f * (tickCount % 2 == 0 ? -1.0f : 1.0f), 0.5f, 0.8f,
                0.2f * (tickCount % 2 == 0 ? -1.0f : 1.0f), 0.0f, 0.0f
        );
    }

    @Override
    public double getZoom() {
        return 3.0;
    }

    @Override
    public void registerControllers(ControllerRegistrar controllers) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registerControllers'");
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAnimatableInstanceCache'");
    }
}
