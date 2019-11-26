package ru.cowary;

public class DjvuFactory implements AbstractFactory {
    @Override
    public Reader createReader() {
        return new DjvuReader();
    }

    @Override
    public Printer createPrinter() {
        return new DjvuPrinter();
    }
}
