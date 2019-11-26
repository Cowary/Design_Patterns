package ru.cowary;

public class Main {

    public static void main(String[] args) {
	    AbstractFactory factory;
	    Reader reader;
	    Printer printer;
	    factory = FactoryProducer.getFactory("Word");
	    reader = factory.createReader();
	    printer = factory.createPrinter();
	    System.out.println(reader.read());
	    System.out.println(printer.print());

        factory = FactoryProducer.getFactory("PDF");
        reader = factory.createReader();
        printer = factory.createPrinter();
        System.out.println(reader.read());
        System.out.println(printer.print());

        factory = FactoryProducer.getFactory("Djvu");
        reader = factory.createReader();
        printer = factory.createPrinter();
        System.out.println(reader.read());
        System.out.println(printer.print());

    }
}
