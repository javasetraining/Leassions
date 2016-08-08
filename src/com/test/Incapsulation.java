package com.test;

/**
 * Created by Code on 7/27/2016.
 */
public class Incapsulation {
    public static void main(String[] args) {
        PoorDog one = new PoorDog();
        System.out.println("размер " + one.getSize());
        System.out.println("имя " + one.getName());

    }
}

class PoorDog {
    private int size;
    private String name;

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
}
