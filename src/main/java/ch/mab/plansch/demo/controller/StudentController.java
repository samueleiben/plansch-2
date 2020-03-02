package ch.mab.plansch.demo.controller;

import ch.mab.plansch.demo.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("students")
public class StudentController {

    @GetMapping("{id}")
    public Student retrieveStudentDetails(@PathVariable("id") UUID id) {
        return new Student();
    }



}
