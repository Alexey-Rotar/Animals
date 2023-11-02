package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Console {
    Scanner sc = new Scanner(System.in);
    int p;
    int count = 0;
    Map<Integer, Animal> animals = new HashMap<>();

    private void close(){
        System.out.println("Работа завершена.");
        System.exit(0);
    }

    public void menu() {
        System.out.println("\nВыберите действие:");
        System.out.println(" 1 - Завести животное");
        System.out.println(" 2 - Список животных");
        System.out.println(" 3 - Список команд");
        System.out.println(" 4 - Изменить команды");
        System.out.println(" 0 - Завершение работы");
        p = Integer.parseInt(sc.nextLine());
        switch (p) {
            case 1: addMenu(); break;
            case 2: viewAnimalsMenu(); break;
            case 3: viewCommandsMenu(); break;
            case 4: changeCommandsMenu(); break;
            case 0: close(); break;
            default: menu();
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
            case 1: add(p); break;
            case 2: add(p); break;
            case 3: add(p); break;
            case 4: add(p); break;
            case 5: add(p); break;
            case 6: add(p); break;
            case -1: menu(); break;
            case 0: close(); break;
            default: menu();
        }
    }

    private void viewAnimalsMenu() {
        System.out.println("Список животных:");
        if (animals.isEmpty())
            System.out.println(" - пусто -");
        else
            printAnimals(animals);
        System.out.println("Всего животных: " + count);
        System.out.println();
        System.out.println("-1 - Вернуться в предыдущее меню");
        System.out.println(" 0 - Завершение работы");
        p = Integer.parseInt(sc.nextLine());
        switch (p) {
            case -1: menu(); break;
            case 0: close(); break;
            default: menu();
        }
    }

    private void viewCommandsMenu() {
        if (animals.isEmpty())
            System.out.println(" - животные отсутствуют -");
        else
            printAnimals(animals);
        System.out.println();
        System.out.println("-1 - Вернуться в предыдущее меню");
        System.out.println(" 0 - Завершение работы");
        System.out.println("Введите ID животного для просмотра команд: ");
        p = Integer.parseInt(sc.nextLine());
        switch (p) {
            case -1: menu(); break;
            case 0: close(); break;
            default:
                System.out.println(" ID: " + p + " выполняет команды " + animals.get(p).getInfo());
                menu();
        }
    }

    private void changeCommandsMenu() {
        if (animals.isEmpty())
            System.out.println(" - животные отсутствуют -");
        else
            printAnimals(animals);
        System.out.println();
        System.out.println("-1 - Вернуться в предыдущее меню");
        System.out.println(" 0 - Завершение работы");
        System.out.println("Введите ID животного для изменения команд: ");
        p = Integer.parseInt(sc.nextLine());
        switch (p) {
            case -1: menu(); break;
            case 0: close(); break;
            default:
                System.out.println(" ID: " + p + " выполняет команды " + animals.get(p).getInfo());
                System.out.println("Введите новый список команд: ");
                changeCommand(p, sc.nextLine());
                menu();
        }
    }

    private void add(int type) {
        List<String> newInfo = getNewAnimal();
        animals.putIfAbsent(0, new Animal(null, null));
        switch (type) {
            case 1: animals.put(++count, new Cat(LocalDate.of(Integer.parseInt(newInfo.get(0)), Integer.parseInt(newInfo.get(1)), Integer.parseInt(newInfo.get(2))),
                    newInfo.get(3), newInfo.get(4), newInfo.get(5), newInfo.get(6), newInfo.get(7))); break;
            case 2: animals.put(++count, new Dog(LocalDate.of(Integer.parseInt(newInfo.get(0)), Integer.parseInt(newInfo.get(1)), Integer.parseInt(newInfo.get(2))),
                    newInfo.get(3), newInfo.get(4), newInfo.get(5), newInfo.get(6), newInfo.get(7))); break;
            case 3: animals.put(++count, new Hamster(LocalDate.of(Integer.parseInt(newInfo.get(0)), Integer.parseInt(newInfo.get(1)), Integer.parseInt(newInfo.get(2))),
                    newInfo.get(3), newInfo.get(4), newInfo.get(5), newInfo.get(6), newInfo.get(7))); break;
            case 4: animals.put(++count, new Horse(LocalDate.of(Integer.parseInt(newInfo.get(0)), Integer.parseInt(newInfo.get(1)), Integer.parseInt(newInfo.get(2))),
                    newInfo.get(3), newInfo.get(4), newInfo.get(5), newInfo.get(6), newInfo.get(7))); break;
            case 5: animals.put(++count, new Camel(LocalDate.of(Integer.parseInt(newInfo.get(0)), Integer.parseInt(newInfo.get(1)), Integer.parseInt(newInfo.get(2))),
                    newInfo.get(3), newInfo.get(4), newInfo.get(5), newInfo.get(6), newInfo.get(7))); break;
            case 6: animals.put(++count, new Donkey(LocalDate.of(Integer.parseInt(newInfo.get(0)), Integer.parseInt(newInfo.get(1)), Integer.parseInt(newInfo.get(2))),
                    newInfo.get(3), newInfo.get(4), newInfo.get(5), newInfo.get(6), newInfo.get(7))); break;
            default: addMenu();
        }
        menu();
    }

    private List<String> getNewAnimal(){
        List<String> newAnimal = new ArrayList<>();
        System.out.println("Введите год рождения (yyyy):");
        newAnimal.add(sc.nextLine());
        System.out.println("Введите месяц рождения (mm):");
        newAnimal.add(sc.nextLine());
        System.out.println("Введите день рождения (dd):");
        newAnimal.add(sc.nextLine());
        System.out.println("Укажите пол (m/f):");
        newAnimal.add(sc.nextLine());
        System.out.println("Введите кличку:");
        newAnimal.add(sc.nextLine());
        System.out.println("Введите владельца:");
        newAnimal.add(sc.nextLine());
        System.out.println("Введите окрас:");
        newAnimal.add(sc.nextLine());
        System.out.println("Введите команды:");
        newAnimal.add(sc.nextLine());
        return newAnimal;
    }

    private void changeCommand(int id, String str) {
        animals.get(id).setData(str);
    }

    private void printAnimals(Map<Integer, Animal> animals) {
        for (int i = 1; i < animals.size(); i++){
            System.out.println(" ID: " + i + " - " + animals.get(i));
        }
    }

}