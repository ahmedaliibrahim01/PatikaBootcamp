package Week_7.LayerArchitecture.view;

import Week_7.LayerArchitecture.business.UsersController;

import javax.swing.*;
import java.awt.*;

public class UsersView1 extends JFrame{
    private JPanel container;
    private JTabbedPane test_menu;
    private JPanel pnl_user;
    private JScrollPane scrl_user;
    private JTable tbl_user;
    private JButton btn_user_new;
    private JTabbedPane tabbedPane1;
    private UsersController usersController;

    public UsersView1(){
        this.add(container);
        this.setTitle("User Manager");
        this.setSize(500,500);

        int x = (Toolkit.getDefaultToolkit().getScreenSize().width - this.getWidth()) / 2;
        int y = (Toolkit.getDefaultToolkit().getScreenSize().height - this.getHeight()) / 2;
        this.setLocation(x,y);
        this.setVisible(true);

        this.usersController = new UsersController();
    }

}
