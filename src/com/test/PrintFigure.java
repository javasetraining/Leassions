package com.test;


public class PrintFigure {
    static Figure f;
    enum Figure {
        KRESTIK, Nolik;
        int count = 0;
        public static void main(String[] args) {
            System.out.print(f.KRESTIK.count + " " + f.Nolik.count + " ");
        }    Figure() {
            System.out.print("x ");
            count = count + 1;
        }
    }
}