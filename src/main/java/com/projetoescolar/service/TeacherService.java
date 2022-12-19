package com.projetoescolar.service;

import com.projetoescolar.exception.EntityNotFoundException;
import com.projetoescolar.model.dtos.TeacherDTO;
import com.projetoescolar.model.entities.Teacher;
import com.projetoescolar.repository.TeacherRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TeacherService {

    @Autowired
    TeacherRepository teacherRepository;
    @Autowired
    ModelMapper mapper;

    public TeacherDTO getById(Long id) {
        Optional<Teacher> teacherOptional = teacherRepository.findById(id);
        if(teacherOptional.isEmpty()) throw new EntityNotFoundException("Professor não encontrado");
        return mapper.map(teacherOptional.get(), TeacherDTO.class);
    }
}
