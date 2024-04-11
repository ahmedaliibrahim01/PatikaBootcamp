package Week_7.RentACar.view;

import Week_7.RentACar.business.UserManager;
import Week_7.RentACar.core.Helper;
import Week_7.RentACar.entity.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginView extends JFrame {

    private JPanel container;
    private JPanel user_login;
    private JPanel pnl_top;
    private JLabel lbl_rent_a_car;
    private JLabel lbl_management;
    private JPanel pnl_bottom;
    private JTextField textField_username;
    private JPasswordField passwordField;
    private JButton btn_login;
    private JLabel lbl_pass;
    private JLabel lbl_user;
    private UserManager userManager;

    public LoginView(){
        this.userManager = new UserManager();
        add(container);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Rent a Car");
        this.setSize(400, 400);


        this.setLocation(
                (Toolkit.getDefaultToolkit().getScreenSize().width - this.getWidth()) / 2,
                (Toolkit.getDefaultToolkit().getScreenSize().height - this.getHeight()) / 2
        );
        this.setVisible(true);
        btn_login.addActionListener(e -> {
            if (Helper.isFieldEmpty(textField_username)){
                JOptionPane.showMessageDialog(null,"Enter Username", "Error", JOptionPane.INFORMATION_MESSAGE);
            }else if (Helper.isFieldEmpty(passwordField)){
                JOptionPane.showMessageDialog(null,"Enter Password", "Error", JOptionPane.INFORMATION_MESSAGE);
            }else {
                User loginUser = this.userManager.findUser(this.textField_username.getText(),this.passwordField.getText());
                if (loginUser == null){
                    JOptionPane.showMessageDialog(null,"User not found");
                    System.out.println("User not found");
                }else {
                    //JOptionPane.showMessageDialog(null,"Login is Successful");
                    AdminView adminView = new AdminView(loginUser);
                    dispose();
                }
            }
        });
    }

}
