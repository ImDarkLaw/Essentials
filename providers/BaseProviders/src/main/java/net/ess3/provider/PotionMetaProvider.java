package net.ess3.provider;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public interface PotionMetaProvider extends Provider {
    ItemStack createPotionItem(Material initial, int effectId);

    ItemStack setBasePotionData(ItemStack stack, PotionData data);
}
