package io.hexlet.xo.model;

public class Field {

    private final String[][] figures = new String[3][3];

    public int getSize() {
        return figures.length;
    }

    public String getFigure(final Point point) {
        // BEGIN (write your solution here)
        return figures[point.getX()][point.getY()];
        // END
    }

    public void setFigure(final Point point, final String figure) {
        // BEGIN (write your solution here)
        figures[point.getX()][point.getY()] = figure;
        // END
    }

}
