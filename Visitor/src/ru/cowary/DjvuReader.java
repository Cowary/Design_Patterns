package ru.cowary;



public class DjvuReader implements Reader {
    @Override
    public String read() {
        return "Чтение файла формата djvu";
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitDjvu(this);
    }
}
