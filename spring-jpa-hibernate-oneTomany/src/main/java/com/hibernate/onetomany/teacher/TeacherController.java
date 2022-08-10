package com.hibernate.onetomany.teacher;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="teachers")
public class TeacherController {
	
	  @Autowired
	    TeacherRepository teacherRepository;

	    @GetMapping(value="/getteachers")
	    List<Teacher> getTeachers() {
	        return teacherRepository.findAll();
	    }

	    @PostMapping(value="/addteacher")
	    Teacher createTeacher(@RequestBody Teacher teacher) {
	        return teacherRepository.save(teacher);
	    }

}
