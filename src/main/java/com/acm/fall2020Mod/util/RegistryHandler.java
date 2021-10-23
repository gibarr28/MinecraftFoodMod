package com.acm.fall2020Mod.util;

import com.acm.fall2020Mod.AcmMinecraftMod;
import com.acm.fall2020Mod.blocks.BlockItemBase;
import com.acm.fall2020Mod.blocks.SkittlesBlock;
import com.acm.fall2020Mod.items.FastFoodItemBase;
import com.acm.fall2020Mod.items.ItemBase;
import com.acm.fall2020Mod.items.SkittlesItemBase;
import com.acm.fall2020Mod.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, AcmMinecraftMod.MOD_ID);

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, AcmMinecraftMod.MOD_ID);

    //Tools
    public static final RegistryObject<SwordItem> SKITTLES_SWORD = ITEMS.register("skittles_sword", ()->
            new SwordItem(ModItemTier.SKITTLES, 5, -3.0f, new Item.Properties().group(AcmMinecraftMod.TAB)));


    // Items
    public static final RegistryObject<Item> PHONE = ITEMS.register("phone", ItemBase::new);

    public static final RegistryObject<Item> GREEN_APPLE_SKITTLES = ITEMS.register("green_apple_skittles", ItemBase::new);

    public static final RegistryObject<Item> SKITTLES = ITEMS.register("skittles", SkittlesItemBase:: new);

    public static final RegistryObject<Item> HAMBURGER = ITEMS.register("hamburger", FastFoodItemBase:: new);

    // Blocks
    public static final RegistryObject<Block> SKITTLES_BLOCK = BLOCKS.register("skittles_block", SkittlesBlock::new);

    // BlockItem
    public static final RegistryObject<Item> SKITTLES_BLOCK_ITEM = ITEMS.register("skittles_block", () ->new BlockItemBase(SKITTLES_BLOCK.get()));

    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }


}
