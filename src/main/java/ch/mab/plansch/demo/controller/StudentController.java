package ch.mab.plansch.demo.controller;

import ch.mab.plansch.demo.model.ModuleVisit;
import ch.mab.plansch.demo.model.Student;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Set;
import java.util.UUID;

@RestController
@RequestMapping("/students")
@Api(value = "/", description = "Description of API")
public class StudentController {

    @ApiOperation(value = "Retrieve student details")
    @GetMapping("/{studentid}")
    public Student retrieveStudent(@PathVariable("studentid") UUID id) {
        return new Student();
    }

    @ApiOperation(value = "Create / register student")
    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return new Student();
    }

    @ApiOperation(value = "Update student information")
    @PutMapping("/{studentID}")
    public Student updateStudent(@PathVariable String studentID, @RequestBody Student student) {
        return student;
    }

    @ApiOperation(value = "Delete own profile")
    @DeleteMapping("/{studentID}")
    public void deleteStudent(
            @PathVariable String studentID
    ) {

    }

//    Modulbesuche sollten über eine separate Ressource beretgestellt werden
//
//    @ApiOperation(value = "Retrieve module visits by student")
//    @GetMapping("{studentid}/modulevisits")
//    public Set<ModuleVisit> retrieveModuleVisitsByStudentId(@PathVariable("studentid") UUID studentId) {
//        return Collections.emptySet();
//    }
//
//    @PostMapping("{studentid}/modulevisits")
//    public void createModuleVisitByStudentId(@PathVariable("studentid") UUID studentId,
//                                             @RequestBody ModuleVisit moduleVisit) {
//    }
//
//    @PutMapping("{studentid}/modulevisits/{id}")
//    public void updateModuleVisitByStudentIdAndModuleVisitId(@PathVariable("studentid") UUID studentId,
//                                                             @PathVariable("id") UUID moduleVisitId,
//                                                             @RequestBody ModuleVisit moduleVisit) {
//    }
//
//    @DeleteMapping("{studentid}/modulevisits/{id}")
//    public void deleteModulVisitByStudentIdAndModuleVisitId(@PathVariable("studentid") UUID studentId,
//                                                            @PathVariable("id") UUID moduleVisitId) {
//    }
}
