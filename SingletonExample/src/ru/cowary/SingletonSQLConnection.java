package ru.cowary;

public class SingletonSQLConnection {
    private static SingletonSQLConnection singletonSQLConnection;

    private SingletonSQLConnection(){
        System.out.println("Первичная установка связи с базой данной");
        System.out.println("Одиночка создан");
    }

    public static SingletonSQLConnection getInstance(){
        if(singletonSQLConnection == null){
            singletonSQLConnection = new SingletonSQLConnection();
        }
        System.out.println("Связь уже установлена");
        System.out.println("Одиночка возращен");
        return singletonSQLConnection;
    }
}
