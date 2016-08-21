package io.hexlet.xo.view;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Point;
import io.hexlet.xo.model.Player;
import io.hexlet.xo.model.Figure;
import io.hexlet.xo.model.Game;
import io.hexlet.xo.model.GameBuilder;
import io.hexlet.xo.model.exceptions.*;
import io.hexlet.xo.view.*;
import io.hexlet.xo.controllers.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import java.util.Arrays;

public class Main {

    public static void main(String... args) {
        final Player p1 = new Player("Slava", Figure.X);
        final Player p2 = new Player("Gleb", Figure.O);
        final Field field = new Field();
        final Game game = new GameBuilder().player1(p1).player2(p2).field(field).name("XO").build();
        final ConsoleView cv = new ConsoleView();

        final StringBuilder separatorBuilder = new StringBuilder();
        final String expectedSeparator = "~~~~~~~~~~~\n";
        cv.generateSeparator(separatorBuilder);
        final String actualSeparator = separatorBuilder.toString();

        if (!expectedSeparator.equals(actualSeparator)) {
            throw new RuntimeException(String.format("Separator generated: \"%s\" instead of \"%s\"", actualSeparator, expectedSeparator));
        }

        field.setFigure(new Point(0, 0), Figure.X);
        field.setFigure(new Point(1, 0), Figure.O);

        final StringBuilder lineBuilder = new StringBuilder();
        final String expectedLine = " X | O |   \n";
        cv.generateLine(field, 0, lineBuilder);
        final String actualLine = lineBuilder.toString();

        if (!expectedLine.equals(actualLine)) {
            throw new RuntimeException(String.format("Line generated: \"%s\" instead of \"%s\"", actualLine, expectedLine));
        }

        cv.show(game);
    }

}
