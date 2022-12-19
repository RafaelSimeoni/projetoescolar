package com.projetoescolar.model.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 50)
    private String name;

    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name= "teacher_id", referencedColumnName = "id")
    private List<Subject> subjectList;
}
