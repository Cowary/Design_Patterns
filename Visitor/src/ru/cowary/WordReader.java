package ru.cowary;

public class WordReader implements Reader {
    @Override
    public String read() {
        return "Чтение файла формата Word";
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitWord(this);
    }
}
