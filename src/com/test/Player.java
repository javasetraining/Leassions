package com.test;

/**
 * Created by MaRV on 8/13/2016.
 */
public class Player {
    String lvl = "0";

    public static void main(String[] args) {
        Player p1 = new Player();
        setPl(p1);
        System.out.println(p1.lvl);
    }

    static void setPl(Player p) {
        final Player p1 = new Player();
        p = p1;
        p.lvl = "1";

    }
}
