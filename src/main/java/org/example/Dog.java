package org.example;

import java.time.LocalDate;

public class Dog extends Pet {
    public Dog(LocalDate dob, String gender, String name, String owner, String color) {
        super (dob, gender, name, owner, color);
    }

    public void bark() {
        System.out.printf("%s is barking...\n", getName());
    }

    public void lie() {
        System.out.printf("%s is lying...\n", getName());
    }

    public void sit() {
        System.out.printf("%s is sitting...\n", getName());
    }

    public void stand() {
        System.out.printf("%s is standing...\n", getName());
    }

    public void play() {
        System.out.printf("%s is playing...\n", getName());
    }

    public void swim() {
        System.out.printf("%s is swimming...\n", getName());
    }
}
