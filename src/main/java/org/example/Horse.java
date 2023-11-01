package org.example;

import java.time.LocalDate;

public class Horse extends PackAnimal {
    public Horse(LocalDate dob, String gender, String name, String owner, String color) {
        super (dob, gender, name, owner, color);
    }

    public void neigh() {
        System.out.printf("%s is neighing...\n", getName());
    }

    public void ride() {
        System.out.printf("%s is riding...\n", getName());
    }

    public void gallop() {
        System.out.printf("%s is galloping...\n", getName());
    }

    public void plow() {
        System.out.printf("%s is plowing...\n", getName());
    }

    @Override
    public String toString() {
        return "[Вид: лошади, кличка: " + name +
                ", дата рождения: " + dob +
                ", пол: " + gender +
                ", владелец: " + owner +
                ", окрас: " + color +
                ']';
    }
}