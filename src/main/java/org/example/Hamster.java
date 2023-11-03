package org.example;

import java.time.LocalDate;

public class Hamster extends Pet {
    String cmds;

    public String getCmds() { return cmds; }
    public void setCmds(String cmds) { this.cmds = cmds; }

    public Hamster(LocalDate dob, Gender gender, String name, String owner, String color, String cmds) {
        super (dob, gender, name, owner, color);
        this.cmds=cmds;
    }

    public Hamster() {
        this (null, null, null, null, null, null);
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

    @Override
    public String toString() {
        return "Хомяк [" + name +
                ", " + dob +
                ", " + gender +
                ", " + color + "], владелец: " + owner;
    }

    @Override
    public String getInfo() {
        return cmds;
    }

}