package com.test;

/**
 * Created by Code on 8/3/2016.
 */
public class VariableVision {
    public static void main(String[] args) {
        Dima dima;
        dima = new Dima();
        dima.age = 12;
        System.out.println("dima age = " + dima.age);
        dima.name = "sdfqwqwdqwd";
        System.out.println(dima.name);





    }
    public static class Dima {
        int age;
        String name;

    }
}



