package ch.mab.plansch.demo.model;

import java.util.UUID;

public class ModuleVisit {

    UUID id; // übergabe als String in der API, was dann dahinter ist, sollte Backendspezifisch sein, nicht zwingend UUID
    float grade;  // reicht grade nicht? Abschlussnote sollte reichen für einen einfachen Planer

    // byte gradType; // 1 = sem, 2 = msp + sem, 3 = opnly msp
    // => dies wäre wohl eher beim Modul selbst an zu siedeln (übernahme von GraphQL API)

    String state; // passed, failed, etc... kann was anders sein, rapid prototype,
    UUID student;
    UUID modul;
    String semester;

    int weekday; // 0 => Mo, 1=> Di ...
    String timeStart;
    String timeEnd;
    // mit weekday, timeStart und timeEnd könnte bei der Planung eine Wochenansicht erstellt werden.
    // Was haltet Ihr davon? müsste dann ja nicht zwingend vom frontend implementiert werden, nur falls diese funktion gewünscht ist. Für meine persönliche Planung würde ich dies noch bevorzugen
    // Würde ich weglassen, macht es schlussendlich nur wieder komplizierter
    // => ich würde dies beibehalten, aber als Parameter, welche auch Null sein können, dann kann jede Gruppe selbst entscheiden, dies im Frontend zu nutzen oder nicht,
    // ich selbst sehe da für mich bereits einen Usecase
}
