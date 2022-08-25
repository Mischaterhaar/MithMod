package com.mitheace.mithmod.Item;

import com.mitheace.mithmod.MithMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MithMod.MOD_ID);

    public static final RegistryObject<Item> MITHRINE = ITEMS.register("mithrine", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.MITHMOD_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
