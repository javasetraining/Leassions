package com.array;


public class Array {
    public static void main(String[] args) {
        int myArray[] = new int[10];
        int myArrayInitialized[] = {1, 2, 5, 7, 8, 5};

        myArray[0] = 143;
        myArray[3] = 43;
        myArray[7] = 1343;
        System.out.println(myArray[7]);
//        System.out.println(myArray[11]);/*ArrayIndexOutOfBoundsException*/

        System.out.println("myArrayInitialized is " + myArrayInitialized[2]);
        System.out.println("============================");

        int newArray[] = {1, 66, 3, 5, 234, 3, 8};
        for (int count = 0; count < newArray.length; count++) {
            System.out.println(count + "\t" + newArray[count]);
        }
    }
}
