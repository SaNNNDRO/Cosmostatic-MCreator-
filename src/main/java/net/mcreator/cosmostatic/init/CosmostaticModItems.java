
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cosmostatic.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.cosmostatic.item.FlaskemptyItem;
import net.mcreator.cosmostatic.item.DarkmatterbottleItem;
import net.mcreator.cosmostatic.item.Darkmatter_insSwordItem;
import net.mcreator.cosmostatic.item.Darkmatter_insShovelItem;
import net.mcreator.cosmostatic.item.Darkmatter_insPickaxeItem;
import net.mcreator.cosmostatic.item.Darkmatter_insHoeItem;
import net.mcreator.cosmostatic.item.Darkmatter_insAxeItem;
import net.mcreator.cosmostatic.item.DarkmatterItem;
import net.mcreator.cosmostatic.item.DarkMatterScytheItem;
import net.mcreator.cosmostatic.item.ChargedshardItem;
import net.mcreator.cosmostatic.CosmostaticMod;

public class CosmostaticModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CosmostaticMod.MODID);
	public static final RegistryObject<Item> DARKMATTER = REGISTRY.register("darkmatter", () -> new DarkmatterItem());
	public static final RegistryObject<Item> DARKMATTERBLOCK = block(CosmostaticModBlocks.DARKMATTERBLOCK, CosmostaticModTabs.TAB_COSMOSTATIC);
	public static final RegistryObject<Item> DARK_MATTER_SCYTHE = REGISTRY.register("dark_matter_scythe", () -> new DarkMatterScytheItem());
	public static final RegistryObject<Item> DARKMATTERWISP = REGISTRY.register("darkmatterwisp_spawn_egg",
			() -> new ForgeSpawnEggItem(CosmostaticModEntities.DARKMATTERWISP, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> TRANSDUCER = block(CosmostaticModBlocks.TRANSDUCER, CosmostaticModTabs.TAB_COSMOSTATIC);
	public static final RegistryObject<Item> DARKMATTER_INS_PICKAXE = REGISTRY.register("darkmatter_ins_pickaxe",
			() -> new Darkmatter_insPickaxeItem());
	public static final RegistryObject<Item> DARKMATTER_INS_AXE = REGISTRY.register("darkmatter_ins_axe", () -> new Darkmatter_insAxeItem());
	public static final RegistryObject<Item> DARKMATTER_INS_SWORD = REGISTRY.register("darkmatter_ins_sword", () -> new Darkmatter_insSwordItem());
	public static final RegistryObject<Item> DARKMATTER_INS_SHOVEL = REGISTRY.register("darkmatter_ins_shovel", () -> new Darkmatter_insShovelItem());
	public static final RegistryObject<Item> DARKMATTER_INS_HOE = REGISTRY.register("darkmatter_ins_hoe", () -> new Darkmatter_insHoeItem());
	public static final RegistryObject<Item> CHARGEDSHARD = REGISTRY.register("chargedshard", () -> new ChargedshardItem());
	public static final RegistryObject<Item> DARKMATTERBOTTLE = REGISTRY.register("darkmatterbottle", () -> new DarkmatterbottleItem());
	public static final RegistryObject<Item> FLASKEMPTY = REGISTRY.register("flaskempty", () -> new FlaskemptyItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
