package Week_7.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CTextField {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text Field");

        //Component
        JLabel label1, label2, label3;
        JTextField textField1, textField2, textField3;
        JButton button;

        label1 = new JLabel("Number 1 = ");
        label2 = new JLabel("Number 2 = ");
        label3 = new JLabel("Total");

        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();

        button = new JButton("Total");

        label1.setBounds(100,50,200,30);
        textField1.setBounds(180,50,200,30);

        label2.setBounds(100,80,200,30);
        textField2.setBounds(180,80,200,30);

        label3.setBounds(100,110,200,30);
        textField3.setBounds(180,110,200,30);

        textField3.setEnabled(false);

        button.setBounds(90,150,300,30);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int number1 = Integer.parseInt(textField1.getText());
                int number2 = Integer.parseInt(textField2.getText());
                int result = number1+number2;
                String total = String.valueOf(result);

                textField3.setText(total);
            }
        });

        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(textField1);
        frame.add(textField2);
        frame.add(textField3);
        frame.add(button);
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setVisible(true);

    }
}
