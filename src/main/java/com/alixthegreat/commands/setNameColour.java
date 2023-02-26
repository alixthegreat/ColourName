package com.alixthegreat.commands;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import com.alixthegreat.utils.colourDict;

import java.util.List;


public class setNameColour extends CommandBase {

    @Override
    public String getCommandName() {
        return "setNameColour";
    }

    @Override
    public String getCommandUsage(ICommandSender iCommandSender) {
        return "/"+ getCommandName() + " [playername] [colour]";
    }
    @Override
    public int getRequiredPermissionLevel() {
        return 0;
    }

    @Override
    public void processCommand(ICommandSender iCommandSender, String[] strings) throws CommandException {
        if(strings.length ==0){
            iCommandSender.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_RED+ "Invalid Usage.."));
        }
        if(strings.length == 1){
            iCommandSender.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_RED + "Missing colour arg."));
        }
        if(strings.length == 2){
            colourDict colourList = new colourDict();
            if(colourList.contains(strings[0])){
                if(colourList.isValidColour(strings[1])){
                    colourList.changeVal(strings[0],strings[1]);
                }else{
                    iCommandSender.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_RED + "Invalid colour."));
                }
            }else{
                colourList.addNew(strings[0],strings[1]);
            }
        }
    }

}
