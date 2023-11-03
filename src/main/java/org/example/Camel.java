package org.example;

import java.time.LocalDate;

public class Camel extends PackAnimal {
    String cmds;

    public String getCmds() { return cmds; }
    public void setCmds(String cmds) { this.cmds = cmds; }

    public Camel(LocalDate dob, Gender gender, String name, String owner, String color, String cmds) {
        super (dob, gender, name, owner, color);
        this.cmds=cmds;
    }

    public Camel() {
        this (null, null, null, null, null, null);
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
        return "Верблюд [" + name +
                ", " + dob +
                ", " + gender +
                ", " + color + "], владелец: " + owner;
    }

    @Override
    public String getInfo() {
        return cmds;
    }

}