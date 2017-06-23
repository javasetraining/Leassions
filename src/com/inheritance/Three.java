package com.inheritance;


class Three {


    int getS() {
        return s;
    }

    private final int s = 42;

    void sheIsOnDiet_FromThreeClass(){
        System.out.println("im on diet! " + s);
    }
    static String showString(){
        return "this is the string from the third method";
    }
}
