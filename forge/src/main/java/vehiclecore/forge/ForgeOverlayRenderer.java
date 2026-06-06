package vehiclecore.forge;

import vehiclecore.Main;
import vehiclecore.client.OverlayRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterGuiOverlaysEvent;
import net.minecraftforge.client.gui.overlay.VanillaGuiOverlay;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ForgeOverlayRenderer {
    @SubscribeEvent
    public static void registerGuiOverlays(RegisterGuiOverlaysEvent event) {
        event.registerAbove(VanillaGuiOverlay.FOOD_LEVEL.id(), "ia_overlay",
                (forgeGui, arg, f, i, j) ->
                        forgeGui.rightHeight += OverlayRenderer.renderOverlay(arg, f, forgeGui.rightHeight));
    }
}
