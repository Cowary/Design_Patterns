package ru.cowary;

import java.util.Scanner;

public class TextMessenger implements Messenger {
    Network network;
    Scanner scanner;

    TextMessenger(Network network){
        this.network = network;
        scanner = new Scanner(System.in);
    }

    @Override
    public void sendMessage() {
        System.out.println("Введите сообщение");
        String mess = scanner.nextLine();
        System.out.println("Отправка сообщения: " + mess);
        network.sendByte(mess.getBytes());
    }

    @Override
    public void getMessage() {
        network.getByte();
        System.out.println("Вывод текстового сообщения");
    }
}
