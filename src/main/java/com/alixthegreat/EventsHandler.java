package com.alixthegreat;

import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import com.alixthegreat.utils.colourDict;


public class EventsHandler{
    @SubscribeEvent(priority = EventPriority.HIGH)
    public void onServerChat(ClientChatReceivedEvent event) {
        ChatComponentText returnmsg = new ChatComponentText("");
        String[] splitmsg = event.message.getUnformattedText().split(" ");
        for(int j = 0;j< splitmsg.length;j++){
             if(colourDict.colourDict.containsKey(splitmsg[j])){
                 switch(colourDict.colourDict.get(splitmsg[j])){
                     case "dark_red":
                         returnmsg.appendSibling(new ChatComponentText(EnumChatFormatting.DARK_RED + splitmsg[j] + " "));
                         break;
                     case "red":
                         returnmsg.appendSibling(new ChatComponentText(EnumChatFormatting.RED + splitmsg[j] + " "));
                         break;
                     case "gold":
                         returnmsg.appendSibling(new ChatComponentText(EnumChatFormatting.GOLD + splitmsg[j] + " "));
                         break;
                     case "yellow":
                         returnmsg.appendSibling(new ChatComponentText(EnumChatFormatting.YELLOW + splitmsg[j] + " "));
                         break;
                     case "dark_green":
                         returnmsg.appendSibling(new ChatComponentText(EnumChatFormatting.DARK_GREEN + splitmsg[j] + " "));
                         break;
                     case "green":
                         returnmsg.appendSibling(new ChatComponentText(EnumChatFormatting.GREEN + splitmsg[j] + " "));
                         break;
                     case "aqua":
                         returnmsg.appendSibling(new ChatComponentText(EnumChatFormatting.AQUA + splitmsg[j] + " "));
                         break;
                     case "dark_aqua":
                         returnmsg.appendSibling(new ChatComponentText(EnumChatFormatting.DARK_AQUA + splitmsg[j] + " "));
                         break;
                     case "dark_blue":
                         returnmsg.appendSibling(new ChatComponentText(EnumChatFormatting.DARK_BLUE + splitmsg[j] + " "));
                         break;
                     case "blue":
                         returnmsg.appendSibling(new ChatComponentText(EnumChatFormatting.BLUE + splitmsg[j] + " "));
                         break;
                     case "light_purple":
                         returnmsg.appendSibling(new ChatComponentText(EnumChatFormatting.LIGHT_PURPLE + splitmsg[j] + " "));
                         break;
                     case "dark_purple":
                         returnmsg.appendSibling(new ChatComponentText(EnumChatFormatting.DARK_PURPLE + splitmsg[j] + " "));
                         break;
                     case "white":
                         returnmsg.appendSibling(new ChatComponentText(EnumChatFormatting.WHITE + splitmsg[j] + " "));
                         break;
                     case "darK_gray":
                         returnmsg.appendSibling(new ChatComponentText(EnumChatFormatting.DARK_GRAY + splitmsg[j] + " "));
                         break;
                     case "gray":
                         returnmsg.appendSibling(new ChatComponentText(EnumChatFormatting.GRAY + splitmsg[j] + " "));
                         break;
                     case "black":
                         returnmsg.appendSibling(new ChatComponentText(EnumChatFormatting.BLACK + splitmsg[j] + " "));
                         break;
                 }
             }else{
                 returnmsg.appendSibling(new ChatComponentText(splitmsg[j] + " "));
             }
        }
        event.message = returnmsg;

    }
}
