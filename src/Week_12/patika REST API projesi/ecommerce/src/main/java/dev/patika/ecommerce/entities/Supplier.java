package dev.patika.ecommerce.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="suppliers")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supplier_id")
    private int id;


    @Column(name = "supplier_company")
    private  String companyName ;
    @Column(name = "supplier_contact")
    private  String contactName ;
    @Column(name = "supplier_adress")
    private  String address ;
    @Column(name = "supplier_mail")
    private  String contactMail ;

    @OneToMany(mappedBy ="supplier")
    private List<Product> product;
}

