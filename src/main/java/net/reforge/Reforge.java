package net.reforge;

import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.ElytraItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Reforge implements ModInitializer {

	public static final Item NetherElytra = new ElytraItem(new Item.Settings().group(ItemGroup.COMBAT).fireproof().maxCount(1).maxDamage(100));
	
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		//Items
		Registry.register(Registry.ITEM, new Identifier("reforge", "netherrite_elytra"), NetherElytra);

	}
}
