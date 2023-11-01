package org.example;

import java.time.LocalDate;

public class Main
{
    public static void main(String[] args) {
        Pet dog1 = new Pet(LocalDate.of(2013, 02, 14),
                "female", "Aina", "Alexey", "White with black spots");
        dog1.move();
        Donkey don1 = new Donkey(LocalDate.of(2020, 7, 28),
                "male", "Murgab", "Juma", "Grey");
        don1.iaaa();
    }
}
