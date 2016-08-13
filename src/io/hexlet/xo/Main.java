package io.hexlet.xo;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Point;
import io.hexlet.xo.model.Player;
import io.hexlet.xo.model.Game;
import io.hexlet.xo.model.exceptions.*;
import io.hexlet.xo.view.*;
import io.hexlet.xo.controllers.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import java.util.Arrays;

public class Main {

    public static void main(String... args) {
        final Field field = new Field();
        final CurrentMoveController cmc = new CurrentMoveController();


        if (!cmc.currentMove(field).equals("X")){
            throw new RuntimeException("do not returns X when the field is empty");
        }

        for (int i = 0; i < field.getSize(); i++)
            for (int i2 = 0; i2 < field.getSize(); i2++) {
                if (i * i2 == 4) break;
                final Point p = new Point(i, i2);
                final String figure = (i * 3 + i2) % 2 == 0 ? "X" : "O";
                field.setFigure(p, figure);
                System.out.printf("putting figure: %s to the: X:%d Y:%d\n", figure, p.getX(), p.getY());
                if (cmc.currentMove(field).equals(figure)){
                    throw new RuntimeException(String.format("returns %s for the field", figure));
                }

            }

        checkField(null, null, null, null, null, null, null, null, null, null);
        checkField("X", "X", "X", "X", null, null, null, null, null, null);
        checkField("O", null, null, "O", "O", "O", "O", "X", null, null);
        checkField("X", null, null, null, null, null, null, "X", "X", "X");
        checkField("O", "O", "X", null, null, "O", null, null, null, "O");

        testPrivateMethod("countFiguresInTheRow", CurrentMoveController.class, Field.class, Integer.class);
        testPublicMethod("currentMove", CurrentMoveController.class, Field.class);
        testPublicMethod("applyFigure", MoveController.class, Field.class, Point.class, String.class);
        testPublicMethod("getWinner", WinnerController.class, Field.class);
        testPrivateMethod("checkDiag1", WinnerController.class, Field.class);
        testPrivateMethod("checkDiag2", WinnerController.class, Field.class);
        testPrivateMethod("checkColumn", WinnerController.class, Field.class, Integer.class);
        testPrivateMethod("checkRow", WinnerController.class, Field.class, Integer.class);

        final Player p = new Player("Slava", "X");
        if (!p.getName().equals("Slava")) throw new RuntimeException(String.format("Player.getName returns %s instead of %s", p.getName(), "Slava"));
        if (!p.getFigure().equals("X")) throw new RuntimeException(String.format("Player.getFigure returns %s instead of %s", p.getFigure(), "X"));
        final Player p2 = new Player("Gleg", "O");
        final Game g = new Game(p, p2, field, "XO");
        if (!g.getPlayer1().equals(p)) throw new RuntimeException(String.format("Game.getPlayer1 returns %s instead of %s", g.getPlayer1(), p));
        if (!g.getPlayer2().equals(p2)) throw new RuntimeException(String.format("Game.getPlayer2 returns %s instead of %s", g.getPlayer2(), p2));
    }

    private static void checkField(String winner, String... field) {
        final Field f = new Field();
        for (int i = 0; i < field.length; i++) {

            final int x = i % 3;

            final int y = (i - i % 3) / 3;
            final Point p = new Point(x, y);
            f.setFigure(p, field[i]);

        }
        final WinnerController wc = new WinnerController();
        if (winner == null && wc.getWinner(f) != null)
            throw new RuntimeException(String.format("Incorrectly show winner, it shows: %s", wc.getWinner(f)));
        if (winner != null && !winner.equals(wc.getWinner(f)))
            throw new RuntimeException(String.format("Incorrectly show winner, it shows: %s", wc.getWinner(f)));

    }

    private static void testPrivateMethod(final String methodName, final Class zClass, final Class<?>... parameterTypes) {
        try {
            final Method field = zClass.getDeclaredMethod(methodName, parameterTypes);
            if (!Modifier.isPrivate(field.getModifiers())) throw new RuntimeException("method " + methodName + " has incorrect visibility level");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            throw new RuntimeException("method " + methodName + " not found");
        }
    }

    private static void testPublicMethod(final String methodName, final Class zClass, final Class<?>... parameterTypes) {
        try {
            final Method field = zClass.getDeclaredMethod(methodName, parameterTypes);
            if (!Modifier.isPublic(field.getModifiers())) throw new RuntimeException("method " + methodName + " has incorrect visibility level");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            throw new RuntimeException("method " + methodName + " not found");
        }
    }

}
