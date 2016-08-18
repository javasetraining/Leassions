package io.hexlet.xo.model;

public class Game {

    private final Player player1;

    private final Player player2;

    private final Field field;

    private final String name;

    // creat the constructor
    // BEGIN (write your solution here)

    Game(final GameBuilder gameBuilder) {
        this.player1 = gameBuilder.getPlayer1();
        this.player2 = gameBuilder.getPlayer2();
        this.field = gameBuilder.getField();
        this.name = gameBuilder.getName();
//        this.player1 = player1;
//        this.player2 = player2;
//        this.field = field;
//        this.name = name;
    }

    // END

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

}
