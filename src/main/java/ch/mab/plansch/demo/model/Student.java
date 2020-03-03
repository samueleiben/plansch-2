package ch.mab.plansch.demo.model;

import java.util.UUID;

public class Student {

    UUID id; // übergabe als String in der API, was dann dahinter ist, sollte Backendspezifisch sein, nicht zwingend UUID
    String name;
    String vorname;
    String email;
    String password;
    Integer semester; // ist das der Eintritt, oder das aktuelle semester? Eintrittssemester ist aus meiner Sicht sinnvoller

}
