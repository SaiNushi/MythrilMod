package com.sainushi.mythrilmod.init;

import java.util.ArrayList;
import java.util.List;

import com.sainushi.mythrilmod.items.ItemBase;
import com.sainushi.mythrilmod.items.armor.ArmorBase;
import com.sainushi.mythrilmod.items.tools.ToolAxe;
import com.sainushi.mythrilmod.items.tools.ToolHoe;
import com.sainushi.mythrilmod.items.tools.ToolPickaxe;
import com.sainushi.mythrilmod.items.tools.ToolShears;
import com.sainushi.mythrilmod.items.tools.ToolSpade;
import com.sainushi.mythrilmod.items.tools.ToolSword;
import com.sainushi.mythrilmod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ItemsInit 
{

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_MYTHRIL = EnumHelper.addToolMaterial("material_mythril", 3, -1, 8.0F, 21.0F, 22);
	public static final ArmorMaterial MYTHRIL_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("mythril_armor_material", Reference.MOD_ID + ":mythril", -1, new int[] {6, 12, 16, 6}, 25, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 5.0F);
	
	//Items
	public static final Item MYTHRIL_INGOT = new ItemBase("mythril_ingot");
	public static final Item MYTHRIL_NUGGET = new ItemBase("mythril_nugget");
	
	public static final Item BLANK_HEAD = new ItemBase("blank_head");
	public static final Item CHAINMAIL_PIECE = new ItemBase("chainmail_piece");
	public static final Item ELYTRA_PIECE = new ItemBase("elytra_piece");
	
	//Dyes
	public static final Item BEIGE_DYE = new ItemBase("beige_dye");
	public static final Item CREAM_DYE = new ItemBase("cream_dye");
	public static final Item TAN_DYE = new ItemBase("tan_dye");
	
	//Tools
	public static final ItemSword MYTHRIL_SWORD = new ToolSword("mythril_sword", MATERIAL_MYTHRIL);
	public static final ItemSpade MYTHRIL_SHOVEL = new ToolSpade("mythril_shovel", MATERIAL_MYTHRIL);
	public static final ItemPickaxe MYTHRIL_PICKAXE = new ToolPickaxe("mythril_pickaxe", MATERIAL_MYTHRIL);
	public static final ItemAxe MYTHRIL_AXE = new ToolAxe("mythril_axe", MATERIAL_MYTHRIL);
	public static final ItemHoe MYTHRIL_HOE = new ToolHoe("mythril_hoe", MATERIAL_MYTHRIL);
	
	public static final ItemShears MYTHRIL_SHEARS = new ToolShears("mythril_shears", -1);
	public static final ItemShears WOODEN_SHEARS = new ToolShears("wooden_shears", 59);
	public static final ItemShears STONE_SHEARS = new ToolShears("stone_shears", 131);
	public static final ItemShears DIAMOND_SHEARS = new ToolShears("diamond_shears", 1561);
	public static final ItemShears GOLD_SHEARS = new ToolShears("gold_shears", 258);
	
	//ARMOR
	public static final Item MYTHRIL_HELMET = new ArmorBase("mythril_helmet", MYTHRIL_ARMOR_MATERIAL, 1, EntityEquipmentSlot.HEAD);
	public static final Item MYTHRIL_CHAINMAIL = new ArmorBase("mythril_chainmail", MYTHRIL_ARMOR_MATERIAL, 1, EntityEquipmentSlot.CHEST);
	public static final Item MYTHRIL_LEGGINGS = new ArmorBase("mythril_leggings", MYTHRIL_ARMOR_MATERIAL, 2, EntityEquipmentSlot.LEGS);
	public static final Item MYTHRIL_BOOTS = new ArmorBase("mythril_boots", MYTHRIL_ARMOR_MATERIAL, 1, EntityEquipmentSlot.FEET);
}
