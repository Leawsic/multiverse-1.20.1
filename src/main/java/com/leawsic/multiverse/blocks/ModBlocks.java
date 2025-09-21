package com.leawsic.multiverse.blocks;

import com.leawsic.multiverse.Multiverse;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    private static Block registerBlock(String path,Block block){
        Registry.register(Registries.ITEM,new Identifier(Multiverse.MOD_ID,path),new BlockItem(block,
                new FabricItemSettings()));
        return Registry.register(Registries.BLOCK,new Identifier(Multiverse.MOD_ID,path),block);
    }
    public static void registerModBlocks(){
    }
}
