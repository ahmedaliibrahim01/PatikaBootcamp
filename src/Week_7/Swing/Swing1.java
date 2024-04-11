package Week_7.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing1 extends JFrame {

    private JPanel container;
    private JButton myButton;
    private JLabel myLabel;

    public Swing1() {
        this.add(container);
        this.setSize(300,500);

        int x = (Toolkit.getDefaultToolkit().getScreenSize().width - this.getWidth()) / 2;
        int y = (Toolkit.getDefaultToolkit().getScreenSize().height - this.getHeight()) / 2;
        this.setLocation(x,y);


        this.setVisible(true);
        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicked");
                myLabel.setText("Clicked");
            }
        });
    }
}