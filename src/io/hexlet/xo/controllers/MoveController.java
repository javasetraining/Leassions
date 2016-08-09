package io.hexlet.xo.controllers;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Point;

public class MoveController {

    public boolean applyFigure(final Field field,
                               final Point point,
                               final String figure) {
        if (field.figures[point.x][point.y] != null) return false;
        if (field.figures[point.x][point.y] == null) field.setFigure(point, figure);
        return true;
    }}