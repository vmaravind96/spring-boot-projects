package com.aravind.lil.learningspring;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/get/student")
    public Student getStudent(){
        return new Student("Aravindakumar", "V M");
    }

    @GetMapping("/get/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Aravindakumar", "V M"));
        students.add(new Student("Ragul", "Ravisankar"));
        students.add(new Student("Shyam", "Mathur"));
        return students;
    }

    // Handling path variables
    @GetMapping("/get/student/{firstName}/{lastName}")
    public Student getStudentByPath(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName){
        return new Student(firstName, lastName);
    }

    // Handling query params
    // http://localhost:8080/student?firstName=Aravind&lastName=Kumar
    // Resource URI should be different
    @GetMapping("/query/student")
    public Student getStudentByQueryParam(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName){
        return new Student(firstName, lastName);
    }
}
