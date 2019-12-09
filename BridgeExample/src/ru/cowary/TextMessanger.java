package ru.cowary;

import java.util.Scanner;

public class TextMessanger implements Messanger {
    Output output;
    Scanner scanner = new Scanner(System.in);
    String message;

    public TextMessanger(Output output){
        this.output = output;
    }

    @Override
    public void inputMessage() {
        System.out.println("Введите сообщение");
        message = scanner.nextLine();
    }

    @Override
    public void printMessage() {
        output.printMessage(message);
    }
}
