package ru.cowary;

public class PdfFactory implements AbstractFactory {
    @Override
    public Reader createReader() {
        return new PdfReader();
    }

    @Override
    public Printer createPrinter() {
        return new PdfPrinter();
    }
}
