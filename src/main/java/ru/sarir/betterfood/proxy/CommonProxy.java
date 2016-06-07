package ru.sarir.betterfood.proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;
import ru.sarir.betterfood.fluids.BFFluids;
import ru.sarir.betterfood.handlers.BFCraftingHandler;
import ru.sarir.betterfood.items.BFItems;
import ru.sarir.betterfood.recipes.BFRecipes;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent preEvent) {
		BFItems.initItems();
		BFFluids.initFluids();
		BFRecipes.initRecipes();
	}

	public void init(FMLInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new BFCraftingHandler());
	}

	public void postInit(FMLPostInitializationEvent postEvent) {

	}
}
