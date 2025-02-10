package com.example.demo_student.controller;

import com.example.demo_student.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentCRUDController {

    @GetMapping("/getString")
    public String getString(){
        return "Welocome to DEMO!!!";
    }

    @GetMapping("/getStudent")
    public Student getStudent(){
//        Student s = new Student();
//        s.setRono(22);
//        s.setName("Jayesh");
        Student s = new Student(24, "Rehan");
        return s;
    }
}
