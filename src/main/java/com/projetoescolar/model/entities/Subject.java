package com.projetoescolar.model.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.projetoescolar.model.enums.DayOfTheWeekEnum;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer vacancies;
    private DayOfTheWeekEnum dayOfTheWeekEnum;
    @ManyToOne
    @JoinColumn(name= "teacher_id", referencedColumnName = "id")
    private Teacher teacher;


    @ManyToMany(mappedBy = "subjectList")
    private List<Student> studentList;
    private String startTime;
    private String endTime;

}
