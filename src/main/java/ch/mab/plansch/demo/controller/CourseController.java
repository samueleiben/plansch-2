package ch.mab.plansch.demo.controller;

import ch.mab.plansch.demo.model.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @GetMapping
    public List<Course> retrieveAllCourses() {
        return Collections.emptyList();
    }

    @GetMapping(path="/{id}")
    public Course retrieveModule(@PathVariable("id") String id) {
        return new Course();
    }
}
