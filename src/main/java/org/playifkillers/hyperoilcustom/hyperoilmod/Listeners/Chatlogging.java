package org.playifkillers.hyperoilcustom.hyperoilmod.Listeners;

import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.playifkillers.hyperoilcustom.hyperoilmod.Functions.Chatlog;
import org.playifkillers.hyperoilcustom.hyperoilmod.Hyperoilmod;

@Mod.EventBusSubscriber(modid = Hyperoilmod.MODID)
public class Chatlogging {


    @SubscribeEvent
    public void onClientChatEvent(ClientChatEvent event) {
        Chatlog.logToFile(event.getMessage());
    }
}
