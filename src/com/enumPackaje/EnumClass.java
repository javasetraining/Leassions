package com.enumPackaje;

public enum EnumClass {
    first("nice", "22"),
    second("cute", "16"),
    third("imnotshure", "21"),
    fifth("interesting", "21"),
    sixth("so-so", "21");

    private final String desc;
    private final String age;

    EnumClass(String description, String aGesmd) {
        desc = description;
        age = aGesmd;
    }

    public String getDesc() {
        return desc;
    }

    public String getAge() {
        return age;
    }
}


