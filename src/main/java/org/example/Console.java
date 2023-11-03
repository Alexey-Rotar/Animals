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
    int id = 0;
    Map<Integer, Animal> animals = new HashMap<>();

    private void exit() {
        System.out.println("Работа завершена.");
        sc.close();
        System.exit(0);
    }

    public void menu() {
        System.out.println("\nВыберите действие:");
        System.out.println(" 1 - Внести животное");
        System.out.println(" 2 - Просмотр животных");
        System.out.println(" 3 - Просмотр команд");
        System.out.println(" 4 - Изменить команды");
        System.out.println(" 0 - Завершение работы");
        p = Integer.parseInt(sc.nextLine());
        switch (p) {
            case 1 -> addMenu();
            case 2 -> viewAnimalsMenu();
            case 3 -> viewCommandsMenu();
            case 4 -> changeCommandsMenu();
            case 0 -> exit();
            default -> menu();
        }
    }

    private void addMenu() {
        System.out.println("\nКого добавить? Выберите пункт меню.");
        System.out.println(" 1 - Кот");
        System.out.println(" 2 - Собака");
        System.out.println(" 3 - Хомяк");
        System.out.println(" 4 - Лошадь");
        System.out.println(" 5 - Верблюд");
        System.out.println(" 6 - Осёл");
        System.out.println("-1 - Вернуться в главное меню");
        System.out.println(" 0 - Завершение работы");
        p = Integer.parseInt(sc.nextLine());
        switch (p) {
            case 1, 2, 3, 4, 5, 6 -> add(p);
            case -1 -> menu();
            case 0 -> exit();
            default -> {
                System.out.println("Выбран неверный пункт!");
                addMenu();
            }
        }
    }

    private void defMenu() {
        System.out.println();
        System.out.println("-1 - Вернуться в главное меню");
        System.out.println(" 0 - Завершение работы");
        p = Integer.parseInt(sc.nextLine());
        switch (p) {
            case 0 -> exit();
            default -> menu();
        }
    }

    private void viewAnimalsMenu() {
        System.out.println("Список животных:");
        if (animals.size() <= 1)
            System.out.println("< пусто >");
        else
            printAnimals(animals);
        defMenu();
    }

    private void viewCommandsMenu() {
        if (animals.size() <= 1) {
            System.out.println("< животные отсутствуют >");
            defMenu();
        }
        else {
            printAnimals(animals);
            System.out.println("\n-1 - Вернуться в главное меню");
            System.out.println(" 0 - Завершение работы");
            System.out.println("Введите ID животного для просмотра команд: ");
            p = Integer.parseInt(sc.nextLine());
            switch (p) {
                case -1 -> menu();
                case 0 -> exit();
                default -> {
                    System.out.println(" ID: " + p + " выполняет команды " + animals.get(p).getInfo());
                    defMenu();
                }
            }
        }
    }

    private void changeCommandsMenu() {
        if (animals.size() <= 1) {
            System.out.println("< животные отсутствуют >");
            defMenu();
        }
        else {
            printAnimals(animals);
            System.out.println("\n-1 - Вернуться в предыдущее меню");
            System.out.println(" 0 - Завершение работы");
            System.out.println("Введите ID животного для изменения команд: ");
            p = Integer.parseInt(sc.nextLine());
            switch (p) {
                case -1 -> menu();
                case 0 -> exit();
                default -> {
                    System.out.println(" ID: " + p + " выполняет команды " + animals.get(p).getInfo());
                    System.out.println("Введите новый список команд: ");
                    changeCommand(p, sc.nextLine());
                    defMenu();
                }
            }
        }
    }

    private void add(int type) {
        try(Counter count = new Counter())
        {
            List<String> newInfo = getNewAnimal();
            animals.putIfAbsent(0, new Animal(null, null));
            Gender g;
            if (newInfo.get(3).equals("m"))
                g = Gender.m;
            else if (newInfo.get(3).equals("f"))
                g = Gender.f;
            else
                g = null;
            switch (type) {
                case 1 -> animals.put(++id, new Cat(LocalDate.of(Integer.parseInt(newInfo.get(0)),
                        Integer.parseInt(newInfo.get(1)), Integer.parseInt(newInfo.get(2))),
                                g, newInfo.get(4), newInfo.get(5), newInfo.get(6), newInfo.get(7)));
                case 2 -> animals.put(++id, new Dog(LocalDate.of(Integer.parseInt(newInfo.get(0)),
                        Integer.parseInt(newInfo.get(1)), Integer.parseInt(newInfo.get(2))),
                                g, newInfo.get(4), newInfo.get(5), newInfo.get(6), newInfo.get(7)));
                case 3 -> animals.put(++id, new Hamster(LocalDate.of(Integer.parseInt(newInfo.get(0)),
                        Integer.parseInt(newInfo.get(1)), Integer.parseInt(newInfo.get(2))),
                                g, newInfo.get(4), newInfo.get(5), newInfo.get(6), newInfo.get(7)));
                case 4 -> animals.put(++id, new Horse(LocalDate.of(Integer.parseInt(newInfo.get(0)),
                        Integer.parseInt(newInfo.get(1)), Integer.parseInt(newInfo.get(2))),
                                g, newInfo.get(4), newInfo.get(5), newInfo.get(6), newInfo.get(7)));
                case 5 -> animals.put(++id, new Camel(LocalDate.of(Integer.parseInt(newInfo.get(0)),
                        Integer.parseInt(newInfo.get(1)), Integer.parseInt(newInfo.get(2))),
                                g, newInfo.get(4), newInfo.get(5), newInfo.get(6), newInfo.get(7)));
                case 6 -> animals.put(++id, new Donkey(LocalDate.of(Integer.parseInt(newInfo.get(0)),
                        Integer.parseInt(newInfo.get(1)), Integer.parseInt(newInfo.get(2))),
                                g, newInfo.get(4), newInfo.get(5), newInfo.get(6), newInfo.get(7)));
                default -> defMenu();
            }
            count.add();
            System.out.println("\nДанные внесены!");
            menu();
        }
        catch(Exception ex) {
            animals.remove(id);
            id--;
            System.out.println("\nОшибка в формате данных!");
            defMenu();
        }
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
        animals.get(id).setCmds(str);
        System.out.println("\nИзменения внесены.");
    }

    private void printAnimals(Map<Integer, Animal> animals) {
        if (!animals.isEmpty()) {
            for (int i = 1; i < animals.size(); i++){
                System.out.println(" ID " + i + ": " + animals.get(i));
            }
            System.out.println("Всего животных: " + (animals.size() - 1));
        }
    }

}