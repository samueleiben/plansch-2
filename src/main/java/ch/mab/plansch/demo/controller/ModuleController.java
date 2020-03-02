package ch.mab.plansch.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("modules")
public class ModuleController {

    @GetMapping
    public List<Module> retrieveAllModules() {
        return Collections.emptyList();
    }

    @GetMapping("/planned")
    public List<Module> retrievePlannedModules() {
        return Collections.emptyList();
    }
}
