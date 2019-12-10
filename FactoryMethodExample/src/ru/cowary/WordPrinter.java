package ru.cowary;

public class WordPrinter implements Printer {
    @Override
    public void startPrint() {
        System.out.println("Печать документа формата Word");
    }
}
