package com.projetoescolar.model.entities;

import com.projetoescolar.model.enums.DayOfTheWeekEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer vacancies;
    private DayOfTheWeekEnum dayOfTheWeekEnum;
    @ManyToOne
    @JoinColumn(name= "teacher_id", referencedColumnName = "id")
    private Teacher teacher;
    private List<Student> studentList;
    private String startTime;
    private String endTime;

}
