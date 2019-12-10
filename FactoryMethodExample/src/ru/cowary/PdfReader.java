package ru.cowary;

public class PdfReader extends Reader {
    @Override
    public void read() {
        System.out.println("Чтение файла формата PDF");
    }

    @Override
    public Printer createPrinter() {
        return new PdfPrinter();
    }
}
