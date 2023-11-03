package org.example;

import java.time.LocalDate;

public class Cat extends Pet {
    String cmds;

    public String getCmds() { return cmds; }
    public void setCmds(String cmds) { this.cmds = cmds; }

    public Cat(LocalDate dob, Gender gender, String name, String owner, String color, String cmds) {
        super (dob, gender, name, owner, color);
        this.cmds=cmds;
    }

    public Cat() {
        this (null, null, null, null, null, null);
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
        return "Кошка [" + name +
                ", " + dob +
                ", " + gender +
                ", " + color + "], владелец: " + owner;
    }

    @Override
    public String getInfo() {
        return cmds;
    }

}