package ch.mab.plansch.demo.model;

import java.util.Set;
import java.util.UUID;

/**
 * Model für die Profilierung
 * Name kann noch angepasst werden
 */

// Warum braucht es das Profile? Kann ja direkt über die ModuleGroup abgehandlet werden. Denn die macht ja eigentlich genau 
// das gleiche.
// => ies aufgrund der Diskussion am Montag, Herr Gruntz wird dies ebenfalls so in der GraphQL API abbilden
// über den Namen kann man noch streiten, würde ich aber dann so übernehmen, wie es in der GraphQL API ist (siehe auch Kommentar auf Github)
public class Profiles {
    UUID id;
    String name;
    Set<UUID> modules;
    int minNoOfModules;
}
