package com.inheritance.polimorphism;


public class Animals {
    public Animals() {
    }

    private String name = "Animal";
    public String favFood = "Food";

    public String getName() {
        return this.name;
    }

    protected final void changeName(String newName) {
        this.name = newName;
    }

    public void eatStuff() {
        System.out.println("Yam" + favFood);
    }

    public void walkAround() {
        System.out.println(this.name + "walk around");
    }

    public Animals(String name, String favFood) {
        this.changeName(name);
        this.favFood = favFood;
    }
}
