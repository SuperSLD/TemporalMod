package online.jutter.temporal.items;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import online.jutter.temporal.Temporal;

public class CreativeTabInit {
    public final static DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(
            Registries.CREATIVE_MODE_TAB,
            Temporal.MODID
    );

    public final static RegistryObject<CreativeModeTab> TEMPORAL_TAB = TABS.register(
            "temporal_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.temporal"))
                    .icon(ItemInit.TEMPORAL_CRISTAL.get()::getDefaultInstance)
                    .displayItems((dp, outputs) -> {
                        outputs.accept(ItemInit.TEMPORAL_CRISTAL.get());
                    })
                    .build()
    );
}
