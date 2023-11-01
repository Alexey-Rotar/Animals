package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Console {
    Scanner sc = new Scanner(System.in);
    int p;
    List<Animal> animals = new ArrayList<>();

    private void close(){
        System.out.println("Работа завершена.");
        System.exit(0);
    }
    public void menu() {
        System.out.println("Выберете действие:");
        System.out.println(" 1 - Завести животное");
        System.out.println(" 2 - Список животных");
        System.out.println(" 3 - Список команд");
        System.out.println(" 0 - Завершение работы");
        p = Integer.parseInt(sc.nextLine());
        switch (p) {
            case 1 -> addMenu();
            case 2 -> viewAnimalsMenu();
            case 3 -> viewCommandsMenu();
            case 0 -> close();
            default -> {
                System.out.println("Ошибка при выборе пункта меню!");
                menu();
            }
        }
    }

    private void addMenu() {
        System.out.println("Кого добавить?");
        System.out.println(" 1 - Кот");
        System.out.println(" 2 - Собака");
        System.out.println(" 3 - Хомяк");
        System.out.println(" 4 - Лошадь");
        System.out.println(" 5 - Верблюд");
        System.out.println(" 6 - Осёл");
        System.out.println();
        System.out.println("-1 - Вернуться в предыдущее меню");
        System.out.println(" 0 - Завершение работы");
        p = Integer.parseInt(sc.nextLine());
        switch (p) {
            case 1, 2, 3, 4, 5, 6 -> add(p);
            case -1 -> menu();
            case 0 -> close();
            default -> {
                System.out.println("Ошибка при выборе пункта меню!");
                menu();
            }
        }
    }

    private void viewAnimalsMenu() {
        System.out.println("Список животных:");
        if (animals.isEmpty())
            System.out.println("- пусто -");
        else
            printAnimals(animals);
        System.out.println("Всего животных: " + animals.size());
        System.out.println();
        System.out.println("-1 - Вернуться в предыдущее меню");
        System.out.println(" 0 - Завершение работы");
        p = Integer.parseInt(sc.nextLine());
        switch (p) {
            case -1 -> menu();
            case 0 -> close();
            default -> {
                System.out.println("Ошибка при выборе пункта меню!");
                menu();
            }
        }
    }

    private void viewCommandsMenu() {
        System.out.println("Выберете животное для просмотра команд:");
        if (animals.isEmpty())
            System.out.println("- животные отсутствуют -");
        else
            printAnimals(animals);
        System.out.println();
        System.out.println("-1 - Вернуться в предыдущее меню");
        System.out.println(" 0 - Завершение работы");
        p = Integer.parseInt(sc.nextLine());
        switch (p) {
            case -1 -> menu();
            case 0 -> close();
            default -> {
                System.out.println("Ошибка при выборе пункта меню!");
                menu();
            }
        }
    }

    public void add(int type) {
        List<String> newInfo = getNewAnimal();
        switch (type) {
            case 1 -> animals.add(new Cat(LocalDate.of(Integer.parseInt(newInfo.get(0)), Integer.parseInt(newInfo.get(1)), Integer.parseInt(newInfo.get(2))),
                    newInfo.get(3), newInfo.get(4), newInfo.get(5), newInfo.get(6)));
            case 2 -> animals.add(new Dog(LocalDate.of(Integer.parseInt(newInfo.get(0)), Integer.parseInt(newInfo.get(1)), Integer.parseInt(newInfo.get(2))),
                    newInfo.get(3), newInfo.get(4), newInfo.get(5), newInfo.get(6)));
            case 3 -> animals.add(new Hamster(LocalDate.of(Integer.parseInt(newInfo.get(0)), Integer.parseInt(newInfo.get(1)), Integer.parseInt(newInfo.get(2))),
                    newInfo.get(3), newInfo.get(4), newInfo.get(5), newInfo.get(6)));
            case 4 -> animals.add(new Horse(LocalDate.of(Integer.parseInt(newInfo.get(0)), Integer.parseInt(newInfo.get(1)), Integer.parseInt(newInfo.get(2))),
                    newInfo.get(3), newInfo.get(4), newInfo.get(5), newInfo.get(6)));
            case 5 -> animals.add(new Camel(LocalDate.of(Integer.parseInt(newInfo.get(0)), Integer.parseInt(newInfo.get(1)), Integer.parseInt(newInfo.get(2))),
                    newInfo.get(3), newInfo.get(4), newInfo.get(5), newInfo.get(6)));
            case 6 -> animals.add(new Donkey(LocalDate.of(Integer.parseInt(newInfo.get(0)), Integer.parseInt(newInfo.get(1)), Integer.parseInt(newInfo.get(2))),
                    newInfo.get(3), newInfo.get(4), newInfo.get(5), newInfo.get(6)));
            default -> {
                System.out.println("Ошибка при выборе пункта меню!");
                menu();
            }
        }
        menu();
    }

    public List<String> getNewAnimal(){
        List<String> newAnimal = new ArrayList<>();
        System.out.println("Введите год рождения в формате \"YYYY\":");
        newAnimal.add(sc.nextLine());
        System.out.println("Введите месяц рождения в формате \"M\":");
        newAnimal.add(sc.nextLine());
        System.out.println("Введите день рождения в формате \"D\":");
        newAnimal.add(sc.nextLine());
        System.out.println("Укажите пол (m - мужской, f - женский):");
        newAnimal.add(sc.nextLine());
        System.out.println("Введите кличку (\"-\" при отсутствии):");
        newAnimal.add(sc.nextLine());
        System.out.println("Введите владельца (\"-\" при отсутствии):");
        newAnimal.add(sc.nextLine());
        System.out.println("Введите окрас (\"-\" при отсутствии):");
        newAnimal.add(sc.nextLine());
        return newAnimal;
    }

    public void printAnimals(List<Animal> animals) {
        for (Animal item : animals) {
            System.out.println(item);
        }
    }

}
