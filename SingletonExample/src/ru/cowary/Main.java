package ru.cowary;

public class Main {

    public static void main(String[] args) {

        Singleton singleton_1 = Singleton.getInstance();

        Singleton singleton_2 = Singleton.getInstance();
    }
}
