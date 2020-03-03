package ch.mab.plansch.demo.model;

import java.util.Set;
import java.util.UUID;

public class ModuleGroup {

    UUID id; // übergabe als String in der API, was dann dahinter ist, sollte Backendspezifisch sein, nicht zwingend UUID
    String name;
    UUID parent; // für die Abbildung Verschachtelung
    Course course;
    Set<Module> modules;
    int minNoOfModules;
}
