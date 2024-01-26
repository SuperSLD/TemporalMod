package online.jutter.temporal.items;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import online.jutter.temporal.Temporal;


public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Temporal.MODID);

    public static final RegistryObject<Item> TEMPORAL_CRISTAL = ITEMS.register("temporal_crystal",
            () -> new Item(new Item.Properties()));
}
