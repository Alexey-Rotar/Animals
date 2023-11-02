package org.example;

import java.time.LocalDate;

public class Hamster extends Pet {
    String cmds;

    public Hamster(LocalDate dob, String gender, String name, String owner, String color, String cmds) {
        super (dob, gender, name, owner, color);
        this.cmds=cmds;
    }

    public String getCmds() { return cmds; }

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
        return "Хомяк [кличка: " + name +
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