package com.inheritance.polymorphismbukky;


import com.sun.org.apache.bcel.internal.generic.FADD;

public class Apples {
    public static void main(String[] args) {
/*        Food bucky[] = new Food[2];
        bucky[0] = new Potpie();
        bucky[1] = new Tuna();

        for (int x = 0; x < 2; ++x) {
            bucky[x].eat();
        }*/

        Fatty fatty = new Fatty();
        Food food1 = new Potpie();
        Food food = new Food();
        Food potpie = new Potpie();
        fatty.digest(potpie);
        fatty.digest(food);
        System.out.println("\n\n=========\n\n ");
        food1.eat();

        Bat somthigLikeBat = new Bat();
        System.out.println("\n\n=========\n\n ");
        somthigLikeBat.drink();
        somthigLikeBat.fly();
        System.out.println("\n\n=========\n\n ");
        Fatty bat = new Fatty();
        bat.showDigit(somthigLikeBat);
    }
}