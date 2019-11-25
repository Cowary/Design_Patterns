package ru.cowary;

public class Main {

    public static void main(String[] args) {
        TextMessanger textMessanger = new TextMessanger(new ConsoleOutput());
        textMessanger.inputMessage();
        textMessanger.printMessage();

        textMessanger = new TextMessanger(new WebOutput());
        textMessanger.inputMessage();
        textMessanger.printMessage();
    }
}
