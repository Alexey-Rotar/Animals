package org.example;

import java.time.LocalDate;

public class Dog extends Pet {
    String cmds;

    public String getCmds() { return cmds; }
    public void setCmds(String cmds) { this.cmds = cmds; }

    public Dog(LocalDate dob, Gender gender, String name, String owner, String color, String cmds) {
        super (dob, gender, name, owner, color);
        this.cmds=cmds;
    }

    public Dog() {
        this (null, null, null, null, null, null);
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

    @Override
    public String toString() {
        return "Собака [" + name +
                ", " + dob +
                ", " + gender +
                ", " + color + "], владелец: " + owner;
    }

    @Override
    public String getInfo() {
        return cmds;
    }

}