package ch.mab.plansch.demo.model;

import java.util.UUID;

public class ModuleVisit {

    UUID id; // übergabe als String in der API, was dann dahinter ist, sollte Backendspezifisch sein, nicht zwingend UUID
    float grade;
    byte gradType; // 1 = sem, 2 = msp + sem, 3 = opnly msp
    String state; // passed, failed, etc... kann was anders sein, rapid prototype,
    UUID student;
    UUID modul;
    String semester;

    // int weekday;
    // String timeStart;
    // String timeEnd;
    // mit weekday, timeStart und timeEnd könnte bei der Planung eine Wochenansicht erstellt werden.
    // Was haltet Ihr davon? müsste dann ja nicht zwingend vom frontend implementiert werden, nur falls diese funktion gewünscht ist. Für meine persönliche Planung würde ich dies noch bevorzugen

}