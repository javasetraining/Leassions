package io.hexlet.xo.model;

/**
 * Created by MaRV on 8/7/2016.
 */
public class Player {

    public final String name;


    private final String figure;

    public Player(String name, String figure) {
        this.name = name;
        this.figure = figure;
    }

    public String getName(){
        return name;
    }



}
