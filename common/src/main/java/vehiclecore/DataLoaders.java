package vehiclecore;

import vehiclecore.cobalt.registration.Registration;
import vehiclecore.data.VehicleDataLoader;
import vehiclecore.data.UpgradeDataLoader;
import vehiclecore.resources.BBModelLoader;

public class DataLoaders {
    public static void bootstrap() {
        // nop
    }

    static {
        Registration.registerDataLoader("aircraft_upgrades", new UpgradeDataLoader());
        Registration.registerDataLoader("aircraft", new VehicleDataLoader());

        Registration.registerResourceLoader("objects_bbmodel", new BBModelLoader());
    }
}
