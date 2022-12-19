package com.projetoescolar.service;

import com.projetoescolar.exception.EntityNotFoundException;
import com.projetoescolar.model.dtos.TeacherDTO;
import com.projetoescolar.model.entities.Teacher;
import com.projetoescolar.model.forms.TeacherForm;
import com.projetoescolar.repository.TeacherRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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

    public List<TeacherDTO> listAll() {
        List<Teacher> teacherList = teacherRepository.findAll();
        if(teacherList.isEmpty()) throw new EntityNotFoundException("Não há professores cadastrados no sistema");
        return teacherList.stream().map(teacher -> mapper.map(teacher, TeacherDTO.class)).toList();
    }

    public TeacherDTO save(TeacherForm teacherForm) {
        Teacher teacher = teacherRepository.save(mapper.map(teacherForm, Teacher.class));
        return mapper.map(teacher, TeacherDTO.class);
    }

    public TeacherDTO update(Long id, TeacherForm teacherForm) {
        getById(id);
        Teacher teacher = mapper.map(teacherForm, Teacher.class);
        teacher.setId(id);
        teacherRepository.save(teacher);
        return mapper.map(teacher, TeacherDTO.class);
    }

    public String delete(Long id) {
        getById(id);
        teacherRepository.deleteById(id);
        return "Professor excluído com sucesso!";
    }
}
