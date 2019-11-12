package ru.cowary;

import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) {
        Reader djvuReader = new DjvuReader();
        Reader pdFreader = new PDFreader();
        Reader wordReader = new WordReader();

        PrinterVisitor printerVisitor = new PrinterVisitor();

        System.out.println("Чтение файлов: \n" +
                djvuReader.read() + "\n" +
                pdFreader.read() + "\n" +
                wordReader.read() + "\n");

        System.out.println("Печать файлов: \n" +
                djvuReader.accept(printerVisitor) + "\n" +
                pdFreader.accept(printerVisitor) + "\n" +
                wordReader.accept(printerVisitor) + "\n");

    }
}
