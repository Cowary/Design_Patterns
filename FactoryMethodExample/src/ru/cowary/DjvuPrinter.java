package ru.cowary;

public class DjvuPrinter implements Printer {
    @Override
    public void startPrint() {
        System.out.println("Печать документа формата Djvu");
    }
}
