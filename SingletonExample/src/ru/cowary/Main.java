package ru.cowary;

public class Main {

    public static void main(String[] args) {

        SingletonSQLConnection singleton_SQLConnection_1 = SingletonSQLConnection.getInstance();

        SingletonSQLConnection singleton_SQLConnection_2 = SingletonSQLConnection.getInstance();
    }
}
