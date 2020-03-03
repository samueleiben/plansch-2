package ch.mab.plansch.demo.controller;

import ch.mab.plansch.demo.model.ModuleVisit;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("modules")
public class ModuleController {

    @GetMapping("{studentid}")
    public List<Module> retrieveAllModules(@PathVariable("studentid") UUID studentId) {
        return Collections.emptyList();
    }

    @GetMapping("visits/{studentid}")
    public List<ModuleVisit> retrieveVisitsModules(@PathVariable("studentid") UUID studentId) {
        return Collections.emptyList();
    }

    @PostMapping("visits/{studentid}")
    public void createModuleVisit(@PathVariable("studentid") UUID studentId, @RequestBody ModuleVisit moduleVisit) {
    }

    @PutMapping("visits/{studentid}/{id}")
    public void updateModuleVisit(@PathVariable("studentid") UUID studentId, @PathVariable("id") UUID moduleVisitId, @RequestBody ModuleVisit moduleVisit) {
    }

    @DeleteMapping("visits/{studentid}/{id}")
    public void deleteModulVisit(@PathVariable("studentid") UUID studentId, @PathVariable("id") UUID moduleVisitId) {
    }
}
