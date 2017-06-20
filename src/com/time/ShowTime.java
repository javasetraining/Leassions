package com.time;


import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.text.SimpleDateFormat;

public class ShowTime {
    public static void main(String[] args) {
        TimeFormatPrepare timeFormatPrepare = new TimeFormatPrepare(13, 12, 12);
        System.out.println(timeFormatPrepare.toMilitary());
        System.out.println(timeFormatPrepare.toStringMethod());
        timeFormatPrepare.setTime();
        System.out.println(timeFormatPrepare.toMilitary());
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy hh.mm.ss.S aa");
//        System.out.println(timeFormatPrepare.preferedDateFormatShow(13,13,13)); //cant get the time from the pararmeter //TODO: somebody rewrite this crap

        Constructor40 constructor40 = new Constructor40();
        Constructor40 constructor40_1 = new Constructor40(1);
        Constructor40 constructor40_2 = new Constructor40(2, 2);
        Constructor40 constructor40_3 = new Constructor40(1, 2, 4);

/*
        System.out.println(constructor40.toMilitary());
        System.out.println(constructor40_1.toMilitary());
        System.out.println(constructor40_2.toMilitary());
        System.out.println(constructor40_3.toMilitary());
*/
    }
}
