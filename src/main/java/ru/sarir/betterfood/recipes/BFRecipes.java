package ru.sarir.betterfood.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import ic2.api.recipe.RecipeInputFluidContainer;
import ic2.api.recipe.RecipeInputItemStack;
import ic2.api.recipe.Recipes;
import ic2.core.Ic2Items;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import ru.sarir.betterfood.fluids.BFFluids;
import ru.sarir.betterfood.items.BFItems;

public class BFRecipes {
	
	public static void initRecipes() {
		
		// Sunflower seeds
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.double_plant, 1, 0), 1), null, new ItemStack(BFItems.sunflowerSeeds, 15));
		
		// Sunflower oil
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(BFItems.sunflowerSeeds), 50), null, new ItemStack(BFItems.sunflowerOil));
		Recipes.cannerBottle.addRecipe(new RecipeInputItemStack(new ItemStack(Items.glass_bottle)), new RecipeInputFluidContainer(BFFluids.fluidSunflowerOil, 1), new ItemStack(BFItems.sunflowerOil));
		
		// Knife
		GameRegistry.addShapedRecipe(new ItemStack(BFItems.knife), new Object[] {"RRR", 
																				 "DDS", 
																				 "   ", 
																				 'R', Ic2Items.plateadviron,
																				 'D', Ic2Items.diamondDust,
																				 'S', Items.stick});
				
		// Burger
		GameRegistry.addShapedRecipe(new ItemStack(BFItems.burger), new Object[] {"BKG",
																				  " M ",
																				  "   ",
																				  'B', Items.bread,
																				  'K', BFItems.knife,
																				  'G', Items.cooked_beef,
																				  'M', BFItems.mayoPotion});
		
		// Mayo
		GameRegistry.addRecipe(new ItemStack(BFItems.mayoPotion), new Object[] {"EEE",
																				"SMO",
																				"   ",
																				'E', Items.egg,
																				'S', Items.sugar,
																				'M', Items.milk_bucket,
																				'O', BFItems.sunflowerOil});
	}
}
