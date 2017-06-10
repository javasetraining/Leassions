package com.math;

class MyFactorial {
    int returnFactorial(int number) {
        int fact = 1;
        for (int i = 1; number >= i; i++) {
            fact *= i;
        }
        return fact;
    }
//        if (n == 0 || n == 1) return 1;
//        result = fact(n - 1) * n;
}