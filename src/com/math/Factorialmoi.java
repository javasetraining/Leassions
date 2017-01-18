package com.math;


class Factorialmoi {
    int fact(int n) {
        int result;
        if (n == 0) return 1;

        result = fact(n - 1) * n;
        return result;
    }
}
/*
    static long fact(int n) {

        long result;
        if (n == 0 || n == 1)
            return 1;

        result = fact(n - 1) * n;
        return result;



    }

    static int fact2(int i) {
        int result;
        if (i == 0) return 1;

        result = fact2(i - 1) * i;
        return result;
    }*/



