package com.array;


public class ArraysForUse {

    private static int arrayForUse[] = {1, 2, 5, 7, 88, 5};

    protected void returnArray() {
        for (int count = 0; count < arrayForUse.length; count++) {
        System.out.println(count + "\t" + arrayForUse[count]);

        }
    }

    public int[] getArrayForUse() {
        return arrayForUse;
    }

    public void writeMeArray() {
        System.out.println(getArrayForUse().toString());
    }

    public static int[] numbers() {
        int[] A = {1, 2, 3};
        return A;
    }
}
