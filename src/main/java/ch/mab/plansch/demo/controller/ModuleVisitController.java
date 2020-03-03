package ch.mab.plansch.demo.controller;

import ch.mab.plansch.demo.model.ModuleVisit;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/modulevisits")
public class ModuleVisitController {

    @GetMapping
    public List<ModuleVisit> retrieveAllVisits(
            // @RequestParam(required = false, name = "student") String student, // nicht zwingend nötig, ist mit der Anmeldung bereits vorhanden
            @RequestParam(required = false, name = "semester") String semester // Filter um nur bestimmte Semester zu laden
    ) {
        return Collections.emptyList();
    }

    @GetMapping("/{id}")
    public ModuleVisit retrieveVisit() {
        return new ModuleVisit();
    }

    @PostMapping
    public ModuleVisit createVisit(@RequestBody ModuleVisit visit) {
        return visit;
    }

    @PutMapping("/{id}")
    public ModuleVisit updateVisit(@RequestBody ModuleVisit visit) {
        return visit;
    }

    @DeleteMapping("/{id}")
    public void deleteVisit(@RequestBody ModuleVisit visit) {

    }
}
