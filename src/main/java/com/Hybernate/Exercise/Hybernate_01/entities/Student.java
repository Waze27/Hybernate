package com.Hybernate.Exercise.Hybernate_01.entities;


import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    private long id;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String firstName;

    @Column(unique = true, nullable = false)
    private String email;

}


