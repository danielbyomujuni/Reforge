package net.reforge;

import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.reforge.Equitment.NetherriteElytra;

public class Reforge implements ModInitializer {
    public static final Item NETHERITE_ELYTRA = new Item(new Item.Settings().group(ItemGroup.TRANSPORTATION));
    @Override
    public void onInitialize() {
        // TODO Auto-generated method stub

        Registry.register(Registry.ITEM, new Identifier("reforge", "netherite_elytra"), NETHERITE_ELYTRA);
            }


    
}