package ru.cowary;

public interface Reader {
    public String read();
    public String accept(Visitor visitor);
}
