package org.playifkillers.hyperoilcustom.hyperoilmod;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.ForgeConfig;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.playifkillers.hyperoilcustom.hyperoilmod.Listeners.Chatlogging;
import org.slf4j.Logger;

// this is using a bit of ai help not just this calss this class has pratically no ai help the rest have a bit.
@Mod(Hyperoilmod.MODID)
public class Hyperoilmod {

    public static final String MODID = "hyperoilmod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Hyperoilmod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::onClientSetup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onClientSetup(FMLClientSetupEvent event) {
        MinecraftForge.EVENT_BUS.register(new Chatlogging());
        LOGGER.info("Client Startup Initiated");
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
}
