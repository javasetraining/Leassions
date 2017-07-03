package com.inheritance.polymorphismbukky;

public class Bat extends Eat{

    @Override
    public void drink() {
        System.out.println("hi am method drink");
    }

    @Override
    public void fly() {
        System.out.println("hi iam method fly");
    }
}
