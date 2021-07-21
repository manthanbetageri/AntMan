package com.challenges.pckg;

public class Challenge1 
{
    private static final String invalid_masg= "Invalid value";
    public static void main(String[] args)
    {

        System.out.println(getDurationString(3600,0));
        System.out.println(getDurationString(0, 3600));
        System.out.println(getDurationString(0, 3660));
        System.out.println(getDurationString(63, 6));
        System.out.println(getDurationString(60));
        System.out.println(getDurationString(59));
        System.out.println(getDurationString(3666));
    }
    public static String getDurationString(int minutes, int seconds) {
        String string = "";
        int secondsSum = minutes * 60 + seconds;
        if (minutes >= 0 && seconds >= 0 && seconds < 60) {
            string = ((int) (secondsSum / 3600)+"h "+((secondsSum % 3600)/60)+"m "+(secondsSum % 60) + "s");
        } else {
           return invalid_masg;
        }
        return string;
    }

    public static String getDurationString(int seconds) {
        String string = "";
        if (seconds >= 0) {
            string = getDurationString(seconds/60, seconds % 60);
        }
        return string;
    }
}