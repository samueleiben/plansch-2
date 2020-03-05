package ch.mab.plansch.demo.model;

import java.util.Set;

/**
 * Model für die Abbildung des Studiengangs
 * Benötigt, damit die API ohne Probleme für weitere Studiengänge genutzt werden kann
 */


// Was soll der Course genau darstellen?
// Ist eine gute Idee für die Erweiterung für andere Studiengänge, könnte als "leerer" Endpunkt gebraucht werden, könnte momentan nur Informatik als String liefern
public class Degree {
    String id;
    String name;
    Set<String> groups;
    Set<String> profiles; // aufgrund eines Kommentars von Herrn Gruntz sollten die Gruppen und Profilierungen vom Studiengang her referenziert werden (GSW usw. können ja in mehreren Studiengängen angeboten werden
}
