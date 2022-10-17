package com.Hybernate.Exercise.Hybernate_01.entities;


import javax.persistence.*;

@Entity
@Table(name = "classes")
public class Class {

    @Id
    private long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;


}
