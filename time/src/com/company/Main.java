package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.print(time());
    }

    public static String time(){
        long currentMicrosecond = (System.currentTimeMillis()+3600*8*1000)/1000;

        long currentSecond = currentMicrosecond%60;

        long currentMin = currentMicrosecond/60%60;

        long currentHour = currentMicrosecond/3600%24;

        String time = currentHour+":"+currentMin+":"+currentSecond;

        return time;
    }
}
