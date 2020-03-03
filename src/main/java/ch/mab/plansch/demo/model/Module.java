package ch.mab.plansch.demo.model;

import java.util.Set;
import java.util.UUID;

public class Module {
    // Vorschlag für Module anhand der GraphQL Schnittstelle von Gruntz
    UUID id; // Macht keinen Sinn, Modul-ID ist bereits vorhanden in den Daten der Module
    String name;
    String code;
    int credits;
    boolean hs;
    boolean fs;
    // boolean isMandatory; // wird nicht benötigt, Diskussion von gestern (02.03.2020)
    //String[] language; // muss ja kein String sein... rapid prototype
    UUID group;
    Set<UUID> requirements;

}
