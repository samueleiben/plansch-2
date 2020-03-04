package ch.mab.plansch.demo.controller;


import ch.mab.plansch.demo.model.Degree;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/degree")
public class DegreeController {

    @GetMapping
    public List<Degree> retrieveAllProfiles() {
        return Collections.emptyList();
    }

    // Braucht es diesen Endpunkt momentan? Nur Informatik wird unterstützt, könnte in v2 vom API eingebaut werden
    @GetMapping(path="/{id}")
    public Degree retrieveModule(@PathVariable("id") String id) {
        return new Degree();
    }
}
