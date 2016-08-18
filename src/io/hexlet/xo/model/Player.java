package io.hexlet.xo.model;

public class Player {

    private final String name;

    private final String figure;

    // creat the constructor
    // BEGIN (write your solution here)

    Player(final PlayerBuilder playerBuilder){
        this.name = playerBuilder.getName();
        this.figure = playerBuilder.getFigure();
    }

    // END

    public String getName() {
        return name;
    }

    public String getFigure() {
        return figure;
    }

}
