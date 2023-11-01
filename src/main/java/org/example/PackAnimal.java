package org.example;

import java.time.LocalDate;

class PackAnimal extends Animal {
    String name;
    String owner;
    String color;

    public String getName() { return name; }
    public String getOwner() { return owner; }
    public String getColor() { return color; }

    public PackAnimal(LocalDate dob, String gender, String name, String owner, String color) {
        super(dob, gender);
        this.name=name;
        this.owner=owner;
        this.color=color;
    }

    public void graze() {
        System.out.printf("%s is grazing!\n", getName());
    }
}
