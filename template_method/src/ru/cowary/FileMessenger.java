package ru.cowary;

import java.util.Scanner;

public class FileMessenger extends Messenger {

    @Override
    public void inputMessage() {
        System.out.println("Введите путь файла для отправки");
        String path = scanner.nextLine();
        System.out.println("Считывание файла по адресу: " + path);
    }

    @Override
    public void outputMessage() {
        System.out.println("сохранение файла от пользователя: " + get_addressName);
    }
}
