package vehiclecore.network;

import vehiclecore.network.s2c.FireResponse;
import vehiclecore.network.s2c.InventoryUpdateMessage;
import vehiclecore.network.s2c.OpenGuiRequest;

public interface NetworkManager {
    void handleOpenGuiRequest(OpenGuiRequest request);

    void handleInventoryUpdate(InventoryUpdateMessage message);

    void handleFire(FireResponse fireResponse);
}
