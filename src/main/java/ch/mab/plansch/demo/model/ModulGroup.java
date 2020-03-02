package ch.mab.plansch.demo.model;

import java.util.Set;
import java.util.UUID;

public class ModulGroup {

    UUID id;
    String name;
    Set<Modul> modules;
    int minNoOfModules;
}
