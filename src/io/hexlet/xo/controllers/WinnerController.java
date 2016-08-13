package io.hexlet.xo.controllers;


import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Point;
import io.hexlet.xo.model.exceptions.InvalidPointException;

public class WinnerController {

    public String getWinner(final Field field) {
        String winner;
        for (int i = 0; i < field.getSize(); i++) {
            winner = checkRow(field, i);
            if (winner != null) return winner;
            winner = checkColumn(field, i);
            if (winner != null) return winner;
        }
        winner = checkDiag1(field);
        if (winner != null) return winner;
        winner = checkDiag2(field);
        if (winner != null) return winner;

        return null;
    }

    private String checkDiag1(final Field field) {
        // 3 Points need to be created with the next cordinates:
        // p1 (0, 0)
        // p2 (1, 1)
        // p3 (2, 2)
        // BEGIN (write your solution here)
        final Point p1 = new Point(0, 0);
        final Point p2 = new Point(1, 1);
        final Point p3 = new Point(2, 2);
        // END

        if (field.getFigure(p1) != null && field.getFigure(p2) != null &&
                field.getFigure(p3) != null &&
                field.getFigure(p1).equals(field.getFigure(p2)) &&
                field.getFigure(p1).equals(field.getFigure(p3))) {
            return field.getFigure(p1);
        }
        return null;
    }

    private String checkDiag2(final Field field) {

        // 3 Points need to be created with the next cordinates:
        // p1 (2, 0)
        // p2 (1, 1)
        // p3 (0, 2)
        // BEGIN (write your solution here)
        final Point p1 = new Point(2, 0);
        final Point p2 = new Point(1, 1);
        final Point p3 = new Point(0, 2);
        // END

        if (field.getFigure(p1) != null && field.getFigure(p2) != null
                && field.getFigure(p3) != null &&
                field.getFigure(p1).equals(field.getFigure(p2)) &&
                field.getFigure(p1).equals(field.getFigure(p3))) {
            return field.getFigure(p1);
        }
        return null;
    }

    private String checkColumn(final Field field, final Integer i) {
        // 3 Points need to be created with the next cordinates:
        // p1 (0, i)
        // p2 (1, i)
        // p3 (2, i)
        // BEGIN (write your solution here)
        final Point p1 = new Point(0, i);
        final Point p2 = new Point(1, i);
        final Point p3 = new Point(2, i);
        // END

        if (field.getFigure(p1) != null && field.getFigure(p2) != null
                && field.getFigure(p3) != null &&
                field.getFigure(p1).equals(field.getFigure(p2)) &&
                field.getFigure(p1).equals(field.getFigure(p3))) {
            return field.getFigure(p1);
        }
        return null;
    }

    private String checkRow(final Field field, final Integer i) {
        // 3 Points need to be created with the next cordinates:
        // p1 (i, 0)
        // p2 (i, 1)
        // p3 (i, 2)
        // BEGIN (write your solution here)
        final Point p1 = new Point(i, 0);
        final Point p2 = new Point(i, 1);
        final Point p3 = new Point(i, 2);
        // END

        if (field.getFigure(p1) != null && field.getFigure(p2) != null
                && field.getFigure(p3) != null &&
                field.getFigure(p1).equals(field.getFigure(p2)) &&
                field.getFigure(p1).equals(field.getFigure(p3))) {
            return field.getFigure(p1);
        }
        return null;
    }

}
