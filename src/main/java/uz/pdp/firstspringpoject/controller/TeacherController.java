package uz.pdp.firstspringpoject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.pdp.firstspringpoject.model.Teacher;
import uz.pdp.firstspringpoject.repository.TeacherRepository;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherRepository teacherRepository;

    @GetMapping
    public List<Teacher> getAllTeacher() {
        return teacherRepository.findAll();
    }

    @PostMapping
    public Teacher saveTeacherToDatabase(
            @RequestBody Teacher teacher
    ) {
        return teacherRepository.save(teacher);
    }
}
