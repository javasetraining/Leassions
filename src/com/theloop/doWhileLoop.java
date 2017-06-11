package com.theloop;


public class doWhileLoop {

    public static void main(String[] args) {
        int counter = 0; //days to run
        double amount;
        double principal = 10000; //initial subscibers amount
        double rate = .01; //rate per day
        do {
            amount = principal*Math.pow(1+rate, counter );
            System.out.print(counter);//shows days counter
            System.out.print(" ");
            String formattedDouble = String.format("%.2f", amount);
            System.out.println(formattedDouble);
            counter++;
        } while (amount <= 1_000_000);
    }
}
