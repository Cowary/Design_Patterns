package ru.cowary;

public class DjvuPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Печать документа формата Djvu");
    }
}
