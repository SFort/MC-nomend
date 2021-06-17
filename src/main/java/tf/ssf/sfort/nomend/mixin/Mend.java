package tf.ssf.sfort.nomend.mixin;

import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = ExperienceOrbEntity.class, priority = 369)
public abstract class Mend  {
	@Inject(method = "repairPlayerGears(Lnet/minecraft/entity/player/PlayerEntity;I)I", at=@At("HEAD"), cancellable = true)
	public void staphhammertiem(PlayerEntity player, int amount, CallbackInfoReturnable<Integer> cir) {
		cir.setReturnValue(amount);
	}
}
