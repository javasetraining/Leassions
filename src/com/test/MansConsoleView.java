package com.test;

/**
 * Created by MaRV on 8/13/2016.
 */
public class MansConsoleView extends ConsoleView {

        MansConsoleView() {
            System.out.println("o ");
        }

        public static void main(String[] args) {
            new MansConsoleView();
        }

    }

    class ConsoleView {
        ConsoleView() {
            System.out.print("x ");
        }

    }


