package com.array;


import java.io.IOException;

/**
 * Min Max array and
 */
public class MinArray {
    public static void main(String[] args) {
        int mas[] = {10, 39, 1, -22, 12, 2};
        int min = mas[0];
        for (int i : mas) {
            if (i < min) {
                min = i;
            }
        }

        String strName = "java";
        String strName2 = "java";
        String[] strArray = new String[] {strName};
        String[] strArray2 = new String[] {strName2};
        System.out.println("strArray = " + strArray[0]);
        System.out.println("strArray2 = " + strArray2[0]);
        System.out.println(strArray == strArray2 );
//        Arrays.display(strArray);
        System.out.println("+++++++++++");

        System.out.println("show min array " + min);
        int max = mas[0];
        for (int i : mas) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("show array max " + max);

        int a, b;

        for (a = 1, b = 9; a < b; a++, b--) {
            System.out.println("a = " + a + "\n");
            System.out.println("b = " + b + "\n");
            int q = a + b;
            System.out.println(q);
        }

    }
}
