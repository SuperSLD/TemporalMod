package online.jutter.temporal.items;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import online.jutter.temporal.Temporal;
import online.jutter.temporal.blocks.BlockInit;


public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Temporal.MODID);

    public static final RegistryObject<Item> TEMPORAL_CRISTAL = ITEMS.register(
            "temporal_cristal",
            () -> new TemporalCristal(new Item.Properties())
    );

    public static final RegistryObject<Item> PORTAL_BLOCK_ITEM = ITEMS.register(
            "portal_block",
            () -> new BlockItem(
                    BlockInit.PORTAL_BLOCK.get(),
                    new BlockItem.Properties()
            )
    );

    public static final RegistryObject<Item> PORTAL_CORE_ITEM = ITEMS.register(
            "portal_core",
            () -> new BlockItem(
                    BlockInit.PORTAL_CORE.get(),
                    new BlockItem.Properties()
            )
    );

    public static final RegistryObject<Item> PORTAL_CAPACITOR_ITEM = ITEMS.register(
            "portal_capacitor",
            () -> new BlockItem(
                    BlockInit.PORTAL_CAPACITOR.get(),
                    new BlockItem.Properties()
            )
    );

    public static final RegistryObject<Item> PORTAL_CONTROLLER_ITEM = ITEMS.register(
            "portal_controller",
            () -> new BlockItem(
                    BlockInit.PORTAL_CONTROLLER.get(),
                    new BlockItem.Properties()
            )
    );

    public static final RegistryObject<Item> TEMPORAL_COMPRESSOR_ITEM = ITEMS.register(
            "temporal_compressor",
            () -> new BlockItem(
                    BlockInit.TEMPORAL_COMPRESSOR.get(),
                    new BlockItem.Properties()
            )
    );
}
