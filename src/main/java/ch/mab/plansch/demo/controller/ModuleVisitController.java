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
    // Wieso als request param und nicht path? Würde auch mit Path Params arbeiten
    // die Methode heisst doch retrieveAllVisits und dann kann mit Parameter gesteuert werden was zurück kommt?
    // Bei Restufll sollte doch die Resource per pathparam geladen werde und irgendwelche details dann per request.
    
    public List<ModuleVisit> retrieveAllVisits(
            @RequestParam(required = true, name = "student") String student, // überprüfen ob loginuser gleich übergebener student ist
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
