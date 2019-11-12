package ru.cowary;

public interface Visitor {
    String visitDjvu(DjvuReader djvuReader);
    String visitPDF(PDFreader pdfReader);
    String visitWord(WordReader wordReader);
}
