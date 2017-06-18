package com.array;


public class ArrayAverege {

    public static void main(String[] args) {
        System.out.println(averege(34, 34, 23, 65, 32, 3, 2, 1, 1, 1, 3, 9));
    }

    private static int averege(int... numbers) {
        int total = 0;
        for (int x : numbers)
            total += x;
        return total / numbers.length;
    }

}
