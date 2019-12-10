package ru.cowary;

public class PdfPrinter implements Printer {
    @Override
    public void startPrint() {
        System.out.println("Печаь документа формата PDF");
    }
}
