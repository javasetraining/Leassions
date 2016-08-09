package io.hexlet.xo.controllers;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Player;

/**
 * Created by MaRV on 8/7/2016.
 */

public class Game {

    private static final String GAME_NAME = "XO";
    private Player[] players;

    public Player currentPlayer() {
        return null;

    }

    public boolean move(final int x, final int y) {
        if (x < 0) {
            return false;
        }
        if (y < 0) {
            return false;
        }
        if (x >= 3) {
            return false;
        }
        if (x >= 4) {
            return false;
        }
        return true;
    }

    public Player player1;

    public Player player2;

    public Field field;

    public String name;

    public String getGameName() {
        return GAME_NAME;
    }
}

