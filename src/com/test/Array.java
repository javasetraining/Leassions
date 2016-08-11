package com.test;

/**
 * Created by MaRV on 8/10/2016.
 */
public class Array {

    public static void main(String[] args) {

//
//
//        int[] x = new int[2]; ok
//        int x[][] = new int[]{{2}, {3, 4}}; not
//        int[2] x = new int[2]; not
//        int x[][] = new int[2][2]; ok
//        int x[][] = new int[2][]; ok
//        int[2] x = new int[]; not
//        int[] x = new int[]{2, 3, 4}; ok
//        int[] x = {2, 5, 6}; ok
//        int[] x = new int[3]{2, 3, 4}; not
//        int x[][] = new int[][]{{}}; ok
//        int x[][] = new int[][]{{2}, {3, 4}}; ok


        int[][] m = {{1, 2, 4}, {1, 6}, {2, 8, 9}};
        System.out.println(m[1][1]);
    }
}
