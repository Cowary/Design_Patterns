package ru.cowary;

public class PdfPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Печать документа формата PDF");
        }
}
