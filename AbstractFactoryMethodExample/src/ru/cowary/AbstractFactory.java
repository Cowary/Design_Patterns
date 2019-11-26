package ru.cowary;

public interface AbstractFactory {
    Reader createReader();
    Printer createPrinter();
}
