package ch.mab.plansch.demo.model;

import java.util.UUID;

public class ModuleVisit {
    UUID id;
    float grade;
    byte gradType; // 1 = sem, 2 = msp + sem, 3 = opnly msp
    String state; // passed, failed, etc... kann was anders sein, rapid prototype
    Modul modul;
}
