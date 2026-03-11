package com.generic_user94.learningmod.block;

import com.generic_user94.learningmod.LearningMod;
import com.generic_user94.learningmod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static net.minecraft.world.item.Items.registerBlock;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, LearningMod.MOD_ID);




    public static final RegistryObject<Block> CHEESE_BLOCK = registerBlock("cheese_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<Block> CHEESE_WITH_LEGS_BLOCK = registerBlock("cheese_with_legs_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<Block> CHERRIES_BLOCK = registerBlock("cherries_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<Block> COW_BLOCK = registerBlock("cow_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<Block> RAT_BLOCK = registerBlock("rat_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<Block> STRAWBERRIES_BLOCK = registerBlock("strawberries_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<Block> MYSTERY_BLOCK = registerBlock("mystery_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.ANVIL)));






    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
