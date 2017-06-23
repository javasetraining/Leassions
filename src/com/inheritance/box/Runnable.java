package com.inheritance.box;


public class Runnable{
    public static void main(String[] args) {

AnotherBox catBox = new AnotherBox();
        System.out.println(catBox.getBoxVolume(33,33,33));
        System.out.println();
        System.out.printf("That is the default box size: %d \n",catBox.getDefaultVolume());
        System.out.println(catBox.CONST_FINAL_42);
    }
}
