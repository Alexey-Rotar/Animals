package org.example;

import java.time.LocalDate;

public class Camel extends PackAnimal {
    public Camel(LocalDate dob, String gender, String name, String owner, String color) {
        super (dob, gender, name, owner, color);
    }

    public void lie() {
        System.out.printf("%s is lying...\n", getName());
    }

    public void ride() {
        System.out.printf("%s is standing...\n", getName());
    }

    public void gallop() {
        System.out.printf("%s is walking...\n", getName());
    }

    @Override
    public String toString() {
        return "[Вид: верблюды, кличка: " + name +
                ", дата рождения: " + dob +
                ", пол: " + gender +
                ", владелец: " + owner +
                ", окрас: " + color +
                ']';
    }
}