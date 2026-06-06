package vehiclecore.entity.inventory.slots;

import com.google.gson.JsonObject;
import vehiclecore.entity.InventoryVehicleEntity;
import vehiclecore.screen.slot.FuelSlot;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.Container;
import net.minecraft.world.inventory.Slot;

public class FuelSlotDescription extends TooltippedSlotDescription {
    public FuelSlotDescription(String type, int index, int x, int y, JsonObject json) {
        super(type, index, x, y, json);
    }

    public FuelSlotDescription(String type, FriendlyByteBuf buffer) {
        super(type, buffer);
    }

    @Override
    public Slot getSlot(InventoryVehicleEntity vehicle, Container inventory) {
        return new FuelSlot(inventory, index, x, y);
    }
}
