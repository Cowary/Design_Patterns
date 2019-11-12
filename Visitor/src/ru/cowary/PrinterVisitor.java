package ru.cowary;

public class PrinterVisitor implements Visitor {
    @Override
    public String visitDjvu(DjvuReader djvuReader) {
        return "Печать файла формата Djvu";
    }

    @Override
    public String visitPDF(PDFreader pdfReader) {
        return "Печать файла формата PDF";
    }

    @Override
    public String visitWord(WordReader wordReader) {
        return "Печать файла формата Word";
    }
}
