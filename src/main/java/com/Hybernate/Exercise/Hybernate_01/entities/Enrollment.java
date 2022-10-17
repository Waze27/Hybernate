package com.Hybernate.Exercise.Hybernate_01.entities;

import javax.persistence.*;

@Entity
@Table(name = "enrollments")
public class Enrollment {

    @Id
    private long id;

    @ManyToOne(optional = false)
    private Student studentEnrollment;

    @ManyToOne(optional = false)
    private Class classEnrollment;

}
