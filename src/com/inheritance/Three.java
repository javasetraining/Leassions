package com.inheritance;


class Three {


    int getS() {
        return s;
    }

    private final int s = 42;

    void sheIsOnDiet_FromThreeClass(){
        System.out.println("im on diet! " + s);
    }
}
