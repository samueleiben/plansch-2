package ch.mab.plansch.demo.model;

/**
 * Model für die Abbildung des Studiengangs
 * Benötigt, damit die API ohne Probleme für weitere Studiengänge genutzt werden kann
 */
public class Course {

    String id;
    String name;
    String firstAvailable; // ab wann der Studiengang besucht werden konnte
    String lastAvailable; // letzter Start für diesen Studienhgang
}
