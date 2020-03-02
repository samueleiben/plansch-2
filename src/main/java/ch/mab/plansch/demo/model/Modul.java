package ch.mab.plansch.demo.model;

import java.util.Set;
import java.util.UUID;

public class Modul {

    UUID id;
    String name;
    String description;
    Set<ModulVisits> visits;
    int credits;
    boolean isMandatory;
    String[] language; // muss ja kein String sein... rapid prototype
    Set<UUID> prerequesites;

}
