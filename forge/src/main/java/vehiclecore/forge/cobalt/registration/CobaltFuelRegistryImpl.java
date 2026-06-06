package vehiclecore.forge.cobalt.registration;

import vehiclecore.cobalt.registration.CobaltFuelRegistry;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.ForgeHooks;

public class CobaltFuelRegistryImpl extends CobaltFuelRegistry {
    public CobaltFuelRegistryImpl() {
        INSTANCE = this;
    }

    @Override
    public int get(ItemStack stack) {
        return ForgeHooks.getBurnTime(stack, null);
    }
}
