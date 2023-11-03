package org.example;

import java.time.LocalDate;

public class Horse extends PackAnimal {
    String cmds;

    public String getCmds() { return cmds; }
    public void setCmds(String cmds) { this.cmds = cmds; }

    public Horse(LocalDate dob, Gender gender, String name, String owner, String color, String cmds) {
        super (dob, gender, name, owner, color);
        this.cmds=cmds;
    }

    public Horse() {
        this (null, null, null, null, null, null);
    }

    public void neigh() {
        System.out.printf("%s is neighing...\n", getName());
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
    @Override
    public String toString() {
        return "Лошадь [" + name +
                ", " + dob +
                ", " + gender +
                ", " + color + "], владелец: " + owner;
    }

    @Override
    public String getInfo() {
        return cmds;
    }

}