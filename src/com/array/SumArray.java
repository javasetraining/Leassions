package com.array;


public class SumArray {
    public static void main(String[] args) {

        ArraysForUse arraysForUse = new ArraysForUse();
        arraysForUse.returnArray();
        System.out.println("====");
        arraysForUse.returnArray();

        int array[] = {2, 5, 7, 8, 90};
        int sum = 0;

        for (int counter = 0; counter < array.length; counter++) {
            sum += array[counter];
        }
        System.out.println(sum);
//    public String countArray() {
        ArraysForUse arrayForSumm = new ArraysForUse();
        int arrayForSum[] =arrayForSumm.getArrayForUse();
        int summma = 0;

        for (int counter = 0; counter < arrayForSum.length; counter++) {
            summma += arrayForSum[counter];
        }
        System.out.println("sum= " + summma);
    }
}