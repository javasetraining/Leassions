package com.static_lvl_method;

/**
 * Created by MaRV on 8/8/2016.
 */
public class Static {
    public static int a = 12;
    public int b = 13;
    private static final String GAME_NAME = "PokemonGo";


    public static void main(String[] args) {
        final Static a1 = new Static();
        final Static a2 = new Static();

        Static.a = -13;  // Так правильно обрааться потому что запись была в переменную мтатисемкую самого метода
      //  a1.a = -13; // Так по каличному!! Нельзя так!
        a2.b = -13;
        System.out.println(a1.b);
        System.out.println(a2.a);
        System.out.println(Static.GAME_NAME);


    }

}
