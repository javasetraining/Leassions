package com.test;
import java.util.*;

/**
 * Created by MaRV on 8/12/2016.
 */

public class PointGenerator extends Point {

    public static void main(String[] args) {
        new PointGenerator().showPoint1();
        new PointGenerator().showPoint2();
        new PointGenerator().showPoint3();
    }

    private void showPoint1() {
        System.out.print("Point1 ");
        }


    private void showPoint2() {
        System.out.print("Point2 ");
    }

    protected void showPoint3() {
        System.out.print("Point3 ");
    }

}