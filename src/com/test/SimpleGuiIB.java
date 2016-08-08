package com.test; /**
 * Created by Code on 8/1/2016.
 */

import javax.swing.*;
import java.awt.event.*;

public class SimpleGuiIB implements ActionListener{
JButton button;
    public static void main(String[] args) {
        SimpleGuiIB gui = new SimpleGuiIB();
        gui.go();

    }

    private void go() {
        JFrame frame = new JFrame();
        button = new JButton("click me!");

        button.addActionListener(this);


        frame.getContentPane().add(button);
        frame.getContentPane();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        frame.setVisible(true);

    }


//    @Override
    public void actionPerformed(ActionEvent event) {
        button.setText("Yahoo!");
    }
}
