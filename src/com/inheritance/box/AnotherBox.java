package com.inheritance.box;


public class AnotherBox extends Box {

    public int getBoxVolume(int width,int height,int depth) {
        return width * height * depth;
    }
    public int getDefaultVolume(){
        return width*height*depth;
    }


}
