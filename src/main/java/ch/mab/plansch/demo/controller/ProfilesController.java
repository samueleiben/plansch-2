package ch.mab.plansch.demo.controller;

import ch.mab.plansch.demo.model.Profiles;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/profiles")
public class ProfilesController {

    @GetMapping()
    public List<Profiles> retrieveAllProfiles() {
        return Collections.emptyList();
    }

    @GetMapping("/{id}")
    public Profiles retrieveProfiles(
            @PathVariable("id") UUID id
    ) {
        return new Profiles();
    }
}
