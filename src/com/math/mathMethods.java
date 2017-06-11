package com.math;


import java.util.Random;

public class mathMethods {
    public static void main(String[] args) {
        System.out.println(Math.abs(-44));
        System.out.println(Math.floor(4.4));
        System.out.println(Math.ceil(4.4));
        System.out.println(Math.max(3, 9));
        System.out.println(Math.sqrt(9));
        System.out.println(factorial(1));

        Random random = new Random();
        int randomNumber;
        randomNumber = 1+random.nextInt(6);
        System.out.println(randomNumber);

    }


    public static long factorial(int N) {
        long multi = 1;
        for (int i = 1; i <= N; i++) {
            multi = multi * i;
        }
        return multi;
    }
}