package ru.cowary;

public class DocumentManager {
    private Reader reader;
    private Printer printer;

    public DocumentManager(AbstractFactory factory){
        reader = factory.createReader();
        printer = factory.createPrinter();
    }
    public void print(){
        printer.print();
    }
    public void read(){
        reader.read();
    }
}
