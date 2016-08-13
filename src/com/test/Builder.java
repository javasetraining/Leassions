package com.test;

/**
 * Created by MaRV on 8/13/2016.
 */
public class Builder {
    public Builder(final String name, final String phone, final String adress, final String mail) {
        this.name = name;
        this.phone = phone;
        this.adress = adress;
        this.mail = mail;
    }

    private final String name;
    private final String phone;
    private final String adress;
    private final String mail;


}
