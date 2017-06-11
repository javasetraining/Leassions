package com.nestedif;


public class Apples {
    int ageIs;

    public Apples(int ageIs) {
        this.ageIs = ageIs;
    }

    public int getAgeIs() {
        return ageIs;
    }

    public void setAgeIs(int ageIs) {
        this.ageIs = ageIs;
    }

    public void sayYourAge() {
        System.out.println(getAgeIs() > 50 ? "you are old" : "you are young");
    }
}



