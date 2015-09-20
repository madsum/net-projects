package com.masum.foregroundservice;

public class Constants {
    public interface ACTION {
        public static String MAIN_ACTION = "com.masum.foregroundservice.action.main";
        public static String PREV_ACTION = "com.masum.foregroundservice.action.prev";
        public static String PLAY_ACTION = "com.masum.foregroundservice.action.play";
        public static String NEXT_ACTION = "com.truiton.foregroundservice.action.next";
        public static String STARTFOREGROUND_ACTION = "com.truiton.foregroundservice.action.startforeground";
        public static String STOPFOREGROUND_ACTION = "com.truiton.foregroundservice.action.stopforeground";
    }

    public interface NOTIFICATION_ID {
        public static int FOREGROUND_SERVICE = 101;
    }
}