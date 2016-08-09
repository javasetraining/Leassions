package io.hexlet.xo.model;

/*public class Field {

    public String f00;

    public String f01;

    public String f02;

    public String f10;

    public String f11;

    public String f12;

    public String f20;

    public String f21;

    public String f22;

    public int getSize() {
        return 3;
    }*/

public class Field {

    public String[][] figures = new String[3][3];

    public int getSize() {
        // BEGIN (write your solution here)
        return figures.length;
        // END
    }

    public String getFigure(final Point point) {
        // BEGIN (write your solution here)
        return figures[point.x][point.y];
        // END

    }

    public void setFigure(final Point point, final String figure) {
        // BEGIN (write your solution here)
        figures[point.x][point.y] = figure;
        // END
    }
}


