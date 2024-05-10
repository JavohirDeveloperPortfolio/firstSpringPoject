package uz.pdp.firstspringpoject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import uz.pdp.firstspringpoject.model.Student;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    private List<Student> students = new ArrayList<>();

    @GetMapping
    public List<Student> getStudent() {
        return students;
    }

    @PostMapping
    public String setStudent(@RequestBody Student student){
        System.out.println(student.getFullName());
        System.out.println(student.getPhoneNumber());
        students.add(student);
        return "success";
    }

//    @PutMapping
//    @DeleteMapping

}
