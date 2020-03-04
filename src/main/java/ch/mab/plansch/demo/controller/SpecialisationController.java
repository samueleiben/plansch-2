package ch.mab.plansch.demo.controller;

import ch.mab.plansch.demo.model.Specialisation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/specialisation")
public class SpecialisationController {

    @GetMapping()
    public List<Specialisation> retrieveAllSpecialisations() {
        return Collections.emptyList();
    }

    @GetMapping("/{id}")
    public Specialisation retrieveSpecialisation(
            @PathVariable("id") UUID id
    ) {
        return new Specialisation();
    }
}
