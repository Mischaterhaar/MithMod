package com.mitheace.mithmod.block;

import com.mitheace.mithmod.Item.ModCreativeModeTab;
import com.mitheace.mithmod.Item.ModItems;
import com.mitheace.mithmod.MithMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MithMod.MOD_ID);

    public static final RegistryObject<Block> MITHRINE_BLOCK = registerBlock("mithrine_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL).strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.MITHMOD_TAB);

    public static final RegistryObject<Block> MITHRINE_ORE = registerBlock("mithrine_ore", () ->
            new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).requiresCorrectToolForDrops()), ModCreativeModeTab.MITHMOD_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
