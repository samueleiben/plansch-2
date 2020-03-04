package ch.mab.plansch.demo.model;

import java.util.Set;
import java.util.UUID;

/**
 * Model für die Profilierung
 * Name kann noch angepasst werden
 */

// Warum braucht es das Profile? Kann ja direkt über die ModuleGroup abgehandlet werden. Denn die macht ja eigentlich genau 
// das gleiche.
public class Profiles {
    UUID id;
    String name;
    Set<UUID> modules;
    int minNoOfModules;
}
