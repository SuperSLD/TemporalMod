package online.jutter.temporal.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import online.jutter.temporal.Temporal;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Temporal.MODID);

    public static final RegistryObject<Block> PORTAL_BLOCK = BLOCKS.register(
            "portal_block",
            () -> new PortalBlock(BlockBehaviour.Properties.of())
    );

    public static final RegistryObject<Block> PORTAL_CORE = BLOCKS.register(
            "portal_core",
            () -> new PortalCore(BlockBehaviour.Properties.of())
    );

    public static final RegistryObject<Block> PORTAL_CAPACITOR = BLOCKS.register(
            "portal_capacitor",
            () -> new PortalCapacitor(BlockBehaviour.Properties.of())
    );

    public static final RegistryObject<Block> PORTAL_CONTROLLER = BLOCKS.register(
            "portal_controller",
            () -> new PortalController(BlockBehaviour.Properties.of())
    );
}
