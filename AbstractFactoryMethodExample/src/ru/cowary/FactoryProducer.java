package ru.cowary;

public class FactoryProducer {
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
