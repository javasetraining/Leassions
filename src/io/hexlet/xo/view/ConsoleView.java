package io.hexlet.xo.view;


import io.hexlet.xo.controllers.CurrentMoveController;
import io.hexlet.xo.controllers.MoveController;
import io.hexlet.xo.controllers.WinnerController;
import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Figure;
import io.hexlet.xo.model.Game;
import io.hexlet.xo.model.Point;
import io.hexlet.xo.model.exceptions.AlreadyOccupiedException;
import io.hexlet.xo.model.exceptions.InvalidPointException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleView {

    public void show(final Game game) {
        final Field field = game.getField();
        final StringBuilder fieldBuilder = new StringBuilder();
        for (int x = 0; x < field.getSize(); x++) {
            if (x != 0)
                generateSeparator(fieldBuilder);
            generateLine(field, x, fieldBuilder);
        }
        System.out.println(fieldBuilder.toString());
    }

    public boolean move(final Game game) {
        return true;
    }

    void generateLine(final Field field,
                      final int x,
                      final StringBuilder sb) {
        // BEGIN (write your solution here)
        for (int y = 0; y < field.getSize(); y++) {
            if (y != 0)
                sb.append("|");
            sb.append(" ");
            final Figure figure;
            figure = field.getFigure(new Point(y, x));
            sb.append(figure != null ? figure : " ");
            sb.append(" ");
        }
        sb.append("\n");
        // END
    }

    public void generateSeparator(final StringBuilder sb) {
        // BEGIN (write your solution here)
        sb.append("~~~~~~~~~~~\n");
        // END
    }

}
