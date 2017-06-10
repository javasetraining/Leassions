package com.manymethods;


import java.util.Scanner;

public class SaySmth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SayGirlName tuna = new SayGirlName();
        String temp = scanner.nextLine();
        tuna.setGirlName(temp);
        tuna.saying();

    }
}
