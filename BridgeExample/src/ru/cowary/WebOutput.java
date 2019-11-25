package ru.cowary;

public class WebOutput implements Output {
    @Override
    public void printMessage(String message) {
        System.out.println("Вывод сообщения в браузер: " + message);

    }
}
