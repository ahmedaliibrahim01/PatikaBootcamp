package com.azhar;

import jakarta.persistence.*;

@Entity
@Table(name = "codes")
public class Code {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "code_id")
    private int id;

    @Column(name = "code_name", nullable = false)
    private String name;

    @Column(name = "code_serial", nullable = false)
    private String serial;

    @OneToOne(mappedBy = "code")
    private Product product;

    public Code() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Code{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", serial='" + serial + '\'' +
                '}';
    }
}
