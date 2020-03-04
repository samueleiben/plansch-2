package ch.mab.plansch.demo.model;

/**
 * Model für die Abbildung des Studiengangs
 * Benötigt, damit die API ohne Probleme für weitere Studiengänge genutzt werden kann
 */


// Was soll der Course genau darstellen?
// Ist eine gute Idee für die Erweiterung für andere Studiengänge, könnte als "leerer" Endpunkt gebraucht werden, könnte momentan nur Informatik als String liefern
public class Degree {
    String id;
    String name;
    String firstAvailable; // ab wann der Studiengang besucht werden konnte
    String lastAvailable; // letzter Start für diesen Studienhgang
}
