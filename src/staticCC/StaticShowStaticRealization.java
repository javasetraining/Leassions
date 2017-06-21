package staticCC;


public class StaticShowStaticRealization {
    public static void main(String[] args) {
        StaticShowStaticClassCreatedManually showme = new StaticShowStaticClassCreatedManually("Иван", "Иванов");
/*        StaticShowStaticClassCreatedManually showme2 = new StaticShowStaticClassCreatedManually("three", "foure");
        StaticShowStaticClassCreatedManually showme3 = new StaticShowStaticClassCreatedManually("five", "six");
        StaticShowStaticClassCreatedManually showme4 = new StaticShowStaticClassCreatedManually("seven", "eight")*/;

        System.out.println("------------------");
        System.out.print(showme.getSecondName());
        System.out.printf("\t %d \n",StaticShowStaticClassCreatedManually.getMembersVariable());

        System.out.print(showme.getFirstname());
        System.out.printf("\t %d \n", StaticShowStaticClassCreatedManually.getMembersVariable());
    }
}

