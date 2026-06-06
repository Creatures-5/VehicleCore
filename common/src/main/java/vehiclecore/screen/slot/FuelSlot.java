package vehiclecore.screen.slot;

import vehiclecore.util.Utils;
import net.minecraft.world.Container;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;

public class FuelSlot extends Slot {
    public FuelSlot(Container inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean mayPlace(ItemStack stack) {
        return Utils.getFuelTime(stack) > 0;
    }
}

