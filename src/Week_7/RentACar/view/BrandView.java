package Week_7.RentACar.view;

import Week_7.RentACar.business.BrandManager;
import Week_7.RentACar.core.Helper;
import Week_7.RentACar.entity.Brand;

import javax.swing.*;
import java.awt.*;

public class BrandView extends JFrame {
    private JPanel container;
    private JPanel pnl_bottom;
    private JLabel lbl_new;
    private JLabel lbl_brand_name;
    private JTextField txtfld_new_brand;
    private JButton btn_save_brand;
    private Brand brand;
    private BrandManager brandManager;



    public BrandView(Brand brand){
        this.add(container);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Brand");
        this.setSize(300, 150);
        this.setLocation(
                (Toolkit.getDefaultToolkit().getScreenSize().width - this.getWidth()) / 2,
                (Toolkit.getDefaultToolkit().getScreenSize().height - this.getHeight()) / 2
        );
        this.setVisible(true);

        this.brand = brand;
        this.brandManager = new BrandManager();

        if (brand != null){
            this.txtfld_new_brand.setText(brand.getName());
        }
        btn_save_brand.addActionListener(e -> {
            if (Helper.isFieldEmpty(this.txtfld_new_brand)){
                JOptionPane.showMessageDialog(null,"Enter Brand Name", "Error", JOptionPane.INFORMATION_MESSAGE);
            }else{
                boolean result;
                if (this.brand==null){
                    result = this.brandManager.save(new Brand(txtfld_new_brand.getText()));
                }else {
                    this.brand.setName(txtfld_new_brand.getText());
                    result = this.brandManager.update(this.brand);
                }
                if (result){
                    JOptionPane.showMessageDialog(null,"Successful", "Done", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                }else {
                    JOptionPane.showMessageDialog(null,"Unsuccessful", "Error", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                }
            }
        });
    }
}
