package ru.cowary;

public class ReaderFactory {
    public Reader getReader(String nameReader){
        if(nameReader.toLowerCase().equals("djvu")){
            return new DjvuReader();
        }else if(nameReader.toLowerCase().equals("pdf")){
            return new PdfReader();
        }else if(nameReader.toLowerCase().equals("word")){
            return new WordReader();
        }
        return null;
    }
}
