package com.inheritance.box;


public class Box {
    int width;
    int height;
    int depth;
    static final int CONST_FINAL_42 = 12;


    public Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }


    Box() {
        width = 10;
        height = 10;
        depth = 10;
    }
}
