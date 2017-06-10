package com.math;


import java.util.Scanner;

public class Apples {
    public static void main(String[] args) {
        Scanner fnumber = new Scanner(System.in);
        MyFactorial myFactorial = new MyFactorial();
        int number = Integer.parseInt(fnumber.nextLine());
        System.out.println(myFactorial.returnFactorial(number));
    }
}
