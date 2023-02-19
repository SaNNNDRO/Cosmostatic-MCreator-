
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cosmostatic.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.cosmostatic.block.ParticleacceleratorBlock;
import net.mcreator.cosmostatic.block.DarkmatterblockBlock;
import net.mcreator.cosmostatic.CosmostaticMod;

public class CosmostaticModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CosmostaticMod.MODID);
	public static final RegistryObject<Block> DARKMATTERBLOCK = REGISTRY.register("darkmatterblock", () -> new DarkmatterblockBlock());
	public static final RegistryObject<Block> TRANSDUCER = REGISTRY.register("transducer", () -> new ParticleacceleratorBlock());
}
