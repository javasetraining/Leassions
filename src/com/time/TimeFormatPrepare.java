package com.time;


import java.text.SimpleDateFormat;

public class TimeFormatPrepare {
    public TimeFormatPrepare(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    private int hour;
    private int minute;
    private int second;

    public TimeFormatPrepare() {

    }


    public void setTime() {
        hour = ((hour >= 0 && hour < 24) ? hour : 0);
        minute = ((minute >= 0 && minute < 24) ? minute : 0);
        second = ((minute >= 0 && second < 24) ? second : 0);
    }

    public String toMilitary() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStringMethod() {
        return String.format("%02d:%02d:%02d",
                hour == 0 || hour == 12 ? 12 : hour % 12, minute, second, (hour < 12 ? "AM" : "PM"));
    }

    public String preferedDateFormatShow(SimpleDateFormat dateFormat) {

        return String.format(new SimpleDateFormat("hh:mm a").format(new TimeFormatPrepare()));
    }

}
