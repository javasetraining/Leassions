package io.hexlet.xo.controllers;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Point;

public class CurrentMoveController {

    public String currentMove(final Field field) {
        // BEGIN (write your solution here)
        int x = 0;
        int y = 0;
        for(
                int i = 0;
                i<field.getSize();i++)
            for(
                    int i2 = 0;
                    i2<field.getSize();i2++)

            {
                final Point p = new Point();
                p.x = i;
                p.y = i2;
                final String figure = field.getFigure(p);
                if (figure == null) continue;
                // вместо "equals" можно использовтаь стандартный оператор "==",
                // но рекомендуется поискать то, зачем использовать именно "equals" для сравнения строк.
                if (figure.equals("X")) x++;
                if (figure.equals("O")) y++;
            }

        return x==y?"X":"O";
    }
    // END
}

