package org.example;

import java.time.LocalDate;

public class Donkey extends PackAnimal {
    public Donkey(LocalDate dob, String gender, String name, String owner, String color) {
        super (dob, gender, name, owner, color);
    }

    public void ia() {
        System.out.printf("%s is iaing...\n", getName());
    }

    public void iaaa() {
        System.out.printf("%s is saying iaaa-iaaa-iaaa!\n", getName());
    }

    public void pull() {
        System.out.printf("%s is pulling...\n", getName());
    }
}
