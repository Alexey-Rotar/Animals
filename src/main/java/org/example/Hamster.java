package org.example;

import java.time.LocalDate;

public class Hamster extends Pet {
    public Hamster(LocalDate dob, String gender, String name, String owner, String color) {
        super (dob, gender, name, owner, color);
    }

    public void gnaw() {
        System.out.printf("%s is gnawing...\n", getName());
    }

    public void run() {
        System.out.printf("%s is running...\n", getName());
    }

    public void hide() {
        System.out.printf("%s is hiding...\n", getName());
    }

    public void chew() {
        System.out.printf("%s is chewing...\n", getName());
    }
}
