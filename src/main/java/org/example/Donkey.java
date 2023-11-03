package org.example;

import java.time.LocalDate;

public class Donkey extends PackAnimal {
    String cmds;

    public String getCmds() { return cmds; }
    public void setCmds(String cmds) { this.cmds = cmds; }

    public Donkey(LocalDate dob, Gender gender, String name, String owner, String color, String cmds) {
        super (dob, gender, name, owner, color);
        this.cmds=cmds;
    }

    public Donkey() {
        this (null, null, null, null, null, null);
    }

    public void ia() {
        System.out.printf("%s is iaing...\n", getName());
    }

    public void iaaa() {
        System.out.printf("%s is saying iaaa-iaaa-iaaa!\n", getName());
    }

    public void pull() {
        System.out.printf("%s is pulling...\n", getName());
    }

    @Override
    public String toString() {
        return "Осёл [" + name +
                ", " + dob +
                ", " + gender +
                ", " + color + "], владелец: " + owner;
    }

    @Override
    public String getInfo() {
        return cmds;
    }

}
