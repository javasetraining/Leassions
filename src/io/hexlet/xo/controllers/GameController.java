package io.hexlet.xo.controllers;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Figure;
import io.hexlet.xo.model.Player;

/**
 * Created by MaRV on 8/7/2016.
 */

public class GameController {


private static final int MIN_COORDINATE = 0;
private static final int MAX_COORDINATE = 2;

    private static final String GAME_NAME = "XO";
    private static final int PLAYERS_COUNT = 2;


    public Player currentPlayer() {
        return null;

    }

    public boolean move(final int x, final int y) {
        if (checkCoordinate(x) || checkCoordinate(y)) {
            return false;
        }

        return true;
    }

    Player player1;

    Player player2;

    Field field;

    String name;

    public String getGameName() {
        return GAME_NAME;
        
    }

    private static boolean checkCoordinate(final int coordinate){
        if (coordinate < MIN_COORDINATE || coordinate > MAX_COORDINATE) return false;
            return false;
        }
}

