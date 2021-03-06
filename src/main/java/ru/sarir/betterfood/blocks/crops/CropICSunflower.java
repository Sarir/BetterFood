package ru.sarir.betterfood.blocks.crops;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import forestry.core.utils.datastructures.ItemStackMap;
import ic2.api.crops.CropCard;
import ic2.api.crops.ICropTile;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import ru.sarir.betterfood.Globals;

public class CropICSunflower extends CropCard {

	protected int maxGrowthStage = 5;
	
	@Override
	public String name() {
		return "Sunflower";
	}

	@Override
	public int tier() {
		return 0;
	}

	@Override
	public int stat(int n) {
		return 0;
	}

	@Override
	public String[] attributes() {
		return null;
	}

	@Override
	public int maxSize() {
		return maxGrowthStage;
	}

	@Override
	public void registerSprites(IIconRegister iconRegister) {
		textures = new IIcon[maxGrowthStage];
		textures[0] = iconRegister.registerIcon(Globals.MODID + ":SunFlower_1");
		textures[1] = iconRegister.registerIcon(Globals.MODID + ":SunFlower_2");
		textures[2] = iconRegister.registerIcon(Globals.MODID + ":SunFlower_3");
		textures[3] = iconRegister.registerIcon(Globals.MODID + ":SunFlower_4");
		textures[4] = iconRegister.registerIcon(Globals.MODID + ":SunFlower_5");
	}

	@Override
	public boolean canGrow(ICropTile crop) {
		if(crop.getSize() >= maxGrowthStage) {
			return false;
		} else return true;
	}
	
	@Override
	public boolean canCross(ICropTile crop) {
		return false;
	}

	@Override
	public int getOptimalHavestSize(ICropTile crop) {
		return maxGrowthStage;
	}

	@Override
	public boolean canBeHarvested(ICropTile crop) {
		return true;
	}

	@Override
	public ItemStack getGain(ICropTile crop) {
		if(crop.getSize() == maxGrowthStage) {
			return new ItemStack(Blocks.double_plant, 1, 0);
		} else return null;
	}
	
	@Override
    public byte getSizeAfterHarvest(ICropTile crop) {
        return 2;
    }

}
