package Week_7.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CButton {
    public static void main(String[] args) {
        // Containers
        JFrame frame = new JFrame("Button");

        // Components
        Button button = new Button("Button");

        // Codes
        frame.add(button);
        button.setBounds(100,100,100,30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Tıkla");
            }
        });

        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setVisible(true);
    }

}
