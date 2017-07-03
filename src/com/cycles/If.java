package com.cycles;

import java.util.Arrays;
import java.util.HashSet;

/**
 * show the string 10 times
 */
public class If {
    public static void main(String[] args) {
        String f = "jopa";
        String newArray[] = f.split("");
        String j = "jopa";
        String newArray2[] = j.split("");
        System.out.println(compareArrays(newArray, newArray2));

        for (int count = 0; count < newArray.length; count++) {
            System.out.println(count + "\t" + newArray[count]);
//            System.out.println(newArray.equals(newArray2));
        }
    }

    public static boolean compareArrays(String[] x, String[] y) {
        HashSet<String> set1 = new HashSet<String>(Arrays.asList(x));
        HashSet<String> set2 = new HashSet<String>(Arrays.asList(y));
        return set1.equals(set2);
    }
}
