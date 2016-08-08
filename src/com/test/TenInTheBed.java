package com.test;

/**
 * Created by MaRV on 7/24/2016.
 */
public class TenInTheBed {
    public static void main(String[] args) {

        int inTheBed = 10;
        String word = "OUCH!";
        System.out.println("♫ Here we go!" + System.lineSeparator());

        while (inTheBed > 1) {
            System.out.println(" There were " + inTheBed + "in the bed and the little one said, Roll over, roll over");
            System.out.println("So they all rolled over and one fell out.");
            inTheBed = inTheBed - 1;
            System.out.println(inTheBed + " ! ");
        }
        System.out.println(word + " Only you now in the bad! Goodnight!");
/*        ♫ Here we go!
                There were ten in the bed [Hold up 10 fingers.]
        and the little one said, [Hold your hands close together, indicating 'small.']
        "Roll over, roll over" [Roll hands around each other, or each student turns to the right and says, "Roll over! Roll over!"]
        So they all rolled over and one fell out. [Everyone rolls to the right and the student in the first chair 'falls out' of the bed.]
        Nine!
                */

        char ch1 = 61;
        System.out.println((int) ch1);

        int yourInt = ch1;
        char ch = (char) yourInt;
        System.out.println(yourInt);
        System.out.println(ch);


        System.out.println(String.format("%c", 61));
        System.out.println(String.format("%c", 61));
    }
}



