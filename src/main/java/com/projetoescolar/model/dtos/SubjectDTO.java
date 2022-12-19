package com.projetoescolar.model.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.projetoescolar.model.enums.DayOfTheWeekEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class SubjectDTO {
    private Long id;
    private String name;
    private Integer vacancies;
    private DayOfTheWeekEnum dayOfTheWeekEnum;
    private String startTime;
    private String endTime;
}
