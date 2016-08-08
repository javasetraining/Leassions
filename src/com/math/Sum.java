package com.math;

/**
 * Created by MaRV on 8/8/2016.
 *
 * java_methods_basics_part_2/quiz_unit
 *
 */
public class Sum {
    public static void sum(int x, int y) {
        int z = 4;
        if (z <= x) {
            z = x + 1;
        } else {
            z = z + 9;
        }
        if (z <= y) {
            y++;
        }
        System.out.println(z + " " + y);
    }
}
