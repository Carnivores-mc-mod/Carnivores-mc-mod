package com.caske2000.carnivores;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;

import com.caske2000.carnivores.blocks.ModBlocks;
import com.caske2000.carnivores.handler.BucketHandler;
import com.caske2000.carnivores.handler.ConfigurationHandler;
import com.caske2000.carnivores.handler.EntityHandler;
import com.caske2000.carnivores.handler.KeyHandler;
import com.caske2000.carnivores.items.ModItems;
import com.caske2000.carnivores.proxy.CommonProxy;
import com.caske2000.carnivores.reference.Reference;
import com.caske2000.carnivores.utility.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, guiFactory = Reference.GUIFACTORY_CLASS)
public class Carnivores 
{

	@Mod.Instance(Reference.MODID)
	public static Carnivores instance;

	@SidedProxy(clientSide = Reference.CLIENTPROXY_CLASS, serverSide = Reference.COMMONPROXY_CLASS)
	public static CommonProxy proxy;

	public static CreativeTabs carnivoresTab = new CreativeTabs("carnivoresTab") 
	{

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() 
		{
			return ModItems.creativetab_logo;
		}
	};

	@Mod.EventHandler
	public void PreInit(FMLPreInitializationEvent event) 
	{

		System.out.println(KeyHandler.points);

		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

		FMLCommonHandler.instance().bus().register(new KeyHandler());

		ModItems.init();
		
		ModBlocks.init();
		MinecraftForge.EVENT_BUS.register(new BucketHandler());
		/*
		 * Handlers
		 */
		EntityHandler.init();

		/*
		 * Proxy
		 */
		proxy.registerRenderers();
		proxy.registerKeybindings();
	    NetworkRegistry.INSTANCE.registerGuiHandler(instance, proxy);

		LogHelper.info("Pre Initialization Completed!");

	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) 
	{

		LogHelper.info("Initialization Completed!");

	}

	@Mod.EventHandler
	public void PostInit(FMLPostInitializationEvent event) 
	{

		LogHelper.info("Post Initialization Completed!");

	}

}
