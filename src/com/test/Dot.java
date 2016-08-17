package com.test;

public class Dot {
    private Dot d;
    private int size;

    public static void main(String[] args) {
        Dot dDot = new Dot();
        final Dot d2;
        d2 = dDot.setDot(dDot);

        System.out.print(d2.size);
    }

    private Dot setDot(Dot d3) {
        d3.size = 5;
        d3.d = new Dot();
        return d3;
    }


}
