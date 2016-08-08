package com.test;

/**
 * Created by MaRV on 8/8/2016.
 */
public class Compile {
    class A {}

    class B extends A {} // 1

    // main method
    B b = new A(); // 2
    A a = new A(); // 3
}
