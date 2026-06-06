package vehiclecore.fabric;

import net.fabricmc.loader.api.FabricLoader;

public class CompatUtilImpl {
    public static boolean isModLoaded(String modid) {
        return FabricLoader.getInstance().isModLoaded(modid);
    }
}
