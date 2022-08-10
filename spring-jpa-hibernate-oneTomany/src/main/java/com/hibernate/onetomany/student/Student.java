package com.hibernate.onetomany.student;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hibernate.onetomany.subject.Subject;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String name;

    //ManyToMany mapping: Student can have many subject and Subject can be enrolled to many Students. 
    @JsonIgnore 
    @ManyToMany(mappedBy = "enrolledStudents")
    private Set<Subject> subjects = new HashSet<>();
    
    public Student() {}

    public Student(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


    public void setId(Long id) {
		this.id = id;
	}


	public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}

	public Set<Subject> getSubjects() {
        return subjects;
    }

}
