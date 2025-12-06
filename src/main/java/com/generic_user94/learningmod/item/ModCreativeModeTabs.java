package com.generic_user94.learningmod.item;

import com.generic_user94.learningmod.LearningMod;
import com.generic_user94.learningmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LearningMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MEGAMINDIUM_ITEMS_TAB = CREATIVE_MODE_TABS.register("megamindium_items_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.MEGAMINDIUM.get()))
                    .title(Component.translatable("creativetab.learningmod.megamindium_items"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.MEGAMINDIUM.get());
                        pOutput.accept(ModItems.RAW_MEGAMINDIUM.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> MEGAMINDIUM_BLOCKS_TAB = CREATIVE_MODE_TABS.register("megamindium_blocks_tab",
            () -> CreativeModeTab.builder()
                    .withTabsBefore(MEGAMINDIUM_ITEMS_TAB.getId())
                    .icon(() -> new ItemStack(ModBlocks.MEGAMINDIUM_BLOCK.get()))
                    .title(Component.translatable("creativetab.learningmod.megamindium_blocks"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.MEGAMINDIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_MEGAMINDIUM_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
