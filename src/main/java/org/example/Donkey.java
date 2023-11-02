package org.example;

import java.time.LocalDate;

public class Donkey extends PackAnimal {
    String cmds;

    public Donkey(LocalDate dob, String gender, String name, String owner, String color, String cmds) {
        super (dob, gender, name, owner, color);
        this.cmds=cmds;
    }

    public String getCmds() { return cmds; }

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
        return "Осёл [кличка: " + name +
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
