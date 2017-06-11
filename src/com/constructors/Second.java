package com.constructors;


public class Second {
    private String smbName;

    public void setSmbName(String smbName) {
        this.smbName = smbName;
    }

    private String getSmbName() {
        return smbName;
    }

    Second(String smbName) {
        this.smbName = smbName;
    }

    void saySmth() {
        System.out.println("hey " + getSmbName());
    }
}
