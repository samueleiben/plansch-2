package ch.mab.plansch.demo.controller;

import ch.mab.plansch.demo.model.ModuleGroup;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("modulegroups")
public class ModuleGroupController {

    @GetMapping("{studentid}")
    public List<ModuleGroup> retrieveAllModuleGroups(@PathVariable("studentid") UUID studentId) {
        return Collections.emptyList();
    }

    @GetMapping("{studentid}/{id}")
    public List<ModuleGroup> retrieveModuleGroupById(@PathVariable("studentid") UUID studentId) {
        return Collections.emptyList();
    }
}