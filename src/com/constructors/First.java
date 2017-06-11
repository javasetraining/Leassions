package com.constructors;


public class First {
    public static void main(String[] args) {

        Second secondClass = new Second("Name1");
        Second secondClass2 = new Second("Name2");
        Second secondClass3 = new Second("Name3");
        secondClass.saySmth();
        secondClass2.saySmth();
        secondClass3.setSmbName("Kaly");
        secondClass3.saySmth();
    }
}
