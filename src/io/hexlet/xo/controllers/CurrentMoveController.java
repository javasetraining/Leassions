package io.hexlet.xo.controllers;

import io.hexlet.xo.model.Point;
import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.exceptions.InvalidPointException;

public class CurrentMoveController {

    public String currentMove(final Field field) {
        int countFigure = 0;
        for (int x = 0; x < field.getSize(); x++) {
            countFigure += countFiguresInTheRow(field, x);
        }

        if (countFigure == field.getSize() * field.getSize())
            return null;

        if (countFigure % 2 == 0)
            return "X";

        return "O";
    }

    private int countFiguresInTheRow(final Field field, final Integer row) {
        int countFigure = 0;
        for (int x = 0; x < field.getSize(); x++) {
            // Create here Point p
            // with
            // x = x
            // y = row
            // BEGIN (write your solution here)
            final Point p = new Point(x, row);
            // END
            if (field.getFigure(p) != null)
                countFigure++;
        }
        return countFigure;
    }

}
