package com.mitheace.mithmod.Item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MITHMOD_TAB = new CreativeModeTab("mithmodtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MITHRINE.get());
        }
    };
}
