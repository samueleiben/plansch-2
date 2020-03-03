package ch.mab.plansch.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
