package ru.cowary;

public class Main {

    public static void main(String[] args) {
	    AbstractFactory factory;
        DocumentManager documentManager;

	    factory = getFactory("Word");
	    documentManager = new DocumentManager(factory);
        documentManager.read();
        documentManager.print();

        factory = getFactory("PDF");
        documentManager = new DocumentManager(factory);
        documentManager.read();
        documentManager.print();

        factory = getFactory("Djvu");
        documentManager = new DocumentManager(factory);
        documentManager.read();
        documentManager.print();

    }
    public static AbstractFactory getFactory(String type){
        if(type.toLowerCase().equals("djvu")){
            return new DjvuFactory();
        }else if(type.toLowerCase().equals("pdf")){
            return new PdfFactory();
        }else if(type.toLowerCase().equals("word")){
            return new WordFactory();
        }
        return null;
    }
}
