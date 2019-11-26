package ru.cowary;

public class WordFactory implements AbstractFactory {
    @Override
    public Reader createReader() {
        return new WordReader();
    }

    @Override
    public Printer createPrinter() {
        return new WordPrinter();
    }
}
