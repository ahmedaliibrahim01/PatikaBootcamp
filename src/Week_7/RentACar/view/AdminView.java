package Week_7.RentACar.view;

import Week_7.RentACar.business.BrandManager;
import Week_7.RentACar.core.Helper;
import Week_7.RentACar.entity.Brand;
import Week_7.RentACar.entity.User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class AdminView extends Layout {
    private User user;
    private BrandManager brandManager;

    private JPanel container;
    private JPanel pnl_top;
    private JLabel lbl_welcome;
    private JTabbedPane tab_brand;
    private JButton btn_logout;
    private JButton btn_add;
    private JScrollPane scrl_panel;
    private JTable tbl_brand;
    private JPanel pnl_brand;
    private DefaultTableModel model;
    private JPopupMenu brandPopup;

    public AdminView(User user){
        add(container);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Rent a Car");
        this.setSize(1000, 500);


        this.model = new DefaultTableModel();
        this.brandManager = new BrandManager();
        this.brandPopup = new JPopupMenu();

        this.setLocation(
                (Toolkit.getDefaultToolkit().getScreenSize().width - this.getWidth()) / 2,
                (Toolkit.getDefaultToolkit().getScreenSize().height - this.getHeight()) / 2
        );
        this.setVisible(true);

        this.user = user;
        if (user==null){
            dispose();
        }
        this.lbl_welcome.setText("Welcome : " + user.getName());

        loadBrandTable();
        tbl_brand.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int selectedRow = tbl_brand.rowAtPoint(e.getPoint());
                tbl_brand.setRowSelectionInterval(selectedRow,selectedRow);
            }
        });

        this.brandPopup.add("Update").addActionListener(e -> {
            int selectBrandId = this.getTableSelectedRow(tbl_brand, 0);
            BrandView brandView = new BrandView(this.brandManager.getById(selectBrandId));
            brandView.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    loadBrandTable();
                }
            });
        });
        this.brandPopup.add("Delete ").addActionListener(e -> {
            if (Helper.confirm("sure")){
                int selectBrandId = this.getTableSelectedRow(tbl_brand, 0);
                if (this.brandManager.delete(selectBrandId)){
                    JOptionPane.showMessageDialog(null,"Successful");
                    loadBrandTable();
                }else {
                    JOptionPane.showMessageDialog(null,"Error");
                }
            }
        });

        this.tbl_brand.setComponentPopupMenu(brandPopup);


        btn_add.addActionListener(e -> {
            BrandView brandView = new BrandView(null);
            brandView.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    loadBrandTable();
                }
            });
        });
    }

    public void loadBrandTable(){
        Object[] columnUsers = {"ID", "Name"};
        ArrayList<Object[]> brandList = this.brandManager.getForTable(columnUsers.length);
        this.createTable(model,tbl_brand,columnUsers,brandList);
    }
}
