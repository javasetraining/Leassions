package staticCC;


public class StaticShowStaticClassCreatedManually {
    private String first;
    private String second;

    private static int number = 0;

    public StaticShowStaticClassCreatedManually(String firstName, String secondName) {
        this.first = firstName;
        this.second = secondName;
        final int i = number++;

        System.out.printf("the %s jumped over the %s,\t %d times \n", first, second, number);
    }

    public String getFirstname() {
        return first;
    }

    public String getSecondName() {
        return second;
    }

    public static int getMembersVariable() {
        return number;
    }
/*
        Little bit about formatting http://alvinalexander.com/programming/printf-format-cheat-sheet
        Also everything is described in http://docs.oracle.com/javase/6/docs/api/java/util/Formatter.html#detail



                %c	character
                %d	decimal (integer) number (base 10)
                %e	exponential floating-point number
                %f	floating-point number
                %i	integer (base 10)
                %o	octal number (base 8)
                %s	a string of characters
                %u	unsigned decimal (integer) number
                %x	number in hexadecimal (base 16)
                %%	print a percent sign
                \%	print a percent sign

                \a	audible alert
                \b	backspace
                \f	form feed
                \n	newline, or linefeed
                \r	carriage return
                \t	tab
                \v	vertical tab
                \\	backslash
*/
}