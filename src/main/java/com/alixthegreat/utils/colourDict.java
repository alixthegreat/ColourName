package com.alixthegreat.utils;

import net.minecraft.util.EnumChatFormatting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class colourDict {
    public static Map<String,String> colourDict = new HashMap<>();
    public static ArrayList<String> validColours= new ArrayList<String>();

    public String getColour(String word){
        if(colourDict.containsKey(word)){
            return colourDict.get(word);
        }else{
            return "Invalid Key";
        }
    }
    public static ArrayList<String> getNames(){
        ArrayList<String> names = new ArrayList<String>();
        colourDict.forEach((key, value) -> {
            names.add(key);
        });
        return names;
    }
    public static boolean contains(String word){
        if(colourDict.containsKey(word)){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isValidColour(String colour){
        if(validColours.contains(colour)){
            return true;
        }else{
            return false;
        }
    }
    public static void addNew(String name, String colour){
        colourDict.put(name, colour);
    }
    public static void changeVal(String name, String colour){
        colourDict.replace(name, colour);
    }
    public static void populateColours(){
        validColours.add("dark_red");
        validColours.add("red");
        validColours.add("gold");
        validColours.add("yellow");
        validColours.add("dark_green");
        validColours.add("green");
        validColours.add("aqua");
        validColours.add("dark_aqua");
        validColours.add("dark_blue");
        validColours.add("blue");
        validColours.add("light_purple");
        validColours.add("dark_purple");
        validColours.add("white");
        validColours.add("gray");
        validColours.add("dark_gray");
        validColours.add("black");
    }
}
