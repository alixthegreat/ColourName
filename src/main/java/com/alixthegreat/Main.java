package com.alixthegreat;

import com.alixthegreat.commands.getNameColours;
import com.alixthegreat.commands.setNameColour;
import net.minecraft.command.ICommand;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.alixthegreat.utils.colourDict;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)

public class Main {

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {

    }
    @Mod.EventHandler
    public static void init(FMLInitializationEvent event) {
        EventsHandler eventHandler = new EventsHandler();
        MinecraftForge.EVENT_BUS.register(eventHandler);
        ClientCommandHandler.instance.registerCommand((ICommand)new setNameColour());
        ClientCommandHandler.instance.registerCommand((ICommand)new getNameColours());
        colourDict.populateColours();
    }
    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event) {

    }
}

