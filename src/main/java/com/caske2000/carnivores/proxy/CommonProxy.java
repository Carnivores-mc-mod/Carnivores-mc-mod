package com.caske2000.carnivores.proxy;

import com.caske2000.carnivores.gui.GuiCarnivores;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;


public class CommonProxy implements IGuiHandler {

	public void registerRenderers() {

	}

	public void registerKeybindings() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		 if ( ID == GuiCarnivores.GUI_ID )
             return new GuiCarnivores();
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		// TODO Auto-generated method stub
		return null;
	}

}
