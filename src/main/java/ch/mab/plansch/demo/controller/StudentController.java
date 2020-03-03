package ch.mab.plansch.demo.controller;

import ch.mab.plansch.demo.model.Student;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("students")
@Api(value = "/", description = "Description of API")
public class StudentController {

    @ApiOperation(value = "Retrieve student details")
    @GetMapping("{id}")
    public Student retrieveStudent(@PathVariable("id") UUID id) {
        return new Student();
    }

    @ApiOperation(value = "Create / register student")
    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return new Student();
    }
}
