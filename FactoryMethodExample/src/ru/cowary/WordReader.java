package ru.cowary;

public class WordReader extends Reader {
    @Override
    public void read() {
        System.out.println("Чтение файла формата Word");
    }

    @Override
    public Printer createPrinter() {
        return new WordPrinter();
    }
}
