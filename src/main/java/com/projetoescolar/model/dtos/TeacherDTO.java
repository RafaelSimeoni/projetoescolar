package com.projetoescolar.model.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.projetoescolar.model.entities.Subject;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter @Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class TeacherDTO {
    private Long id;
    private String name;
    private List<SubjectDTO> subjectList;
}
