package com.math;

/**
 * Created by MaRV on 8/8/2016.
 * <p>
 * java_methods_basics_part_2/quiz_unit
 */
public class Execute {
    public static void main(String[] args) {

        Sum sum = new Sum();
        Sum.sum(3, 20);
        int x = (int) System.currentTimeMillis() * -1;

        Ternary.calculateTernary(x);



    }
}