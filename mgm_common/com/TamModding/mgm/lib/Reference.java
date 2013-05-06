package com.TamModding.mgm.lib;

public class Reference {
    /* Basic constants */
    public static final String MOD_ID = "MGM";
    public static final String MOD_NAME = "Mythical Gods Mod";
    public static final String VERSION = "Alpha 1.0";
    
    /* Filepath Related Constants */
    public static final String RESOURCE_FOLDER = MOD_ID;
    public static final String PATH_RESOURCES = "/mods/" + RESOURCE_FOLDER + "/";
    public static final String PATH_TEXTURES = PATH_RESOURCES + "textures/";
    
    /* Paths to the cape files */
    public static final String PATH_CAPES_DEV = "https://dl.dropboxusercontent.com/u/31038502/TAM%20Capes/dev.png";
    public static final String PATH_CAPES_TESTER = "https://dl.dropboxusercontent.com/u/31038502/TAM%20Capes/tester.png";
    public static final String HTTP_CAPES_DEV = "http://tammodding.com/dev.txt";
    public static final String HTTP_CAPES_TESTER = "http://tammodding.com/tester.txt";
    public static final int CAPE_TICK_SKIP = 200; // Time in ticks (20 tick = 1 sec)
    
}
