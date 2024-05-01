package com.azhar;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.hibernate.Transaction;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("market");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        /*
        transaction.begin();
        Customer customer = new Customer();
        customer.setCustomerName("Ahmed");
        customer.setCustomerMail("ahmed@mail.com");
        customer.setCustomerGender(Customer.Gender.MALE);
        customer.setCustomerOnDate(LocalDate.now());

        entityManager.persist(customer);

        transaction.commit();

        entityManager.close();
        entityManagerFactory.close();



        transaction.begin();
        Customer customer = entityManager.find(Customer.class,1);
        customer.setCustomerGender(Customer.Gender.FEMALE);
        entityManager.remove(customer);
        transaction.commit();
        System.out.println(customer.toString());
         */
        System.out.println("Test");
    }
}