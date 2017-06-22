package com.inheritance.polimorphism;

public class Cats extends Animals {
    public String favToy = "yeern";

    public void playWith() {
        System.out.println("Yarn" + favToy);
    }

    public void walkAround() {
        System.out.println(this.getName() + "stalks around");
    }
}
