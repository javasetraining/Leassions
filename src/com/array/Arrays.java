package com.array;

public class Arrays {
    public static void main(String[] args) {
        int firstArray[][] = {{1, 2, 3}, {4, 5, 6}};
        int secondArray[][] = {{11, 12, 13}, {55}, {21, 22, 23}};
display(firstArray);
display(secondArray);
    }

    public static void display(int x[][]) {
        for (int row=0;row<x.length;row++){
            for (int column=0;column<x[row].length;column++){
                System.out.print(x[row][column]+"\t");
            }
            System.out.println();
        }
    }
}
