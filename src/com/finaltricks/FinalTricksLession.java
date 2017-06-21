package com.finaltricks;


public class FinalTricksLession {
    private int sum;
    private final int NUMBER;

    public FinalTricksLession(int x) {
        NUMBER = x;
    }

    public void add(){
        sum+=NUMBER;
    }

    @Override
    public String toString() {
        return "FinalTricksLession{" +
                "sum=" + sum +
                '}';
    }
}
