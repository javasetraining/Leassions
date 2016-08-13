package io.hexlet.xo.controllers;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Point;

public class MoveController {

    public boolean applyFigure(final Field field,
                               final Point point,
                               final String figure) {
        if (field.getFigure(point) != null)
            return false;
        field.setFigure(point, figure);
        return true;
    }

}
