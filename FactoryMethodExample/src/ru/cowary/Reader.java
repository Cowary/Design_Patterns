package ru.cowary;

public abstract class Reader {
    public void print(){
        Printer printer = createPrinter();
        printer.startPrint();
    }
    public abstract void read();
    public abstract Printer createPrinter();


}
