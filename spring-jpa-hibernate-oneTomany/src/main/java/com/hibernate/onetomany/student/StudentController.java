package com.hibernate.onetomany.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping(value="/getstudents")
    List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @PostMapping(value="/addstudent")
    Student createStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }
}
