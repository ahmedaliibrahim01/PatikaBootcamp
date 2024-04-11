package Week_7.RentACar.business;

import Week_7.RentACar.dao.BrandDao;
import Week_7.RentACar.entity.Brand;

import javax.swing.*;
import java.util.ArrayList;

public class BrandManager {
    private final BrandDao brandDao;

    public BrandManager() {
        this.brandDao = new BrandDao();
    }

    public ArrayList<Brand> findAll(){
        return this.brandDao.findAll();
    }

    public boolean save(Brand brand) {
        if (brand.getId() != 0){
            JOptionPane.showMessageDialog(null,"Unsuccessful", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        return this.brandDao.save(brand);
    }

    public boolean delete(int id) {
        if (this.getById(id) == null) {
            JOptionPane.showMessageDialog(null,id + " ID kaystla marka bulunamad", "Done", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return this.brandDao.delete(id);
    }

    public Brand getById(int id){
        return this.brandDao.getById(id);
    }

    public boolean update(Brand brand){
        if (this.getById(brand.getId()) == null){
            JOptionPane.showMessageDialog(null,"not found");
        }
        return this.brandDao.update(brand);
    }

    public ArrayList<Object[]> getForTable(int size) {
        ArrayList<Object[]> brandRowList = new ArrayList<>();
        for (Brand brand : this.findAll()) {
            Object[] rowObject = new Object[size];
            int i = 0;
            rowObject[i++] = brand.getId();
            rowObject[i++] = brand.getName();
            brandRowList.add(rowObject);
        }
        return brandRowList;
    }
}
