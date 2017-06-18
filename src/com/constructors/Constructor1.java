package com.constructors;


public class Constructor1 {
    public static void main(String[] args) {
//        Constructor2 constructor2 = new Constructor2();
//        constructor2.setAnaAge(333);
//        System.out.println(constructor2.getAnaAge());
        System.out.println(Constructor2.anaAge);
        Constructor2 constructor2 = new Constructor2();
        constructor2.setAnaAge(2);
        System.out.println(constructor2.getAnaAge());
    }

}
