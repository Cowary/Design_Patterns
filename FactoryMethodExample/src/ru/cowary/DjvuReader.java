package ru.cowary;

public class DjvuReader extends Reader {
    @Override
    public void read() {
        System.out.println("Чтение файла формата djvu");
    }

    @Override
    public Printer createPrinter() {
        return new DjvuPrinter();
    }
}
