package com.test;

/**
 * Created by MaRV on 8/12/2016.
 */
public class SSS {

    static int getChoice(String name) {
        switch (name) {
            case "X":
                return 1;
            case "O":
                return 2;
        }
        return 0;
    }

    public static void main(String[] args) {
        String name = "X";
        int result = getChoice(name);
        System.out.print(result);
        System.out.print(getChoice("O"));
    }
}