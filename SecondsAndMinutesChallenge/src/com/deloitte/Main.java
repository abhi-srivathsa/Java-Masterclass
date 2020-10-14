package com.deloitte;

public class Main {
    private static final String INVALID_MESSAGE = "Invalid value" ;

    public static void main(String[] args) {
        System.out.println(getDurationString(61, 62));
        System.out.println(getDurationString(-120));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && seconds >=0 && seconds <= 59){
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            return hours +"h " + remainingMinutes + "m " + seconds + "s";
        }
        return INVALID_MESSAGE ;
    }
    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            int minutes  = seconds / 60;
            seconds = seconds % 60;
            return getDurationString(minutes, seconds);
        }
        return INVALID_MESSAGE;
    }
}
