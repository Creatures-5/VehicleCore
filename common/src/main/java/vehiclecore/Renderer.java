package vehiclecore;

import vehiclecore.client.render.entity.renderer.*;
import vehiclecore.client.render.entity.renderer.bullet.*;
import vehiclecore.cobalt.registration.Registration;

public class Renderer {
    public static void bootstrap() {
        Registration.register(Entities.BIPLANE.get(), BiplaneEntityRenderer::new);
        Registration.register(Entities.AIRSHIP.get(), AirshipEntityRenderer::new);

        Registration.register(Entities.BULLET.get(), BulletEntityRenderer::new);
        Registration.register(Entities.TINY_TNT.get(), TinyTNTRenderer::new);
    }
}