package com.math;

/**
 * Created by MaRV on 8/8/2016.
 * <p>
 * java_methods_basics_part_2/quiz_unit
 */

public class Execute {
    public static void main(String[] args) {
        System.out.println();
    }

    class Factorialmoi {
        int fact(int n) {
            int result;
            if (n == 0) return 1;

            result = fact(n - 1) * n;
            return result;
        }
    }
}
/*
//        Sum sum = new Sum();
        Sum.sum(3, 20);
        int x = (int) System.currentTimeMillis() * -1;

        Ternary.calculateTernary(x);


        String word = "hello";
        Ternary.sayYes(word);
        System.out.println(Factorialmoi.fact(30));
        int i = 3;
        int resultat = Factorialmoi.fact2(i);

        System.out.println("the last result is " + resultat);
        System.out.println("reversed " + rev("abc"));
    }

    static String rev(String n){
//        String   n ;

        String reversed = new StringBuilder(n).reverse().toString();
//        System.out.println(reversed);
        return reversed;
//        return n;
    }}*/
