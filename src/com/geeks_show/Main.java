package com.geeks_show;

/**
 * Created by MaRV on 10/25/2016.
 */
public class Main {
    public static void main(String[] args) {

        Math m = new Math();
        Math m2 = new Math();
        m.a = 1;
        m.b = 2;
        m2.a = 3;
        m2.b = 4;
        m.showA();
        m.showB();
        m2.showB();
    }
}