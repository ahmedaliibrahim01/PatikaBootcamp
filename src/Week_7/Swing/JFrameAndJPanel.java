package Week_7.Swing;

import javax.swing.*;
import java.awt.*;

public class JFrameAndJPanel {
    public static void main(String[] args) {
        // Containers
        JFrame frame = new JFrame("New App");
        JPanel panel = new JPanel();


        // Components
        Button button = new Button("Button");


        // Codes
        frame.add(panel);
        panel.add(button);

        frame.setSize(500,500);


        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}
