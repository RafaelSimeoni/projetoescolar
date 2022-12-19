package com.projetoescolar.controller;

import com.projetoescolar.model.dtos.TeacherDTO;
import com.projetoescolar.model.forms.TeacherForm;
import com.projetoescolar.service.TeacherService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @GetMapping("/{id}")
    public ResponseEntity<TeacherDTO> getById(@PathVariable Long id) {
        return ResponseEntity.ok().body(teacherService.getById(id));
    }

    @GetMapping
    public ResponseEntity<List<TeacherDTO>> listAll() {
        return ResponseEntity.ok().body(teacherService.listAll());
    }


    @PostMapping
    public ResponseEntity<TeacherDTO> save(@RequestBody @Valid TeacherForm teacherForm) {
        return ResponseEntity.ok().body(teacherService.save(teacherForm));
    }

}
