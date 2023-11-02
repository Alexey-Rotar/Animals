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

    public String getInfo() { return "Animal " + dob + ": " + gender; }

    public void setData(String gender) {
        this.gender = gender;
    }
}