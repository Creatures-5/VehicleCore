package vehiclecore;

import vehiclecore.cobalt.registration.Registration;
import vehiclecore.entity.*;
import vehiclecore.entity.bullet.BulletEntity;
import vehiclecore.entity.bullet.TinyTNT;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

import java.util.function.Supplier;

public interface Entities {
    Supplier<EntityType<DebugEntity>> DEBUG = register("debug", EntityType.Builder
            .of(DebugEntity::new, MobCategory.MISC)
            .sized(1.75f, 0.85f)
            .clientTrackingRange(12)
            .fireImmune()
    );

    Supplier<EntityType<AirshipEntity>> AIRSHIP = register("airship", EntityType.Builder
            .of(AirshipEntity::new, MobCategory.MISC)
            .sized(1.5f, 3.0f)
            .clientTrackingRange(12)
            .fireImmune()
    );

    Supplier<EntityType<BulletEntity>> BULLET = register("bullet", EntityType.Builder
            .of(BulletEntity::new, MobCategory.MISC)
            .sized(0.25f, 0.25f)
            .clientTrackingRange(10)
            .updateInterval(10)
            .fireImmune()
    );

    Supplier<EntityType<TinyTNT>> TINY_TNT = register("tiny_tnt", EntityType.Builder
            .of(TinyTNT::new, MobCategory.MISC)
            .sized(0.375f, 0.375f)
            .clientTrackingRange(10)
            .updateInterval(10)
            .fireImmune()
    );

    static void bootstrap() {

    }

    static <T extends Entity> Supplier<EntityType<T>> register(String name, EntityType.Builder<T> builder) {
        ResourceLocation id = new ResourceLocation(Main.MOD_ID, name);
        return Registration.register(BuiltInRegistries.ENTITY_TYPE, id, () -> builder.build(id.toString()));
    }
}
