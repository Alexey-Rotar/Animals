package org.example;

import java.time.LocalDate;

class Animal {
    LocalDate dob;
    Gender gender;

    public LocalDate getDob() { return dob; }
    public Gender getGender() { return gender; }
    public void setDob(LocalDate dob) { this.dob=dob; }
    public void setGender(Gender gender) { this.gender=gender; }

    public Animal(LocalDate dob, Gender gender) {
        this.dob=dob;
        this.gender=gender;
    }

    public String getInfo() { return "Animal " + dob + ": " + gender; }

    public void setCmds(String s) {
    }
}