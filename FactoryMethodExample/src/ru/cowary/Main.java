package ru.cowary;

public class Main {

    public static void main(String[] args) {
	    ReaderFactory readerFactory = new ReaderFactory();
	    Reader reader;
	    reader = readerFactory.getReader("word");
	    System.out.println(reader.read());
	    reader = readerFactory.getReader("PDF");
		System.out.println(reader.read());
	    reader = readerFactory.getReader("djvu");
		System.out.println(reader.read());
    }
}
