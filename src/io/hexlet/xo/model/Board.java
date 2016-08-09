package io.hexlet.xo.model;

import java.util.Arrays;

/**
 * Created by MaRV on 8/9/2016.
 */
public class Board {


    private static final int SIZE_FIELD = 9 ;
    private Figure[][] figures = new Figure[SIZE_FIELD][SIZE_FIELD];

    public void initArray(){
//        figures[0] = new Figure(SIZE_FIELD);

        figures[0][0] = new Figure("O");
        figures[0][0] = new Figure("x");

    }

    public void showBoard() {
//        System.out.println(Arrays.toString(this.figures ));
        System.out.println(Arrays.deepToString(this.figures));
    }
}
