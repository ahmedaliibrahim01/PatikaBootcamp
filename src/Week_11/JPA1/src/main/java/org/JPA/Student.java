package org.JPA;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import jdk.jfr.Experimental;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private int id;
    @Column(name = "student_name", nullable = false)
    private String name;
}
