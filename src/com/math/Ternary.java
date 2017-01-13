package com.math;

public class Ternary {

    public static void calculateTernary(int number) {

        String text = (number % 2 == 0) ? "четное" : "не четное";
        System.out.println("число " + number + " - " + text);

    }
}