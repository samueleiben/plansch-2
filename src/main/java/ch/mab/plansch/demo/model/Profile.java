package ch.mab.plansch.demo.model;

import java.util.Set;
import java.util.UUID;

/**
 * Model für die Profilierung
 * Name kann noch angepasst werden
 */
public class Profile {
    UUID id;
    String name;
    Set<Modul> modules;
    String firstSG;
    String lastSG;
    int minNoOfModules;
}
