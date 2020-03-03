package ch.mab.plansch.demo.controller;

import ch.mab.plansch.demo.model.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/profiles")
public class ProfileController {

    @GetMapping()
    public List<Profile> retrieveAllProfiles() {
        return Collections.emptyList();
    }

    @GetMapping("/{id}")
    public Profile retrieveProfile(
            @PathVariable("id") UUID id
    ) {
        return new Profile();
    }
}
