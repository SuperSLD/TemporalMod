package online.jutter.temporal.items;

import static online.jutter.temporal.items.ItemInit.TEMPORAL_CRISTAL;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class TemporalCreativeTab extends CreativeModeTab {

    protected TemporalCreativeTab(Builder builder) {
        super(builder);
    }

    @SuppressWarnings("NullableProblems")
    @Override
    public ItemStack getIconItem() {
        return new ItemStack(TEMPORAL_CRISTAL.get());
    }
}
