package com.enumPackaje;

import java.util.EnumSet;

public class ShowMyEnum {
    public static void main(String[] args) {
        for (EnumClass enumClass : EnumClass.values())
            System.out.printf("%s\t%s\t%s\n", enumClass, enumClass.getDesc(), enumClass.getAge());

        System.out.println("\nArange for another EnumSet tutorial\n");

        for (EnumClass peopleEnumSet : EnumSet.range(EnumClass.second, EnumClass.fifth))
            System.out.printf("%s\t%s\t%s\n", peopleEnumSet, peopleEnumSet.getDesc(), peopleEnumSet.getAge());
    }
}