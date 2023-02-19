
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cosmostatic.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.cosmostatic.block.entity.ParticleacceleratorBlockEntity;
import net.mcreator.cosmostatic.CosmostaticMod;

public class CosmostaticModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES,
			CosmostaticMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> TRANSDUCER = register("transducer", CosmostaticModBlocks.TRANSDUCER,
			ParticleacceleratorBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
