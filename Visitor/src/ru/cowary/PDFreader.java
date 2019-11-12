package ru.cowary;

public class PDFreader implements Reader {
    @Override
    public String read() {
        return "Чтение файла формата PDF";
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitPDF(this);
    }
}
