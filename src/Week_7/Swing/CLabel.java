package Week_7.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CLabel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Label");

        //Component
        JLabel label1 = new JLabel("Number 1 = 10");
        JLabel label2 = new JLabel("Number 2 = 20");
        JLabel label3 = new JLabel("Total is = ");
        JButton button = new JButton("Total");

        //Codes
        button.setBounds(100,200,100,30);
        label1.setBounds(100,100,100,30);
        label2.setBounds(100,115,100,30);
        label3.setBounds(100,220,100,30);


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label3.setText("Total is = 30");
            }
        });


        frame.add(button);
        frame.add(label3);
        frame.add(label2);
        frame.add(label1);
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setVisible(true);


    }
}
