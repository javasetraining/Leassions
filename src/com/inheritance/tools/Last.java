package com.inheritance.tools;

public class Last {
    public static void main(String[] args) {
        Cats cats = new Cats();
//        Dogs dogs = new Dogs();

        Connector connector = new Connector();
        connector.makeMewSound(cats);
        connector.makeRuffSound(new Dogs()); // без раннего создания обхекта //

    }
}
