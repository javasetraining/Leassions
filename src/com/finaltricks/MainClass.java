package com.finaltricks;


public class MainClass {
    public static void main(String[] args) {
        FinalTricksLession finalTricksLession = new FinalTricksLession(1);
        for (int i = 0; i <  50; i++) {
            finalTricksLession.add();
            System.out.println(finalTricksLession);
        }
    }
}
