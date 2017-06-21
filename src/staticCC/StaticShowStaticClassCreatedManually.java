package staticCC;


public class StaticShowStaticClassCreatedManually {
    private String first;
    private String second;

    private static int number = 0;

    public StaticShowStaticClassCreatedManually(String fn, String sc) {
        this.first = fn;
        this.second = sc;
        number++;

//        System.out.printf("You can write here all you wand %s, %s, d%/n", first,second,number);
        System.out.printf("the %s jumped over the %s, %d times \n", first,second,number);
    }


}