package org.example;

import java.time.LocalDate;

public class Horse extends PackAnimal {
    public Horse(LocalDate dob, String gender, String name, String owner, String color) {
        super (dob, gender, name, owner, color);
    }

    public void neighs() {
        System.out.printf("%s is neighsing...\n", getName());
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
}
