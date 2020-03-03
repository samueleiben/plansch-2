package ch.mab.plansch.demo.model;

import java.util.Set;
import java.util.UUID;

public class Modul {

    UUID id; // Macht keinen Sinn, Modul-ID ist bereits vorhanden in den Daten der Module
    String name;
    String shortName;
    String description;

    // Set<ModulVisits> visits;
    // sollte wohl eher nicht auf dem Modul abgelegt werden, dafür ist ja die Zuweisung von Modul und Student da...

    int credits;
    boolean isMandatory; // wird nicht benötigt, Diskussion von gestern (02.03.2020)
    String[] language; // muss ja kein String sein... rapid prototype
    Set<String> prerequesites;

}
