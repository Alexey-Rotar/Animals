package org.example;

import java.time.LocalDate;

public class Cat extends Pet {
    String cmds;

    public Cat(LocalDate dob, String gender, String name, String owner, String color, String cmds) {
        super (dob, gender, name, owner, color);
        this.cmds=cmds;
    }

    public String getCmds() { return cmds; }

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
        return "Кошка [кличка: " + name +
                ", дата рождения: " + dob +
                ", пол: " + gender +
                ", владелец: " + owner +
                ", окрас: " + color +']';
    }

    @Override
    public String getInfo() {
        return cmds;
    }

    @Override
    public void setData(String cmds) {
        this.cmds = cmds;
    }
}