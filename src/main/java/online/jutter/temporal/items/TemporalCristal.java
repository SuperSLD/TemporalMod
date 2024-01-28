package online.jutter.temporal.items;

import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;

/**
 * Темпоральный кристал.
 *
 * Кристал, который используется для пространственныз перемещений. Если его держать в правой руке,
 * то он телепортирует игрока на расстояние в 100 блоков.
 */
public class TemporalCristal extends Item {

    private static final int DURATION = 40;
    private static final int DISTANCE = 100;

    public TemporalCristal(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        BlockHitResult ray = rayTrace(world, player, ClipContext.Fluid.NONE);
        BlockPos lookPos = ray.getBlockPos();
        player.setPos(lookPos.getX(), lookPos.getY() + 1, lookPos.getZ());

        player.getCooldowns().addCooldown(this, DURATION);
        player.fallDistance = 0F;
        ItemStack itemStack = player.getItemInHand(hand);
        itemStack.setCount(itemStack.getCount() - 1);

        return super.use(world, player, hand);
    }

    private BlockHitResult rayTrace(Level world, Player player, ClipContext.Fluid fluidMode) {
        double range = DISTANCE;

        float f = player.getXRot();
        float f1 = player.getYRot();
        Vec3 vector3d = player.getEyePosition(1.0F);
        float f2 = Mth.cos(-f1 * ((float)Math.PI / 180F) - (float)Math.PI);
        float f3 = Mth.sin(-f1 * ((float)Math.PI / 180F) - (float)Math.PI);
        float f4 = -Mth.cos(-f * ((float)Math.PI / 180F));
        float f5 = Mth.sin(-f * ((float)Math.PI / 180F));
        float f6 = f3 * f4;
        float f7 = f2 * f4;
        Vec3 vector3d1 = vector3d.add((double)f6 * range, (double)f5 * range, (double)f7 * range);
        return world.clip(new ClipContext(vector3d, vector3d1, ClipContext.Block.OUTLINE, fluidMode, player));
    }
}
