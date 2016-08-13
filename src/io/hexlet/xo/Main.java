package io.hexlet.xo;

import io.hexlet.xo.model.*;
import io.hexlet.xo.model.exceptions.*;
import io.hexlet.xo.view.*;
import io.hexlet.xo.controllers.*;

import java.util.Scanner;

public class Main {


//
//        Board board = new Board();
//        board.showBoard();
//        final Point p = new Point();
//        p.x = 2;
//        p.y = 3;
//
//        final Player player = new Player();
//        player.name = "Slava";
//        player.figure = "X";
//
//        public int showMenuWiyhResults(){
//        System.out.println("123");

            Scanner scanner = new Scanner(System.in);

        final Exception e = new AlreadyOccupiedException();
        final AbstractXOException e2 = new AlreadyOccupiedException();
        final AbstractXOException e3 = new InvalidPointException();
        final RuntimeException e4 = new XOCriticalException();

}


