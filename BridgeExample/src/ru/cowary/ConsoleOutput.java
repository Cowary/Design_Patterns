package ru.cowary;

public class ConsoleOutput implements Output {
    @Override
    public void printMessage(String message) {
        System.out.println("Вывод сообщения в консоль: " + message);

    }
}
