package ch.mab.plansch.demo.model;

import java.util.UUID;

public class Student {

    UUID id; // übergabe als String in der API, was dann dahinter ist, sollte Backendspezifisch sein, nicht zwingend UUID
    String name;
    String vorname;
    String email;
    String password;
    String startSemester; // wann das Studium begonnen wurde
    UUID couse;

}
