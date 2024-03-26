package org.example;

public class Tester {
    private String name;
    private String surname;
    private int expirienceInYears;
    private String englishLevel;
    private double salary;

    public Tester() {
        this("Не определено", "Не определено", 0, "Не определено", 0.0);
    }

    public Tester(String name, String surname) {
        this(name, surname, 0, "Не определено", 0.0);
    }

    public Tester(String name, String surname, int expirienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.expirienceInYears = expirienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("Имя: " + name + ", Фамилия: " + surname);
    }

    public void printInfo(int expirienceInYears) {
        System.out.println("Имя: " + name + ", Фамилия: " + surname + ", Опыт работы: " + expirienceInYears);
    }

    public void printInfo(int expirienceInYears, String englishLevel) {
        System.out.println("Имя: " + name + ", Фамилия: " + surname + ", Опыт работы: " + expirienceInYears + ", Уровень английского: " + englishLevel);
    }

    public static void staticMethod() {
        System.out.println("Это статический метод в классе Tester.");
    }
}
