package com.azhar;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id", unique = true, nullable = false)
    private Integer customerId;

    @Column(name = "customer_name", length = 100, nullable = false)
    private String customerName;

    @Column(name = "customer_mail", unique = true, nullable = false)
    private String customerMail;

    @Column(name = "customer_on_date")
    @Temporal(TemporalType.DATE)
    private LocalDate customerOnDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "customer_gender", length = 10)
    private Gender customerGender;

    public enum Gender{
        MALE,
        FEMALE
    }

    public Customer() {

    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerMail() {
        return customerMail;
    }

    public void setCustomerMail(String customerMail) {
        this.customerMail = customerMail;
    }

    public LocalDate getCustomerOnDate() {
        return customerOnDate;
    }

    public void setCustomerOnDate(LocalDate customerOnDate) {
        this.customerOnDate = customerOnDate;
    }

    public Gender getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(Gender customerGender) {
        this.customerGender = customerGender;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerMail='" + customerMail + '\'' +
                ", customerOnDate=" + customerOnDate +
                ", customerGender=" + customerGender +
                '}';
    }
}

