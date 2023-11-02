package org.example;

import java.time.LocalDate;

public class Camel extends PackAnimal {
    String cmds;

    public Camel(LocalDate dob, String gender, String name, String owner, String color, String cmds) {
        super (dob, gender, name, owner, color);
        this.cmds=cmds;
    }

    public String getCmds() { return cmds; }

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
        return "Верблюд [кличка: " + name +
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