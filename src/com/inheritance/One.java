package com.inheritance;


public class One extends Two {
    public static void main(String[] args) {
        System.out.println(new Three().getS());
        System.out.println(new Two().getS());
        Two two = new Two();
        two.sheIsOnDiet_FromThreeClass();
        two.doSomthingFromClassTWo();
        System.out.println("sout " + two.getS());
    }
}
