package org.example;

import java.time.LocalDate;

class Animal {
    LocalDate dob;
    String gender;

    public LocalDate getDob() { return dob; }
    public String getGender() { return gender; }

    public Animal(LocalDate dob, String gender) {
        this.dob=dob;
        this.gender=gender;
    }

    public void display() {
        System.out.println(dob + ": " + gender);
    }
}