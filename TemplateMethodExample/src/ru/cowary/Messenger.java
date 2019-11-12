package ru.cowary;

import java.util.Scanner;

public abstract class Messenger {
    byte[] send_message;
    byte[] get_message;
    String send_addressName;
    String get_addressName;

    Scanner scanner = new Scanner(System.in);
    public void inputAddressName(){
        System.out.println("Введите имя пользоваеля");
        send_addressName = scanner.nextLine();
    }
    public abstract void inputMessage();

    public void encryptMessage(){
        System.out.println("Шифрование сообщения");
    }

    public void sendMessage(){
        System.out.println("Отправка сообщения на пользователю: " + send_addressName);
    }

    public void getMessage(){
        System.out.println("Получение сообщения");
        this.get_message = send_message;
        this.get_addressName = send_addressName;
    }

    public void decryptMessage(){
        System.out.println("Расшифрование сообщения");
    }

    public abstract void outputMessage();
}
