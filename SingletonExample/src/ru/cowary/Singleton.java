package ru.cowary;

public class Singleton {
    private static Singleton singleton;

    private Singleton(){
        System.out.println("Одиночка создан");
    }

    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        System.out.println("Одиночка возращен");
        return singleton;
    }
}
