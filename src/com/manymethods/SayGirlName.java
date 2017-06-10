package com.manymethods;


public class SayGirlName {
    private String girlName;

    public String getGirlName() {
        return girlName;
    }

    public void setGirlName(String girlName) {
        this.girlName = girlName;
    }

    public void saying(){
        System.out.println(getGirlName());
    }
}
