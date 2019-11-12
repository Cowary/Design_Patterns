package ru.cowary;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class TextMessager extends Messenger {

    @Override
    public void inputMessage() {
        System.out.println("Введите сообщение");
        send_message = scanner.nextLine().getBytes();
    }

    @Override
    public void outputMessage() {
        try {
            System.out.println("Вывод текстового сообщения: " + new String(get_message, "UTF-8") + " от пользователя: " + get_addressName);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
