package org.example;

import java.time.LocalDate;

public class Cat extends Pet {
    public Cat(LocalDate dob, String gender, String name, String owner, String color) {
        super (dob, gender, name, owner, color);
    }

    public void meow() {
        System.out.printf("%s is meowing...\n", getName());
    }

    public void lie() {
        System.out.printf("%s is lying...\n", getName());
    }

    public void sit() {
        System.out.printf("%s is sitting...\n", getName());
    }

    public void play() {
        System.out.printf("%s is playing...\n", getName());
    }

    @Override
    public String toString() {
        return "[Вид: кошки, кличка: " + name +
                ", дата рождения: " + dob +
                ", пол: " + gender +
                ", владелец: " + owner +
                ", окрас: " + color +
                ']';
    }
}