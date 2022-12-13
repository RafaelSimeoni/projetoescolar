package com.projetoescolar.model.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Student {
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String registration;
    private Double average;
   /* @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name= "address_id", referencedColumnName = "id")
    private Address address;
    @OneToOne
    @JoinColumn(name= "course_id", referencedColumnName = "id")
    private Course course;
    @ManyToMany
    @JoinTable(name="tb_student_subject", joinColumns = @JoinColumn(name="student_id"), inverseJoinColumns = @JoinColumn(name="student_id"))
    private List<Subject> subjectList = new ArrayList<>();*/

    


}
