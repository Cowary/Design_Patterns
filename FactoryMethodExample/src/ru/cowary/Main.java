package ru.cowary;

public class Main {

    public static void main(String[] args) {
	    Reader reader;
	    reader = getReader("word");
	    reader.read();
	    reader.print();
	    reader = getReader("PDF");
		reader.read();
		reader.print();
	    reader = getReader("djvu");
		reader.read();
		reader.print();
    }

	public static Reader getReader(String nameReader){
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
