package com.array;


import java.io.IOException;

public class MinArray {
    public static void main(String[] args) throws IOException {
        int mas[] = {10, 39, 22, 12,2};
        int min = mas[0];
        for (int i : mas) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println(min);
    }
}
