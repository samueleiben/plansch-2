package ch.mab.plansch.demo.controller;

import ch.mab.plansch.demo.model.ModuleVisit;
import ch.mab.plansch.demo.model.Module;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/modules")
public class ModuleController {

    // @GetMapping("{studentid}") // sollte nicht als pathparameter sondern als queryparameter übergeben werden
    @GetMapping
    public List<java.lang.Module> retrieveAllModules(
            // @RequestParam(required = false, name = "student") String student, // nicht zwingend nötig, ist mit der Anmeldung bereits vorhanden
            @RequestParam(required = false, name = "canVisit") Boolean canVisit // nur Module, welche noch besucht werden können
    ) {
        return Collections.emptyList();
    }

    @GetMapping(path="/{id}")
    public Module retrieveModule(@PathVariable("id") String id) {
        return new Module();
    }

//    Visits sollte eine eigene ressource sein
//
//    @GetMapping("visits/{studentid}")
//    public List<ModulVisit> retrieveVisitsModules(@PathVariable("studentid") UUID studentId) {
//        return Collections.emptyList();
//    }
//
//    @PostMapping("visits/{studentid}")
//    public void createModuleVisit(@PathVariable("studentid") UUID studentId, @RequestBody ModulVisit moduleVisit) {
//    }
//
//    @PutMapping("visits/{studentid}/{id}")
//    public void updateModuleVisit(@PathVariable("studentid") UUID studentId, @PathVariable("id") UUID moduleVisitId, @RequestBody ModulVisit moduleVisit) {
//    }
//
//    @DeleteMapping("visits/{studentid}/{id}")
//    public void deleteModulVisit(@PathVariable("studentid") UUID studentId, @PathVariable("id") UUID moduleVisitId) {
//    }
}
