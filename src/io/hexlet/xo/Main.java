package io.hexlet.xo;

import io.hexlet.xo.model.*;
import io.hexlet.xo.model.exceptions.*;
import io.hexlet.xo.view.*;
import io.hexlet.xo.controllers.*;

public class Main {

    public static void main(String... args) {
        Board board = new Board();
        board.showBoard();
        final Point p = new Point();
        p.x = 2;
        p.y = 3;

        final Player player = new Player();
        player.name = "Slava";
        player.figure = "X";

//        Game game = new Game();
//        game.player1 = new Player();
//        game.player2 = new Player();
//        game.name = "XO";
//        game.field = new Field();


//        final Field field = new Field();
//        field.f00 = "X";
//        field.f01 = "X";
//        field.f02 = "X";
//
//        field.f10 = "X";
//        field.f11 = "X";
//        field.f12 = "X";
//
//        field.f20 = "X";
//        field.f21 = "X";
//        field.f22 = "X";

//        final ConsoleView cv = new ConsoleView();
//        cv.show(game);
//        cv.move(game);

//        final CurrentMoveController cmc = new CurrentMoveController();
//        final String currentFigure = cmc.currentMove(field);
//        if (!currentFigure.equals("X")) {
//            throw new RuntimeException(String.format("CurrentMoveController returns %s, instead of X", currentFigure));
//        }
//
//        final MoveController mc = new MoveController();
//        mc.applyFigure(field, p, "X");
//
//        final WinnerController wc = new WinnerController();
//        final String winner = wc.getWinner(field);
//        if (!winner.equals("X")) {
//            throw new RuntimeException(String.format("WinnerController returns %s, instead of X", winner));
//        }

        final Exception e = new AlreadyOccupiedException();
        final AbstractXOException e2 = new AlreadyOccupiedException();
        final AbstractXOException e3 = new InvalidPointException();
        final RuntimeException e4 = new XOCriticalException();
    }

}
