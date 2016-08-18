package io.hexlet.xo.model;


public final class GameBuilder {
    private Player player1;
    private Player player2;
    private Field field;
    private String name;

    public GameBuilder() {
    }

    public static GameBuilder aGame() {
        return new GameBuilder();
    }

    public GameBuilder player1(Player player1) {
        this.player1 = player1;
        return this;
    }

    public GameBuilder player2(Player player2) {
        this.player2 = player2;
        return this;
    }

    public GameBuilder field(Field field) {
        this.field = field;
        return this;
    }

    public GameBuilder name(String name) {
        this.name = name;
        return this;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public Field getField() {
        return field;
    }

    public String getName() {
        return name;
    }


    public Game build() {
        return new Game(this);
    }
}
