package com.test;

/**
 * Created by MaRV on 8/13/2016.
 */
public class PointPrinter  {


    private int x = 2;
    protected int y = 3;
    private static int x1 = 4;
    protected static int y1 = 5;

    public static void main(String[] args) {
        int x1 = 8; int y1 = 9;
        new PointPrinter().show();
    }

    void show() {
        System.out.println(x + " " + y + " " + x1 + " " + y1);
    }
}