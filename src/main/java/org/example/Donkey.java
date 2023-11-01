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

    @Override
    public String toString() {
        return "[Вид: ослы, кличка: " + name +
                ", дата рождения: " + dob +
                ", пол: " + gender +
                ", владелец: " + owner +
                ", окрас: " + color +
                ']';
    }
}
