package io.hexlet.xo.model;

public class Player {

    private final String name;

    private final String figure;

    // BEGIN (write your solution here)
    public Player(final String name, final String figure) {
        this.name = name;
        this.figure = figure;
    }

    public String getName() {
        return name;
    }

    public String getFigure() {
        return figure;
    }
    // END
}
