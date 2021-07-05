package tf.ssf.sfort.nomendtrade.mixin;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.MendingEnchantment;
import net.minecraft.entity.EquipmentSlot;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = MendingEnchantment.class, priority = 369)
public abstract class Mend extends Enchantment {
	protected Mend(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
		super(weight, type, slotTypes);
	}
	@Override
	public boolean isAvailableForEnchantedBookOffer() {
		return false;
	}
}
