package online.jutter.temporal;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import online.jutter.temporal.items.ItemInit;

@Mod(Temporal.MODID)
public class Temporal {

    public static final String MODID = "temporal";

    public Temporal() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        //Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        ItemInit.ITEMS.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    public void commonSetup(final FMLCommonSetupEvent event) {

    }
}
