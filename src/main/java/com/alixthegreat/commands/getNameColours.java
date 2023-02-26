package com.alixthegreat.commands;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;

public class getNameColours extends CommandBase{

    @Override
    public String getCommandName() {
        return "getNameColours";
    }

    @Override
    public String getCommandUsage(ICommandSender iCommandSender) {
        return "/" + getCommandName();
    }
    @Override
    public int getRequiredPermissionLevel() {
        return 0;
    }
    @Override
    public void processCommand(ICommandSender iCommandSender, String[] strings) throws CommandException {
        iCommandSender.addChatMessage(new ChatComponentText("List Of Colours: dark_red, red, gold, yellow, dark_green, green, aqua, dark_aqua, dark_blue, blue, light_purple, dark_purple, white, gray, dark_gray, black"));
    }
}
