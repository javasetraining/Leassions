package com.inheritance.box;


import static com.inheritance.box.Box.CONST_FINAL_42;

public class Runnable {
    public static void main(String[] args) {

        AnotherBox catBox = new AnotherBox();
        System.out.println(catBox.getBoxVolume(33, 33, 33));
        System.out.println();
        System.out.printf("That is the default box size: %d \n", catBox.getDefaultVolume());
//        System.out.println(CONST_FINAL_42); //catch const variable from method instance
        int variableForTest = CONST_FINAL_42;
        System.out.println(variableForTest);
    }
}
