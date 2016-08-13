package io.hexlet.xo.model;

public class Game {

    private final Player player1;

    private final Player player2;

    private final Field field;

    private final String name;

    // BEGIN (write your solution here)
    public Game(final Player p1, final Player p2, final Field field, final String name) {
        this.player1 = p1;
        this.player2 = p2;
        this.field = field;
        this.name = name;
    }

    public Player getPlayer1() {
        return this.player1;
    }

    public Player getPlayer2() {
        return this.player2;
    }

    public Field getField() {
        return field;
    }

    public String getName() {
        return name;
    }
    // END

}
